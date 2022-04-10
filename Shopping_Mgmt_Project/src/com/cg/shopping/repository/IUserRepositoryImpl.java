package com.cg.shopping.repository;

import javax.persistence.EntityManager;

import com.cg.shopping.entities.User;

public class IUserRepositoryImpl implements IUserRepository 
{
	//Step 1: Start JPA LifeCycle
	
	private EntityManager entityManager;
	public IUserRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	// Create operation - Repo/DAO
	
	@Override
	public User addUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		User update = entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(id);
		return user;
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
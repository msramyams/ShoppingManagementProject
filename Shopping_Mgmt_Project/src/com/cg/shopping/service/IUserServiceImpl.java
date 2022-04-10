package com.cg.shopping.service;

import com.cg.shopping.entities.User;
import com.cg.shopping.repository.IUserRepository;
import com.cg.shopping.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService

{
	// Step 1: Establishing connection between Service and Repo
	private IUserRepository dao;
	public IUserServiceImpl() 
	{
		dao = new IUserRepositoryImpl();
	}
	// Step 2: Service calls to perform CRUD Operation
	@Override
	public User addUser(User user) {
        dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
        dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
        dao.beginTransaction();
		//dao.login(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public boolean logOut() {
        dao.beginTransaction();
	    //dao.logout(null);
		dao.commitTransaction();
		return false;
	}
	
	
}


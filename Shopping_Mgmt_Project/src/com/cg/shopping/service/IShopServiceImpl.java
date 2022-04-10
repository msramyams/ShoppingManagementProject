package com.cg.shopping.service;

import com.cg.shopping.entities.Shop;
import com.cg.shopping.repository.IShopRepository;
import com.cg.shopping.repository.IShopRepositoryImpl;

public class IShopServiceImpl implements IShopService
{

	// Step 1: Establishing connection between Service and Repo
	
				private IShopRepository dao;
				
				public IShopServiceImpl() 
				{
					dao = new IShopRepositoryImpl();
				}
				
		// Step 2: Service calls to perform CRUD Operation

		@Override
		public Shop addShop(Shop shop) {
			dao.beginTransaction();
			dao.addShop(shop);
			dao.commitTrasaction();
			return shop;
		}

		@Override
		public Shop updateShop(Shop shop)
		{
			dao.beginTransaction();
			dao.updateShop(shop);
			dao.commitTrasaction();
			return shop;		
		}

		@Override
		public Shop searchShopById(int id)
		{
			Shop shop = dao.searchShopById(id);
			return shop;
		}

		@Override
		public Shop addEmployee(Shop shop) 
		{
			dao.beginTransaction();
			dao.addEmployee(shop);
			dao.commitTrasaction();
			return shop;
		}

		@Override
		public Shop updateEmployee(Shop shop) 
		{
			dao.beginTransaction();
			dao.updateEmployee(shop);
			dao.commitTrasaction();
			return shop;		
		}

		@Override
		public Shop deleteShop(Shop shop)
		{
			dao.beginTransaction();
			dao.deleteShop(shop);
			dao.commitTrasaction();
			return shop;
			
		}

		@Override
		public Shop addItem(Shop shop) {
			
			dao.beginTransaction();
			dao.addItem(shop);
			dao.commitTrasaction();
			return shop;
		}

}
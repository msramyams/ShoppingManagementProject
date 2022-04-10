package com.cg.shopping.service;

import com.cg.shopping.entities.Shop;

public interface IShopService 
{
	 public Shop addShop(Shop shop);
	    public Shop updateShop(Shop shop);
	    public Shop searchShopById(int id);
	    
	    public Shop addEmployee(Shop shop);
	    
	    public Shop updateEmployee(Shop shop);
	    
	    public Shop deleteShop(Shop shop);
	    
	    public Shop addItem(Shop shop);
    
}
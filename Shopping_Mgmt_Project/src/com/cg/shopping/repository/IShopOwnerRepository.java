package com.cg.shopping.repository;

import com.cg.shopping.entities.ShopOwner;

public interface IShopOwnerRepository 
{
      public ShopOwner addShopOwner(ShopOwner shopOwner);
      public ShopOwner updateShopOwner(ShopOwner shopOwner);
      public ShopOwner searchShopOwner(int id);
      public ShopOwner deleteShopOwner(int id);
}
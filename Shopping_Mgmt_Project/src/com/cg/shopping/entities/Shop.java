package com.cg.shopping.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class Shop
{
	@Id
	@Column(name="shop_id")
	 private int shopId;
	
	@Column(name="shop_Category")
    private String shopCategory;
	
//	@Column(name="shop Employee Id")
//    private String shopEmployeeId;  
	
	@Column(name="shop_Name")
    private String shopName;
	
//	@Column(name="customer")
//    private String customers;
	
	@Column(name="shop_status")
    private String shopStatus;
	
//	@Column(name="shop owner")
//    private ShopOwner shopOwner;
	
	@Column(name="lease_status")
    private String leaseStatus;

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

//	public String getShopEmployeeId() {
//		return shopEmployeeId;
//	}
//
//	public void setShopEmployeeId(String shopEmployeeId) {
//		this.shopEmployeeId = shopEmployeeId;
//	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

//	public String getCustomers() {
//		return customers;
//	}
//
//	public void setCustomers(String customers) {
//		this.customers = customers;
//	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

//	public String getShopOwner() {
//		return shopOwner;
//	}
//
//	public void setShopOwner(String shopOwner) {
//		this.shopOwner = shopOwner;
//	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}
}

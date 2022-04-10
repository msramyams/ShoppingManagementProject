package com.cg.shopping.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shop_owner")
public class ShopOwner 
{
	@Id
	@Column(name="id")
	 private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="address")//local date dob
	private String address;
	
//	@Column(name="shop_id")
//	private String shop_id;    //private Shop shop_id;
	
	
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public String getShop_id() {
//		return shop_id;
//	}
//	public void setShop_id(String shop_id) {
//		this.shop_id = shop_id;
//	}
	
	
}
package com.cg.shopping.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import java.util.List;
@Entity
@Table(name="customer")
public class Customer 
{
	//private static final long serialVersionUID = 1L;
@Id
@Column(name="customer_id")
private int id;

@Column(name="customer_name")
private String name;

//@Column(name="orders")
//private String 	orders;

@Column(name="phone")// List<OrderDetails> orders;
private String phone;

@Column(name="email")//long phone;
private String email;

public int getId() 
{
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
//public String getOrders() 
//{
//	return orders;
//}
//public void setOrders(String orders) 
//{
//	this.orders = orders;
//}
public String getPhone() 
{
	return phone;
}
public void setPhone(String phone) 
{
	this.phone = phone;
}
public String getEmail() 
{
	return email;
}
public void setEmail(String email) 
{
	this.email = email;
}
public Customer()
{
}


public Customer(int id, String name, String phone, String email) 
{
	this.id = id;
	this.name = name;
	
	this.phone = phone;
	this.email = email;
}
}


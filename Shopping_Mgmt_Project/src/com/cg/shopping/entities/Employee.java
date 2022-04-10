package com.cg.shopping.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 @Entity
 @Table(name="employee")
 
public class Employee implements Serializable{
	 
	 private static final long serialVersionUID = 1L;
	 @Id
	 
	 @Column(name="id")
private long id;
	 
	 @Column(name="name")
private String name;
	 
	 @Column(name="dob")
private String dob;
	 
	 @Column(name="salary")
private float salary;
	 
	 @Column(name="address")
private String address;
	 
	 @Column(name="designation")
private String designation;
	 
//	 @ManyToOne
//	 @JoinColumn(name="shopEmployees_Id")
//	 private Shop shopEmployees_Id;
//		
 // private Shop shop_id;

	
	public Employee() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

//	public Shop getShop() {
//		return shop_id;
//	}
//
//	public void setShop(Shop shop) {
//		this.shop_id = shop;
//	}
//	 
	
}


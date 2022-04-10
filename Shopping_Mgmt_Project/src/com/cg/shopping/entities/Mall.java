package com.cg.shopping.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mall")
public class Mall {
	@Id
	@Column(name = "mall_id")
	private int id;

	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "mallAdmin")
//	private MallAdmin mallAdmin;

	@Column(name = "mall_Name")
	private String mallName;

	@Column(name = "location")
	private String location;

//	@Column(name = "shops")
//	private List<Shop> shops;
	
	@Column(name="categories")
	private String categories;

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public MallAdmin getMallAdmin() {
		return mallAdmin;
	}
	/*public void setMallAdmin(MallAdmin mallAdmin) {
		this.mallAdmin = mallAdmin;
	}*/

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

//	public List<Shop> getShops() {
//		return shops;
//	}
//
//	public void setShops(List<Shop> shops) {
//		this.shops = shops;
//	}

	
	public Mall() {

	}
}
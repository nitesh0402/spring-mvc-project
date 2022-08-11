package com.OneToMany.pojo1;

public class Address {

	private int addId;
	private String addName;
	private String city;
	
	
	
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getAddName() {
		return addName;
	}
	public void setAddName(String addName) {
		this.addName = addName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addName=" + addName + ", city=" + city + "]";
	}


	
	
}

package com.model;

public class user {
	private int cust_id;
	private String fname;
	private String uname;
	private String phonenumber;
	private String gender;
	private String occupation;
	private String address;
	private String password;
	private int amount;
	private String bday;
	public user(int cust_id, String fname, String uname, String phonenumber, String gender, String occupation,
			String address, String password, int amount, String bday) {
		super();
		this.cust_id = cust_id;
		this.fname = fname;
		this.uname = uname;
		this.phonenumber = phonenumber;
		this.gender = gender;
		this.occupation = occupation;
		this.address = address;
		this.password = password;
		this.amount = amount;
		this.bday = bday;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBday() {
		return bday;
	}
	public void setBday(String bday) {
		this.bday = bday;
	}
	
	
}

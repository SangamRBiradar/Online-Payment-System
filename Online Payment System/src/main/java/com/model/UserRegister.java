package com.model;

import java.security.Timestamp;

public class UserRegister {
	private String fname;
	private String uname;
	private String phonenumber;
	private String gender;
	private String occupation;
	private String address;
	private String password;
	private String bday;
	public UserRegister(String fname, String uname, String phonenumber, String gender, String occupation,
			String address, String password, String bday) {
		super();
		this.fname = fname;
		this.uname = uname;
		this.phonenumber = phonenumber;
		this.gender = gender;
		this.occupation = occupation;
		this.address = address;
		this.password = password;
		this.bday = bday;
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
	public String getBday() {
		return bday;
	}
	public void setBday(String bday) {
		this.bday = bday;
	}
	
}

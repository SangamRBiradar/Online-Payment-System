package com.model;

public class transfermoney {
	private float amount;
	private String password;
	private int uid;
	private float currentamount;
	private String realpassword;
	private float bankamount;
	public transfermoney(float amount, String password, int uid, float currentamount, String realpassword,
			float bankamount) {
		super();
		this.amount = amount;
		this.password = password;
		this.uid = uid;
		this.currentamount = currentamount;
		this.realpassword = realpassword;
		this.bankamount = bankamount;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public float getCurrentamount() {
		return currentamount;
	}
	public void setCurrentamount(float currentamount) {
		this.currentamount = currentamount;
	}
	public String getRealpassword() {
		return realpassword;
	}
	public void setRealpassword(String realpassword) {
		this.realpassword = realpassword;
	}
	public float getBankamount() {
		return bankamount;
	}
	public void setBankamount(float bankamount) {
		this.bankamount = bankamount;
	}
	
	
}

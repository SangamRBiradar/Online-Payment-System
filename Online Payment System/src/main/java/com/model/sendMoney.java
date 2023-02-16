package com.model;

public class sendMoney {
	private int receiver_id;
	private float amount;
	private String password;
	private int user_id;
	private float pamount;
	private String rpassword;
	public sendMoney(int receiver_id, float amount, String password, int user_id, float pamount, String rpassword) {
		super();
		this.receiver_id = receiver_id;
		this.amount = amount;
		this.password = password;
		this.user_id = user_id;
		this.pamount = pamount;
		this.rpassword = rpassword;
	}
	public int getReceiver_id() {
		return receiver_id;
	}
	public void setReceiver_id(int receiver_id) {
		this.receiver_id = receiver_id;
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
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public float getPamount() {
		return pamount;
	}
	public void setPamount(float pamount) {
		this.pamount = pamount;
	}
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	
	
}

package com.model;

public class showhistory {
	private int cust_id;
	private float amount;
	private String status;
	private String date;
	public showhistory(int cust_id, float amount, String status, String date) {
		super();
		this.cust_id = cust_id;
		this.amount = amount;
		this.status = status;
		this.date = date;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}

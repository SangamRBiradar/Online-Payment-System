package com.model;

public class transaction {
	private int cust_id;
	private float amount;
	public transaction(int cust_id, float amount) {
		super();
		this.cust_id = cust_id;
		this.amount = amount;
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
	
	
}

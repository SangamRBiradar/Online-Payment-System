package com.model;

public class history {
	private int sender_id;
	private int receiver_id;
	private float amount;
	public history(int sender_id, int receiver_id, float amount) {
		super();
		this.sender_id = sender_id;
		this.receiver_id = receiver_id;
		this.amount = amount;
	}
	public int getSender_id() {
		return sender_id;
	}
	public void setSender_id(int sender_id) {
		this.sender_id = sender_id;
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
	

}

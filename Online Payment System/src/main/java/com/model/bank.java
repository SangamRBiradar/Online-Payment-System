package com.model;

public class bank {
	private int cust_id;
	private String bankname;
	private String Acc_holder_name;
	private int Account_Number;
	private String Account_type;
	private float Amount;
	public bank(int cust_id, String bankname, String acc_holder_name, int account_Number, String account_type,
			float amount) {
		super();
		this.cust_id = cust_id;
		this.bankname = bankname;
		Acc_holder_name = acc_holder_name;
		Account_Number = account_Number;
		Account_type = account_type;
		Amount = amount;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAcc_holder_name() {
		return Acc_holder_name;
	}
	public void setAcc_holder_name(String acc_holder_name) {
		Acc_holder_name = acc_holder_name;
	}
	public int getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(int account_Number) {
		Account_Number = account_Number;
	}
	public String getAccount_type() {
		return Account_type;
	}
	public void setAccount_type(String account_type) {
		Account_type = account_type;
	}
	public float getAmount() {
		return Amount;
	}
	public void setAmount(float amount) {
		Amount = amount;
	}
	
}

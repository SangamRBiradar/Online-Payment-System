package com.service;

import java.util.LinkedList;
import java.util.List;

import com.model.SearchCustomer;
import com.model.UserRegister;
import com.model.bank;
import com.model.message;
import com.model.profiledisplay;
import com.model.sendMoney;
import com.model.transfermoney;
import com.model.user;
import com.model.userlogin;

public interface servicedaointerface {
	public int userregister(UserRegister u);
	public int login(userlogin l);
	
	public UserRegister search(SearchCustomer s);
	public int transaction(com.model.transaction t);
	public profiledisplay profile(com.model.userlogin p);
	public int sendmoney(profiledisplay p,sendMoney s);
	public int sendbankmoney(profiledisplay p,transfermoney s);
	public message addmoney(com.model.profiledisplay p,sendMoney s,int i);
	public void history(com.model.history h);
	public LinkedList<com.model.showhistory> showtransactionhistory(int id);
	public int bankdetails(bank b);
	public bank bankinfo(int u);
	public int sendbankmoney(bank p,transfermoney s);

}

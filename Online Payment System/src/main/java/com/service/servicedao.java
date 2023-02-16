package com.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.List;

import com.model.SearchCustomer;
import com.model.UserRegister;
import com.model.bank;
// import com.model.employeelogin;
import com.model.message;
import com.model.profiledisplay;
import com.model.sendMoney;
import com.model.showhistory;
import com.model.transfermoney;
import com.model.user;
import com.model.userlogin;

public class servicedao implements servicedaointerface {
	static Connection con;

	@Override
	public int userregister(UserRegister u) {
		// TODO Auto-generated method stub
		int i = 0;
		con = myconnection.getcon();
		int j = 0;
		try {
			PreparedStatement ps = con
					.prepareStatement("insert into register(fname,uname,phonenumber,gender,occupation,address,password,amount,bday) values(?,?,?,?,?,?,?,0,?)");
			ps.setString(1, u.getFname());
			ps.setString(2, u.getUname());
			ps.setString(3, u.getPhonenumber());
			ps.setString(4, u.getGender());
			ps.setString(5, u.getOccupation());
			ps.setString(6, u.getAddress());
			ps.setString(7, u.getPassword());
			ps.setString(8, u.getBday());
//			ResultSet rs = ps.executeQuery();
			i = ps.executeUpdate();
			if (i > 0) {
				PreparedStatement ps1 = con.prepareStatement("select cust_id from register where PHONENUMBER = ?");
				ps1.setString(1, u.getPhonenumber());
				ResultSet rs = ps1.executeQuery();
				if (rs.next()) {
					j = rs.getInt(1);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return j;
	}

	@Override
	public int login(userlogin l) {
		user user = null;
		int i = 0;
		con = myconnection.getcon();
		try {
			String st1, st2 = null;
			PreparedStatement ps = con.prepareStatement("select * from register where uname =? and password = ? ");
			ps.setString(1, l.getUsername());
			ps.setString(2, l.getPassword());
			ResultSet r = ps.executeQuery();
			while (r.next()) {
					i = 1;
				

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}



	@Override
	public UserRegister search(SearchCustomer s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int transaction(com.model.transaction t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public profiledisplay profile(com.model.userlogin p) { 
		con = myconnection.getcon();
		profiledisplay rec = null;
		try {
			String st1, st2 = null;
			PreparedStatement ps = con.prepareStatement("select * from register");
			ResultSet   r = ps.executeQuery(); 
			while (r.next()) {
				st1 = r.getString(3);
				System.out.println(r.getString(3));
				if (st1.contentEquals(p.getUsername())) {
	 				System.out.println("hii");

					rec = new profiledisplay(r.getInt(1), r.getString(2), r.getString(3), r.getString(4),
							r.getString(5), r.getString(6), r.getString(7), r.getString(8), r.getFloat(9),
							r.getString(10));
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rec;

	}

	@Override
	public int sendmoney(profiledisplay p, sendMoney s) {
		// TODO Auto-generated method stub
		System.out.println("hey2");

		message msg = null;
		int i = 0;
		int j = 0;
		con = myconnection.getcon();
		try {

			PreparedStatement ps = con.prepareStatement("update register set amount=(amount + ?) where cust_id = ?");
			ps.setFloat(1, s.getAmount());
			ps.setInt(2, s.getReceiver_id());
			i = ps.executeUpdate();

			System.out.println("hey4");
//				PreparedStatement ps2 = con.prepareStatement("update register set amount = amount + ? where cust_id = ?");
//				ps2.setInt(1, s.getAmount());
//				ps2.setInt(2, s.getReceiver_id());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//			}
//			else
//			{
//				msg = new message("check password!!", "error", "alert-danger");

//			}
//		} else {
//			msg = new message("current balance is less!!", "error", "alert-danger");
//		}
//		System.out.println(msg);

		return i;
	}

	@Override
	public message addmoney(com.model.profiledisplay p, sendMoney s, int i) {
		// TODO Auto-generated method stub
		int j = 0;
		message msg = null;
		con = myconnection.getcon();

		if (i > 0) {
			try {
				PreparedStatement ps = con
						.prepareStatement("update register set amount=? where cust_id = ? and password = ?");
				ps.setFloat(1, p.getAmount());
				ps.setInt(2, p.getCust_id());
				ps.setString(3, s.getPassword());
				j = ps.executeUpdate();
				msg = new message("Money debited successfully!!", "success", "alert-success");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return msg;
	}

	@Override
	public void history(com.model.history h) {
		// TODO Auto-generated method stub
		con = myconnection.getcon();
		int i = 0;
		int j = 0;
		try {
			PreparedStatement ps = con.prepareStatement("insert into history values(?,?,?,?,current_timestamp)");
			ps.setInt(1, h.getSender_id());
			ps.setInt(2, h.getReceiver_id());
			ps.setFloat(3, h.getAmount());
			ps.setString(4, "debited");
			ps.executeUpdate();
			ps.setInt(1, h.getReceiver_id());
			ps.setInt(2, h.getSender_id());
			ps.setFloat(3, h.getAmount());
			ps.setString(4, "credited");
			ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public LinkedList<com.model.showhistory> showtransactionhistory(int id) {
		// TODO Auto-generated method stub
		LinkedList<com.model.showhistory> lst = null;

		con = myconnection.getcon();
		System.out.println("22");
		showhistory sh = null;
//		System.out.println(id);
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from history order by transaction_date desc");
			lst = new LinkedList<com.model.showhistory>();
			while (rs.next()) {
				int cust_id = rs.getInt(1);
//				System.out.println(id);
				if (cust_id == id) {
					System.out.println(cust_id);
					System.out.println("23");
					System.out.println(rs.getString(5));
					String str = rs.getString(5);
					sh = new showhistory(rs.getInt(2), rs.getFloat(3), rs.getString(4), str);
					System.out.println(rs.getString(5));
					lst.add(sh);
					System.out.println(lst);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public int bankdetails(bank b) {
		// TODO Auto-generated method stub
		int j = 0;
		con = myconnection.getcon();

		try {
			PreparedStatement ps = con.prepareStatement("insert into bank values(?,?,?,?,?,?)");
			ps.setInt(1, b.getCust_id());
			ps.setString(3, b.getBankname());
			ps.setString(4, b.getAcc_holder_name());
			ps.setInt(2, b.getAccount_Number());
			ps.setString(5, b.getAccount_type());
			ps.setFloat(6, b.getAmount());

			j = ps.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return j;
	}

	@Override
	public bank bankinfo(int p) {
		// TODO Auto-generated method stub
		con = myconnection.getcon();
		bank rec = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from bank");
			ResultSet r = ps.executeQuery();
			while (r.next()) {

				if (p == r.getInt(1)) {
					System.out.println("hii");

					rec = new bank(r.getInt(1), r.getString(3), r.getString(4), r.getInt(2), r.getString(5),
							r.getInt(6));
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rec;
	}

	@Override
	public int sendbankmoney(bank p, transfermoney s) {
		// TODO Auto-generated method stub
		message msg = null;
		int i = 0;
		int j = 0;
		con = myconnection.getcon();
		try {

			PreparedStatement ps = con.prepareStatement("update bank set amount=? where cust_id = ?");
			ps.setFloat(1, p.getAmount());
			ps.setInt(2, s.getUid());
			i = ps.executeUpdate();

			System.out.println("hey4");
//				PreparedStatement ps2 = con.prepareStatement("update register set amount = amount + ? where cust_id = ?");
//				ps2.setInt(1, s.getAmount());
//				ps2.setInt(2, s.getReceiver_id());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int sendbankmoney(profiledisplay p, transfermoney s) {
		// TODO Auto-generated method stub
		int j = 0;
		message msg = null;
		con = myconnection.getcon();

		try {
			PreparedStatement ps = con.prepareStatement("update register set amount=? where cust_id = ? and password = ?");
			ps.setFloat(1, p.getAmount());
			ps.setInt(2, p.getCust_id());
			ps.setString(3, s.getPassword());
			j = ps.executeUpdate();
			msg = new message("Money debited successfully!!", "success", "alert-success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}

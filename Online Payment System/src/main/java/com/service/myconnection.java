package com.service;


import java.sql.*;


public class myconnection {
	
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://Localhost:3306/springjdbc";
	private static final String userName = "root";
	private static final String password = "123456789";
	
	static Connection con = null;
	
	public static Connection getcon()
	{
//		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,userName,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

}

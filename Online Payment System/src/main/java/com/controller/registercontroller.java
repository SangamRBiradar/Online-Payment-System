 package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.UserRegister;
import com.model.bank;
import com.service.servicedao;
import com.service.servicedaointerface;

/**
 * Servlet implementation class registercontroller
 */
@WebServlet("/registercontroller")
@MultipartConfig
public class registercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registercontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String uname = request.getParameter("uname");
		String phonenumber = request.getParameter("phonenumber");
		String usergender = request.getParameter("user_gender");
		String bday = request.getParameter("bday");
		String occupation = request.getParameter("occupation");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
		String bankname = request.getParameter("bankname");
		String Acc_holder_name = request.getParameter("Acc_holder_name");
		int Account_Number = Integer.parseInt(request.getParameter("Account_Number"));
		String Account_type = request.getParameter("Account_type");
		float Amount = Float.parseFloat(request.getParameter("Amount"));
		
		PrintWriter pw = response.getWriter();
		UserRegister ur = new UserRegister(fname, uname, phonenumber, usergender, occupation, address, password, bday);
		servicedaointerface s = new servicedao();
		int i = s.userregister(ur);
		System.out.println(i);
		bank b = new bank(i,bankname, Acc_holder_name, Account_Number, Account_type, Amount);
//		System.out.println("1");
//		System.out.println(bday);
//		System.out.println("2");
//		System.out.println(ur.getBday());
		int j = s.bankdetails(b);
		HttpSession session = request.getSession();
		session.setAttribute("a", i);
		if(j > 0)
		{
			pw.println("done");			
		}
		else
		{
			pw.print("error");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

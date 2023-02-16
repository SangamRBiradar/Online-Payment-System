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

import com.model.bank;
import com.model.message;
import com.model.profiledisplay;
import com.model.userlogin;
import com.service.servicedao;
import com.service.servicedaointerface;

/**
 * Servlet implementation class logincontroller
 */
@WebServlet("/logincontroller")
@MultipartConfig
public class logincontroller extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username =request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		PrintWriter pw = response.getWriter();
		userlogin ul = new userlogin(username, password);
		servicedaointerface s = new servicedao();
		int u = s.login(ul);  
	
		if(u==1)
		{
			profiledisplay p = s.profile(ul);
			int i = p.getCust_id();
			bank b = s.bankinfo(i);
			//login success
			HttpSession session = request.getSession();
			session.setAttribute("currentuser", p);
			session.setAttribute("bankinfo", b);
			response.sendRedirect("profile.jsp");
//			login error
			
		}
		else
		{
			pw.print("Invalid details...try again");
			message msg = new message("Invalid Details ! try with another","error", "alert-danger");
			response.sendRedirect("UserLogin.jsp");
			HttpSession session = request.getSession();
			session.setAttribute("msg", msg);
//			pw.println("done");
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

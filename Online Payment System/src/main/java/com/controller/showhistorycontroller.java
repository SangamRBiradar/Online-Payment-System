package com.controller;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.history;
import com.model.showhistory;
import com.service.servicedao;
import com.service.servicedaointerface;

/**
 * Servlet implementation class showhistorycontroller
 */
@WebServlet("/showhistorycontroller")
public class showhistorycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showhistorycontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("21");
		int uid = Integer.parseInt(request.getParameter("uid")); 
		servicedaointerface sdao = new servicedao();
		HttpSession session = request.getSession();
		LinkedList<showhistory> lst = sdao.showtransactionhistory(uid);
		session.setAttribute("lst", lst);
		response.sendRedirect("profile.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

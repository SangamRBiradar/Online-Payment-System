package com.controller;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.history;
import com.model.message;
import com.model.profile;
import com.model.profiledisplay;
import com.model.sendMoney;
import com.model.showhistory;
import com.service.servicedao;
import com.service.servicedaointerface;

/**
 * Servlet implementation class sendmoneycontroller
 */
@WebServlet("/sendmoneycontroller")
public class sendmoneycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public sendmoneycontroller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int rid = Integer.parseInt(request.getParameter("rid"));
		float amount = Float.parseFloat(request.getParameter("amount"));
		String password = request.getParameter("password");
		int uid = Integer.parseInt(request.getParameter("uid"));
		float currentamount = Float.parseFloat(request.getParameter("currentamount"));
		String realpassword = request.getParameter("realpassword");
		HttpSession session = request.getSession();
		profiledisplay p = (profiledisplay) session.getAttribute("currentuser");
		sendMoney s = new sendMoney(rid, amount, password, uid, currentamount, realpassword);
		history transcation_history = new history(uid, rid, amount);
		if (amount < p.getAmount()) {
			String str = p.getPassword();
			if (password.contentEquals(str)) {
				servicedaointerface sdao = new servicedao();
				int i = sdao.sendmoney(p, s);
				if (i > 0) {
					System.out.println(19);
					p.setAmount((p.getAmount() - amount));
					System.out.println(p.getAmount());
					sdao.history(transcation_history);
//					LinkedList<showhistory> lst = sdao.showtransactionhistory(uid);
					message pd = sdao.addmoney(p, s, i);
					session.setAttribute("currentuser", p);
					session.setAttribute("msg", pd);
//					
					response.sendRedirect("profile.jsp");
				}
				else
				{
					message msg = new message("User not found!!", "alert", "alert-danger");
					session.setAttribute("msg", msg);
					response.sendRedirect("profile.jsp");
				}
			} else {
				message m = new message("check password!!!", "alert", "alert-danger");
				session.setAttribute("msg", m);
				response.sendRedirect("profile.jsp");
			}
		} else {
			message m = new message("Not enough bank balance!!!", "alert", "alert-danger");
			session.setAttribute("msg", m);
			response.sendRedirect("profile.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

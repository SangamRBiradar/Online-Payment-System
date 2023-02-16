package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.bank;
import com.model.history;
import com.model.message;
import com.model.profiledisplay;
import com.model.sendMoney;
import com.model.transfermoney;
import com.service.servicedao;
import com.service.servicedaointerface;

/**
 * Servlet implementation class transfermoneycontroller
 */
@WebServlet("/transfermoneycontroller")
public class transfermoneycontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public transfermoneycontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float amount = Float.parseFloat(request.getParameter("amount"));
		String password = request.getParameter("password");
		int uid = Integer.parseInt(request.getParameter("uid"));
		float currentamount = Float.parseFloat(request.getParameter("currentamount"));
		String realpassword = request.getParameter("realpassword");
		float bankamount = Float.parseFloat(request.getParameter("bankamount"));
		
		HttpSession session = request.getSession();
		profiledisplay p = (profiledisplay) session.getAttribute("currentuser");
		bank b = (bank)session.getAttribute("bankinfo");
		transfermoney s = new transfermoney(amount, password, uid, currentamount, realpassword, bankamount);
		
			String str = p.getPassword();
			if (password.contentEquals(str)) {
				b.setAmount((b.getAmount() - amount));
				servicedaointerface sdao = new servicedao();
				int i = sdao.sendbankmoney(b, s);
				if (i > 0) {
					System.out.println(19);
					
					p.setAmount((p.getAmount() + amount));
					System.out.println(p.getAmount());
					
//					LinkedList<showhistory> lst = sdao.showtransactionhistory(uid);
					int pd= sdao.sendbankmoney(p, s);

					session.setAttribute("currentuser", p);
//					session.setAttribute("msg", pd);
					session.setAttribute("bankinfo", b);
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
		} 

	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

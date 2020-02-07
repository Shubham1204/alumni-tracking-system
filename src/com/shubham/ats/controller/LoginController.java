package com.shubham.ats.controller;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;

import com.mysql.cj.Session;
import com.shubham.ats.dao.ATSDAO;
import com.shubham.ats.dto.userDTO;
//import com.shubham.ats.utils.Cache;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String email = request.getParameter("email");
		String pwd = request.getParameter("password");
		PrintWriter out = response.getWriter();
		try {
			userDTO userdto = ATSDAO.login(email, pwd);
			System.out.println("login userdto "+ userdto.toString());
			if (userdto != null) {

				session.setAttribute("sessionuserid", userdto.getUserid());
				session.setAttribute("sessionemail", email);
				session.setAttribute("sessionpwd", pwd);
				System.out.println(session.getAttribute("sessionuserid"));
				request.setAttribute("uid", userdto.getUserid());
				request.setAttribute("role", userdto.getRolename());
				request.setAttribute("userdata", userdto.getRights());
				
				RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
				rd.forward(request, response);
			} else {
				out.println("Unable to login");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (NamingException e) {

			e.printStackTrace();
		}
	}
}

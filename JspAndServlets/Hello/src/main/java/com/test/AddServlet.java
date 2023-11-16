package com.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i = Integer.parseInt((request.getParameter("num1")));
		int j = Integer.parseInt((request.getParameter("num2")));
		
		int adds = i+j;
		
//		request.setAttribute("adds", adds);
		
		// for forwarding this servlet to another servletdS and we are sending the same object to the other servlet
//		RequestDispatcher rd = request.getRequestDispatcher("SqServlet");
//		rd.forward(request, response);
		
		// url rewriting
		// adding and sending the data in the url  
//		response.sendRedirect("SqServlet?adds=" + adds);
		
		// session
//		HttpSession session = request.getSession();
//		session.setAttribute("adds", adds);
		
		Cookie cookie = new Cookie("adds",adds+"");
		response.addCookie(cookie);
		
		response.sendRedirect("SqServlet");
		
		
//		System.out.println(adds);
		
//		response.getWriter().println(request.getParameter("num3"));
		
//		response.getWriter().println( adds );
		
	}
 
}

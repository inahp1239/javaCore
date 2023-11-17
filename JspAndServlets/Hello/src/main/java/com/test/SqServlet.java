package com.test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class SqServlet
 */
public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SqServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// while using the RequestDispatcher
//		int adds = (int)request.getAttribute("adds");
		
		// url rewriting
		// we are fetching the data from the redirected url that is send from the last servlet // session management // cookies // url rewriting
//		int adds = Integer.parseInt(request.getParameter("adds"));
		
		// session management 
//		HttpSession session = request.getSession();
		
//		session.removeAttribute("adds"); // for removing the attribute from the session
		
//		int adds = (int) session.getAttribute("adds");
		
		int adds = 0;
		Cookie cookie[] = request.getCookies();
		for(Cookie c : cookie) {
			if(c.getName().equals("adds"))
				adds = Integer.parseInt(c.getValue());
		}
		
		response.getWriter().println("This page is redirected from add servlet to this servlet\nSquare is : "+adds*adds);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

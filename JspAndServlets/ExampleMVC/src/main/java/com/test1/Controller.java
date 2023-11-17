package com.test1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String para = request.getParameter("page");
        if ( para.equals("login")) {
            getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        } else if ( para.equals("signup")) {
            getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
        } else if ( para.equals("about")) {
            getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
        } else if( para.equals("back") ) {
        	getServletContext().getRequestDispatcher("/index.jsp").forward(request , response);
        } else {
        	getServletContext().getRequestDispatcher("/notfound.jsp").forward(request , response);
        }
    }

}

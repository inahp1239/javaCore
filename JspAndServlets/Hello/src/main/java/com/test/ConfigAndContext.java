package com.test;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ConfigAndContext extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ConfigAndContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("name");
//		response.getWriter().println(str);
		
		
		ServletConfig cf = getServletConfig();
		String str = cf.getInitParameter("name");
		response.getWriter().println(str);
	}


}

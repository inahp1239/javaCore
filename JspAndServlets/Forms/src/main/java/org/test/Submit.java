package org.test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Submit extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Submit() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Name :"+request.getParameter("name")+"<br/>");
		out.println("Gender :"+request.getParameter("gender")+"<br/>");
		String[] lang = request.getParameterValues("language");
		out.println("Language : ");
		if(lang!=null){
			int n = lang.length;
			for(int i = 0 ; i < n ; i++ ){
			  out.println(lang[i]);
			  if(i < n-1 ){
				  out.println(" ,");
			  }
			}
			out.println(".<br/>");
		}else{
			out.println("Not Selected <br/>");
		}
		out.println("Country "+request.getParameter("country"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("Name : "+request.getParameter("name"));
		out.println("Gender : "+request.getParameter("gender"));
		String[] lang = request.getParameterValues("language");
		out.print("Language : ");
		if(lang!=null){
			int n = lang.length;
			for(int i = 0 ; i < n ; i++ ){
			  out.print(lang[i]);
			  if(i < n-1 ){
				  out.print(" ,");
			  }
			}
			out.println(".");
		}else{
			out.print("Not Selected ");
		}
		out.println("Country : "+request.getParameter("country"));
	}

}

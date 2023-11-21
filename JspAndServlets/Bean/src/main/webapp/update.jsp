<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="org.example.User" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>


<!-- Using JSTL -->
<jsp:setProperty property="firstName" name="user" value='<%= request.getParameter("firstName")%>'/>		<!-- setting firstName using parameters from the user input from the form -->

<jsp:setProperty property="lastName" name="user" value='<%= request.getParameter("lastName")%>' />  	<!-- setting lastName using parameters from the user input from the form -->

<% response.sendRedirect("getProperties.jsp");  %>  	<!-- redirecting this page to the getProperties.jsp to print the names on web-page -->


<!-- Using standard methods  -->
<%-- <% 

/* 	User us = new User(); 									// creating instance of a class
	us.setFirstName(request.getParameter("firstName"));		// setting firstName
	us.setLastName(request.getParameter("lastName"));		// setting lastName
	session.setAttribute("us",us); */						// using a session setAttribute we create a values that can be used in another servlet
	
	User us = new User();									// creating instance of a class
	us.setFirstName(request.getParameter("firstName"));		// setting firstName using parameters from the user input from the form
	us.setLastName(request.getParameter("lastName"));		// setting lastName using parameters from the user input from the form
	session.setAttribute("us", us);							// using a session setAttribute we create a values that can be used in another servlet

	/* response.sendRedirect("getProperties.jsp"); */       // redirecting this page to the getProperties.jsp to print the names on web-page
	
	RequestDispatcher rd = request.getRequestDispatcher("getProperties.jsp");
	rd.forward(request,response);							// dispatching and forwarding this page to the getProperties.jsp to print the names on web-page
%> --%>

</body>
</html>
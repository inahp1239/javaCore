<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.example.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get properties</title>
</head>
<body>

<!-- Using JSTL  -->

<jsp:useBean id="user" class="org.example.User"  scope="session" ></jsp:useBean>

First Name : <jsp:getProperty property="firstName" name="user"/> <br/>
Last Name : <jsp:getProperty property="lastName" name="user"/> 


<!-- using standard methods  -->
<%-- <% 
	User us = (User)session.getAttribute("us");

	out.println(us.getFirstName()+" ");
	out.println(us.getLastName());
%>  --%>

<%-- <% 
User us = (User)session.getAttribute("us");

if (us != null) {
%>    
	First Name : <%= us.getFirstName() %> <br/>
	Last Name : <%= us.getLastName() %> 
<% 
} else {
    out.println("User object is null.");
}
%>
 --%>

</body>
</html>
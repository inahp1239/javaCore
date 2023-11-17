<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First file</title>
</head>
<body>

<!-- import files -->
<!-- one way to add a file to jsp -->
<!-- <%@ include file="index.html" %>    we can add html pages  -->

<!-- another way to add a file to jsp 
<jsp:include page="file1.txt"></jsp:include> -->



<!-- import classes --> 
<!--  <% out.println(new com.test.Hello()); %>-->

<%@ page import="java.util.Date" %> <!-- directive tag -->

<%= new Date() %> <!-- expresstion elemtent --> 
<br>
<% out.println(new Date()); %> <!-- scriptlet element -->

</body>
</html>
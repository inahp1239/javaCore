<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Submit</title>
</head>
<body>

Name : <%= request.getParameter("name") %><br/>
Gender : <%= request.getParameter("gender") %><br/>
Language : <% String[] lang = request.getParameterValues("language");
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
			%>
Country : <%=request.getParameter("country") %>
</body>
</html>
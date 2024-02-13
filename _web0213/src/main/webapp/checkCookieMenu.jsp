<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    Cookies cookies = new Cookies(request);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="result.jsp">
<%
	if (cookies.exists("email")) {
%>
E-mail : <input type = "text" name = "email" 
			value="<%=cookies.getValue("email") %>"/>
<%
	} else {
%>
E-mail : <input type = "text" name = "email" />
<%
	}
%>
Check for remember : <input type = "checkbox" name = "remember" checked/>
<input type = "submit"/>

</form>
</body>
</html>
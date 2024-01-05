<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
public static String print() {
	return "hi";
}
%>
<%=print() %>

<%
int sum=0;
for (int i=1;i<=100;i++) {
	sum += i;	
}
%>
<h2><%=sum %></h2>

<%
Date now = new Date();
%>
<%=now %>)
<h1>안녕하세요!</h1>
</body>
</html>
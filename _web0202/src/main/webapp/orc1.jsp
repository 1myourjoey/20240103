<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>   
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>

<%
    Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    try ( 
        Connection conn = DriverManager.getConnection(
        		url, "scott", "tiger")) {
    	
        out.println("DB 접속 성공 !");
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>
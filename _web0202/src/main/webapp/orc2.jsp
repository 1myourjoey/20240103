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
    Connection conn = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    Class.forName("oracle.jdbc.driver.OracleDriver");
    try { 
        conn = DriverManager.getConnection(
        		url, "scott", "tiger");
    	
        out.println("DB 접속 성공 !");
        
    } catch(Exception e) {
        e.printStackTrace();
		
    } finally {
        if (conn != null) 
	          conn.close();
    }
	
%>

</body>
</html>
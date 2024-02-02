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
    	String sql = "delete from score where num = ?";
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    	pstmt.setString(1, request.getParameter("num"));
    	pstmt.executeUpdate();
    	response.sendRedirect("orcSelect.jsp");
      
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>
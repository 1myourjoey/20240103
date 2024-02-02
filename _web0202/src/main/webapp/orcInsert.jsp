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
	request.setCharacterEncoding("utf-8");
    Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
    try ( 
        Connection conn = DriverManager.getConnection(
        		url, "scott", "tiger")) {
    	String sql = "insert into score (num , name, kor,eng,math) values(?,?,?,?,?)";
    	PreparedStatement pstmt = conn.prepareStatement(sql);
    	pstmt.setInt(1, Integer.parseInt(request.getParameter("num")));
    	pstmt.setString(2, request.getParameter("name"));
        pstmt.setInt(3, Integer.parseInt(request.getParameter("kor")));
        pstmt.setInt(4, Integer.parseInt(request.getParameter("eng")));
        pstmt.setInt(5, Integer.parseInt(request.getParameter("math")));
        int result = pstmt.executeUpdate();
        if(result == 1 ){
    		out.println("입력성공");
    		response.sendRedirect("orcSelect.jsp");
    	}else {
    		out.println("실패");}
        
    } catch(Exception e) {
        e.printStackTrace();
    }
%>

</body>
</html>
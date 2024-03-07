<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dto.Member"%>

<%
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
request.setCharacterEncoding("utf-8");

String memberno = request.getParameter("memberno");
String id = request.getParameter("id");
String email = request.getParameter("email");
String name = request.getParameter("name");

if (memberno != null && !memberno.isEmpty()) {
    String sql = "update member set email=?, name=? where memberno=?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    
    pstmt.setString(1, email);
    pstmt.setString(2, name);
    pstmt.setInt(3, Integer.parseInt(memberno));
    
    int res = pstmt.executeUpdate();
    response.sendRedirect("manage.jsp");
} else {
    // memberno가 null이거나 비어있을 때 처리할 내용 추가
}
%>
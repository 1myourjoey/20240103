<%@page import="dto.Member"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection(
               "jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
String sql = "delete from member where memberno=?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setString(1, request.getParameter("memberno"));
int res = pstmt.executeUpdate();
response.sendRedirect("manage.jsp");
Member loggedInMember = (Member) session.getAttribute("member");

//로그인한 사용자가 관리자가 아니면 로그인 페이지로 리다이렉트
if (loggedInMember == null || !"admin".equals(loggedInMember.getId())) {
 response.sendRedirect("/_0MVC_BOARD/loginForm.do");
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
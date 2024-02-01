<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String driver ="oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String ename = request.getParameter("ename");
    String job = request.getParameter("job");
    String sal = request.getParameter("sal");
	String sql = "UPDATE emp1 SET job=?, sal=? where ename=?";
	
	PreparedStatement pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1,job);
	pstmt.setString(2,sal);
	pstmt.setString(3,ename);
	
	
	int result = pstmt.executeUpdate();
	if(result == 1 ){
		out.println("입력성공");
	}else {
		out.println("실패");
	}
	%>
	업데이트완료 <br/>
	<a href="select.jsp">목록으로</a>

</body>
</html>
<%@page import="java.sql.ResultSet"%>
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
	String sql = "select ename , job, sal from emp1 where ename = ?";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("ename"));
	ResultSet rs = pstmt.executeQuery();
	String ename = ""; String job = ""; String sal = "";
	if(rs.next()){
		ename = rs.getString("ename");
		job = rs.getString("job");
		sal = rs.getString("sal");
	}
	
	%>
	
<a href="index.jsp">목록으로</a>
<form action="update.jsp" method ="post">


이름<input type = "text" name="ename" value="<%=ename %>"/> <br/>
직무<input type = "text" name="job" value="<%=job %>" /> <br/>
월급<input type = "text" name="sal" value="<%=sal %>" /> <br/>

<input type ="submit" value="사원 생성">
<input type = "reset">

</form>
</body>
</html>
<%@page import="dto.Member"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

// 세션에서 사용자 정보 가져오기
Member loggedInMember = (Member) session.getAttribute("member");

// 로그인한 사용자가 관리자가 아니면 팝업 창을 띄우고 로그인 페이지로 리다이렉트
if (loggedInMember == null || !"admin".equals(loggedInMember.getId())) {
%>
    <script>
        alert('관리자만 접근할 수 있는 페이지입니다.');
        window.open('/_0MVC_BOARD/loginForm.do', '_self');
    </script>
<%
    return;
}

String sql = "select * from member";
PreparedStatement pstmt = conn.prepareStatement(sql);
ResultSet rs = pstmt.executeQuery();
%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Manage Member</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #2B3856; justify-content: center;">
    <div class="container-fluid text-center">
        <a class="navbar-brand" href="/_0MVC_BOARD/index.jsp" style="color: white;">
            <h1 class="text-center">Page for Admin</h1>
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                
                <li class="nav-item ml-3">
                    <a class="nav-link" href="/_0MVC_BOARD/index.jsp" style="color: white;">Home</a>
                </li>
            </ul>
        </div>
    </div>
</nav>


	<div class="container" style="padding-top: 50px">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th scope="col">회원번호</th>
					<th scope="col">아이디</th>
					<th scope="col">이메일</th>
					<th scope="col">이름</th>
					<th scope="col">수정</th>
					<th scope="col">삭제</th>
				</tr>
			</thead>
			<tbody>
<%
while (rs.next()) {
%>
				<tr>
					<th scope="row"><%=rs.getString("memberno") %></th>
					<td><%=rs.getString("id") %></td>
					<td><%=rs.getString("email") %></td>
					<td><%=rs.getString("name") %></td>
					<td><button class ="btn btn-secondary" onClick='location.href="memberUpdateForm.jsp?memberno=<%=rs.getString("memberno") %>"'>수정</button>
					
					<td><button class="btn btn-primary" onClick='location.href="memberDelete.jsp?memberno=<%=rs.getString("memberno") %>"'>삭제</button></td>
				</tr>
<%
}
%>				
			</tbody>
		</table>
		<button class="btn btn-primary ml-auto" onClick="move()">회원등록</button>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
		
	<script>
		function move() {
			//alert("나온다");
			location.href="memberForm.jsp";
		}
	</script>
</body>
</html>
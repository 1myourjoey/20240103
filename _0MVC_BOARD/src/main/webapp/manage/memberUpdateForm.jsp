<%@page import="dto.Member"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  
<%
String mno = request.getParameter("memberno");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
String sql = "select * from member where memberno = ?";
PreparedStatement pstmt = conn.prepareStatement(sql);
pstmt.setInt(1, Integer.parseInt(mno));
ResultSet rs = pstmt.executeQuery();
int memberno = 0;
String id = null;
String email = null;
String name = null;
if (rs.next()) {
    memberno = rs.getInt("memberno");
    id = rs.getString("id");
    email = rs.getString("email");
    name = rs.getString("name");
}
//세션에서 사용자 정보 가져오기
Member loggedInMember = (Member) session.getAttribute("member");

//로그인한 사용자가 관리자가 아니면 팝업 창을 띄우고 로그인 페이지로 리다이렉트
if (loggedInMember == null || !"admin".equals(loggedInMember.getId())) {
%>
 <script>
     alert('관리자만 접근할 수 있는 페이지입니다.');
     window.open('/_0MVC_BOARD/loginForm.do', '_self');
 </script>
<%
 return;
}
%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 정보 수정</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<div class="container" style="padding-top: 50px">
    <form action="memberUpdate.jsp" method="post">
        <div class="mb-3">
            <label for="membernoInput" class="form-label">회원번호 확인</label>
            <input type="text" readOnly name="memberno" value="<%=memberno %>" class="form-control" id=""
                   placeholder="회원번호">
        </div>
        <div class="mb-3">
            <label for="IDinput" class="form-label">ID</label>
            <input type="text" name="id" value="<%=id %>" class="form-control" id="IDinput" placeholder="아이디">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Email address</label>
            <input type="email" name="email" value="<%=email %>" class="form-control" id="exampleFormControlInput1"
                   placeholder="name@example.com">
        </div>
        <div class="mb-3">
            <label for="nameinput" class="form-label">NAME</label>
            <input type="text" name="name" value="<%=name %>" class="form-control" id="nameinput" placeholder="이름">
        </div>
        <button class="btn btn-secondary w-100 py-2" type="submit">수정</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>
</html>

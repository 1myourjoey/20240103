<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
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
    MemberDao memberDao = MemberDao.getInstance();
    String id = request.getParameter("id");
    Member member = memberDao.select(id);

    // 이미 있는 아이디이면 오류 표시
    if (member != null) {   
%>
    <script>
        alert('이미 등록된 아이디입니다.');
        history.go(-1); // 이전 페이지로 이동
    </script>
<%          
    } else {           
        String email = request.getParameter("email");
        String name =  request.getParameter("name");
        Member member2 = new Member(id, email, name);
        memberDao.insert(member2);
        // 새로운 회원정보를 DB에 추가하는 쿼리
%>
    <script>
        alert('가입이 완료되었습니다.');
        window.location.href = "manage.jsp";
    </script>
<%          
    }
%>

</body>
</html>
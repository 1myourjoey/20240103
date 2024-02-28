<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%
    Member loggedInMember = (Member) session.getAttribute("member");
    if (loggedInMember == null) {
        response.sendRedirect("loginForm.do");
    }
%>
<%
    // 글 번호 값 얻기, 주어지지 않았으면 0으로 설정
    String tmp = request.getParameter("num");
    int num = (tmp != null && tmp.length() > 0) ? Integer.parseInt(tmp) : 0;

    // 새 글쓰기 모드를 가정하고 변수 초기값 설정
    String memberno  = "";
    String title   = "";
    String content = "";
    String writer = ""; // 작성자 이름을 저장할 변수 추가
    String action  = "insert.jsp";

    // 글 번호가 주어졌으면, 글 수정 모드
    if (num > 0) {
        BoardDao dao = BoardDao.getInstance();
        Board board = dao.selectOne(num, false);

        // 글 데이터를 변수에 저장
        title   = board.getTitle();
        content = board.getContent();
        memberno = String.valueOf(board.getMemberno());

        // 작성자 이름 가져오기
        writer = dao.getMemberNameByMemberNo(board.getMemberno());

        // 글 수정 모드일 때는 저장 버튼을 누르면 UPDATE 실행
        action  = "update.jsp?num=" + num;
    }
%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <title>글쓰기</title>
    <style>
        body {
            background-color: #2B3856;
        }

        .container {
            margin-top: 50px;
            text-align: center;
        }

        .form-table {
            width: 80%;
            margin: 0 auto;
            text-align: left;
        }

        .form-table th {
            width: 20%;
            background-color: #343a40;
            color: #ffffff;
        }

        .form-table td {
            width: 80%;
        }

        textarea {
            width: 100%;
        }
    </style>
</head>
<body>

<div class="container">
    <h2 class="mb-4"></h2>

    <form method="post" action="<%=action%>">
        <table class="table table-bordered form-table">
            <tr>
                <th>제목</th>
                <td><input type="text" name="title" maxlength="80" class="form-control" value="<%=title%>"></td>
            </tr>
            
            <tr>
                <th>작성자</th>
                <td style="color: white;"><%=loggedInMember.getId()%></td>
            </tr>

            <tr>
                <th>내용</th>
                <td><textarea name="content" rows="10" class="form-control"><%=content%></textarea></td>
            </tr>
        </table>

        <br>
        <input type="submit" class="btn btn-primary" value="저장">
        <input type="button" class="btn btn-secondary" value="취소" onclick="history.back()">
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>

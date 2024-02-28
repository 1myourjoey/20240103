<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
     
 <%@ page import="java.sql.*" %>  
 <%@ page import="java.time.*" %>
  
 <%
    request.setCharacterEncoding("utf-8");

    // 전달받은 값 읽기
    int num = 0;
    int memberno = 0;

    String numParam = request.getParameter("num");
    String membernoParam = request.getParameter("memberno");

    if (numParam != null && !numParam.isEmpty()) {
        num = Integer.parseInt(numParam);
    }

    if (membernoParam != null && !membernoParam.isEmpty()) {
        memberno = Integer.parseInt(membernoParam);
    }

    String title = request.getParameter("title");
    String content = request.getParameter("content");

    // 빈 칸이 하나라도 있으면 오류 출력하고 종료
    if (
        title == null || title.length() == 0 ||
        content == null || content.length() == 0
    ) {
%>      
    <script>
        alert('모든 항목이 빈칸 없이 입력되어야 합니다.');
        history.back();
    </script>
<%               
        return;
    }
 
     BoardDao dao = BoardDao.getInstance();
     Board board = new Board(num, title, content, memberno);
     dao.update(board);
     
     // 글 보기 화면으로 돌아감
     response.sendRedirect("view.do?num=" + num);
 %>     
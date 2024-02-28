<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
// 세션에서 로그인된 사용자 정보 가져오기
int loggedInMemberNo = (int) session.getAttribute("MEMBERNO");

// 게시글 번호 받아오기
int num = Integer.parseInt(request.getParameter("num"));

// 게시글 작성자의 memberNo 가져오기
BoardDao dao = BoardDao.getInstance();
Board board = dao.selectOne(num, false); // false를 전달하여 작성자 정보를 함께 조회하지 않음

// 작성자 정보와 로그인한 사용자 정보가 일치하는지 확인
if (board != null && loggedInMemberNo == board.getMemberno()) {
    dao.delete(num); // 삭제 수행
%>
    <script>
        alert('삭제가 되었습니다.');
        location.href="list.do";
    </script>
<%
} else {
%>
    <script>
        alert('본인의 글만 삭제할 수 있습니다.');
        location.href="list.do";
    </script>
<%
}
%>
<%@page import="dto.Board"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
Member member = (Member)session.getAttribute("member");
if (member == null) {
    response.sendRedirect("loginForm.do");
}
%>
<%
    request.setCharacterEncoding("utf-8");

    // 양식에 입력되었던 값 읽기
    String title = request.getParameter("title");
    String content = request.getParameter("content");

    // 빈 칸이 하나라도 있으면 오류 출력하고 종료
    if (title == null || title.length() == 0 ||
        content == null || content.length() == 0) {
%>      
        <script>
            alert('제목과 내용은 빈칸 없이 입력되어야 합니다.');
            history.back();
        </script>
<%        
        return;
    }

    // 현재 로그인한 회원의 ID와 회원 번호를 세션에서 가져오기
    Member loggedInMember = (Member) session.getAttribute("member");
    String writer = loggedInMember.getId();
    int memberNo = loggedInMember.getMemberno();

    BoardDao dao = BoardDao.getInstance();
    Board board = new Board();
    
    // 작성자 정보 설정
    board.setMemberno(memberNo);
    board.setTitle(title);
    board.setContent(content);
    
    dao.insert(board);
    
    // 목록보기 화면으로 돌아감
    response.sendRedirect("list.do");
%>


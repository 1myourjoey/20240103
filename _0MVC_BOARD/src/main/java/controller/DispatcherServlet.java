package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BoardDao;
import dao.MemberDao;
import dto.Board;
import dto.Member;



/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DispatcherServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf("/"));
		if (path.equals("/list.do")) {
			BoardDao dao = BoardDao.getInstance();
			ArrayList<Board> list = dao.selectList();
			// 포워딩 작업
			request.setAttribute("list", list);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/list.jsp");
			dispatcher.forward(request, response);

		} else if (path.equals("/view.do")) {
			int num = Integer.parseInt(request.getParameter("num"));
			BoardDao dao = BoardDao.getInstance();
			Board board = dao.selectOne(num, true);
			// 글 제목과 내용이 웹 페이지에 올바르게 출력 최도록 공백과 줄 바꿈 처리
			String title = board.getTitle().replace(" ", "&nbsp;");
			board.setTitle(title);
			String content = board.getContent().replace(" ", "&nbsp;").replace("\n", "<br>");
			board.setContent(content);

			// 포워딩 작업
			request.setAttribute("bd", board);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/view.jsp");
			dispatcher.forward(request, response);

		} else if (path.equals("/login.do")) { // 로그인 부분
		    String id = request.getParameter("id");
		    String email = request.getParameter("email");
		    Member member = MemberDao.getInstance().selectForLogin(id, email);
		    if (member != null) {
		        HttpSession session = request.getSession();
		        session.setAttribute("member", member);
		        // 세션에 MEMBERNO 저장
		        session.setAttribute("MEMBERNO", member.getMemberno());
		        response.sendRedirect("index.jsp"); 
		    } else {
		        response.sendRedirect("loginForm.jsp");
		    }
		} else if (path.equals("/logout.do")) {
			HttpSession session = request.getSession(false);
			session.invalidate();
			response.sendRedirect("index.jsp");
			
		} else if (path.equals("/loginForm.do")) { // 위에꺼랑 같은 것
			response.sendRedirect("loginForm.jsp");
		
		}  else if (path.equals("/delete.do")) {
		    // 게시물의 번호를 가져옴
		    int num = Integer.parseInt(request.getParameter("num"));

		    // 게시물 삭제 로직 수행
		    BoardDao dao = BoardDao.getInstance();
		    int deletedRows = dao.delete(num);

		    if (deletedRows > 0) {
		        // 삭제 성공 시 리스트 페이지로 리다이렉트
		        response.sendRedirect("/list.do");
		    } else {
		        // 삭제 실패 시 오류 메시지를 설정하고 오류 페이지로 포워딩
		        request.setAttribute("message", "게시물 삭제에 실패했습니다.");
		        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/error.jsp");
		        dispatcher.forward(request, response);
		    }
		} else if (path.equals("/write.do")) {
		    // 글쓰기 폼을 보여주는 페이지로 포워딩
		    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/write.jsp");
		    dispatcher.forward(request, response);
		}
		
		  
}
}
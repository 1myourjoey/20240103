package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.BoardDao;
import dto.BoardDto;
import dto.LoginRequest;
import service.GetMemberNumService;

@Controller

public class MyController {
	@Autowired
	private GetMemberNumService getMemberNumService;
	
	@GetMapping("/")
	public String root() {
		return "index";
	}
	@GetMapping("login")
	public String login() {
		return"loginInput";
	}
	
	@GetMapping("result")
	public String result(LoginRequest loginRequest, Model model) {
		String str="가나다";
		System.out.println(loginRequest.getId());
		System.out.println(loginRequest.getEmail());
		System.out.println(getMemberNumService.getNumRecords());
		
		model.addAttribute("str", str);
		return"result";
	}
	@GetMapping("list")
	
		public String list(Model model, @Autowired BoardDao dao) {
	    List<BoardDto> list = dao.selectAllList();
	    model.addAttribute("list", list);
	   
	    return "list";
	}
	@GetMapping("selectOne")
	public String getBoardById(Model model, @Autowired BoardDao boardDao,@RequestParam("num") int num) {
	    BoardDto board = boardDao.selectOne(num, true); // 예시로 첫 번째 게시글을 가져오도록 수정
	    model.addAttribute("board", board);
	    return "selectOne"; // 적절한 뷰 이름으로 수정해야 합니다.
	}
		
	
	
	
}

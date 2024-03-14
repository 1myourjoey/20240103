package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	public String list(Model model) {
	    BoardDao dao = new BoardDao();
	    List<BoardDto> list = dao.selectAllList();
	    model.addAttribute("list", list);
	   
	    return "list";
	}
	
	
	
}

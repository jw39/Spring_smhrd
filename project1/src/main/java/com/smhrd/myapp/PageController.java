package com.smhrd.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 요청 파라미터 받아주기, 뷰(결과 페이지)를 리턴
@Controller
public class PageController {
	
	// index 페이지를 리턴해주는 메서드
	// localhost:8089/myapp/index
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		
		// view reslover : /WEB-INF/views/index.jsp
		return "index";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "join";
		
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "/update", method=RequestMethod.GET)
	public String update() {
		return "update";
	}
	
	// localhost/myapp/list
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public String list() {
		return "list";
	}
	

}

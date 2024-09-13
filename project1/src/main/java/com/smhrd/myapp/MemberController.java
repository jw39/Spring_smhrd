package com.smhrd.myapp;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smhrd.myapp.service.MemberService;
import com.smhrd.pro.model.MavenMember;

@Controller
public class MemberController {
	
	@Autowired //의존성 주입
	MemberService service;
	
	// 회원 가입 요청 처리 : localhost:8089/myapp/member/join
	@RequestMapping(value = "/member/join", method=RequestMethod.POST)
	public String memberJoin(@RequestParam("id")String id
			, @RequestParam("pw") String pw
			, @RequestParam("nickname") String nickname) {
		System.out.println(id+","+pw+","+nickname);
		
		// controller -> service -> mapper
		// controller : 요청 파라미터 받고 마지막에 뷰 리턴
		// service : controller에 작성되는 코드 외에 로직들 작성
		// mapper : DB 관련 작업
		
		MavenMember member = new MavenMember(id, pw, nickname);
		int res = service.memberJoin(member);
		
		System.out.println(res);
		
		// 포워딩
		if(res>0) {
			// 회원가입 성공
			// index.jsp
//			return "index";-> 포워딩 방식으로 이동이 되면서잘못된 주소로 결과물이 리턴됨
			// index 페이지를 보여주는 경로로 클라이언트가 재요청하게 만들기! (리다이렉팅)
			return "redirect:/index";
		}else {
			// 회원가입 실패
			// join.jsp
			return "redirect:/join";
		}
	}
	
	// 로그인 요청 처리 : localhost:8089/myapp/member/login
	@RequestMapping(value="/member/login", method=RequestMethod.POST)
	public String memberLogin(@RequestParam("id")String id,
							@RequestParam("pw")String pw,
							HttpSession session) {
		
		//System.out.println(id+","+pw);
		
		MavenMember member = new MavenMember(id, pw);
		MavenMember result = service.memberLogin(member);
		
		// HttpSession session = request.getSession();
		if(result != null) {
			System.out.println("로그인 성공");
			session.setAttribute("member", result);
			// forwarding 방식 : 최종페이지의 경로를 확인 x (어색), 추후 페이지 이동 시에 문제 발생
//			return "index";
			// redirecting 방식 : 클라이언트가 해당 경로로 재 요청하게 만듦
			// 					index를 보여주는 경로로 재 요청
			return "redirect:/index";
		} else {//null
			System.out.println("로그인 실패");
			return "redirect:/login";
		}
	}
	
	// 로그아웃 요청 처리 : localhost:8089/myapp/member/logout
	@RequestMapping(value="/member/logout", method=RequestMethod.GET)
	public String memberLogout(HttpSession session) {
		session.removeAttribute("member");
		return "redirect:/index";
		
	}
	
	// localhost:8089/myapp/update
	@RequestMapping(value="member/update", method=RequestMethod.POST)
	public String memberUdpate(@ModelAttribute MavenMember member, HttpSession session) {
		// id, pw, nickname => 한 회원의 정보 (MavenMember)
		// RequestParam => 파라미터 하나하나 가져오는 방법
		// ModelAttiribute => 특정한 Model 형태로 파라미터를 묶어서 가져오는 방법
		// 		=> 사용한 Model Class에 기본 생성자, Setter 생성 필요
		
//		System.out.println(member.getId());
//		System.out.println(member.getPw());
//		System.out.println(member.getNickname());
		int res = service.memberUpdate(member);
		System.out.println(res);
		
		if(res>0) {
			// 수정 성공
			// member 세션을 수정한 값을 저장하도록 변경 (새롭게 생성)
			session.setAttribute("member",member);
			return "redirect:/index";
		} else {
			return "redirect:/update";
		}
	}
	
	// 삭제
	@RequestMapping(value="/member/delete", method=RequestMethod.GET)
	public String memberDelete(@RequestParam("id")String id
							, HttpSession session) {
		
		int res = service.memberDelete(id);
		
		// 성공이든 실패든 index 페이지로 이동
		// 성공 시 로그인이 풀리게 (세션)
		// 실패 시 로그인 상태 유지 (회원 정보 유지) (세션)
		if(res>0) { // 탈퇴 성공
			session.removeAttribute("member");
		} 
		return "redirect:/index";
	}
	
	
	// 관리자에 의한 회원 삭제
	@RequestMapping(value="/member/delete/{id}", method=RequestMethod.GET)
	public String memberDelete(@PathVariable("id") String id) {
		
		int res = service.memberDelete(id);
	
		// list.jsp 삭제 링크를 누르면 해당 회원을 DB에서 삭제해주고
		// 다시 list.jsp로 이동 (삭제한 회원은 리스트에서 안 보여야 함)
		return "redirect:/member/list";
	}
	
	
	// 관리자의 요청에 의한 멤버 리스트
	@RequestMapping(value="/member/list", method=RequestMethod.GET)
	public String memberList(Model model) {
		List<MavenMember> list = service.memberList();
		// 리스트 저장 -> 세션에 저장하면 됨 (서버 용량 차지함) => 불필요한 용량을 많이 차지
//		return "redirect:/list";
		
		// 포워딩 (현재 사용하는 request, response를 다음 페이지에서도 사용할 수 있도록 해줌)
		// 세션 / 리퀘스트 / 어플리케이션 등에 list 값을 저장할 수 있음
		
		// 스프링에서 데이터를 임시적으로 저장할 때 사용하는 객체
		// request와 같은 역할을 하는 객체 (Model)
		// Model : 임시적으로 다음 페이지에서만 사용할 데이터를 넘기고(저장하고) 싶을 때 
		model.addAttribute("list", list);
		return "list";
		
	}

	
	
	
	
	
	
	

}

package com.smhrd.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smhrd.myapp.mapper.MemberMapper;
import com.smhrd.pro.model.MavenMember;

@Service
public class MemberService {
	
	@Autowired //의존성 주입
	MemberMapper mapper;
	
	// 회원 가입 처리 //MavenMember의 id,pw, nickname이 들어옴 
	public int memberJoin(MavenMember member) {
		return mapper.memberJoin(member);
		
	}
	
	
	// 로그인 처리
	public MavenMember memberLogin(MavenMember member) {
		return mapper.memberLogin(member);
		
	}
	
	// 회원정보 수정 처리
	public int memberUpdate(MavenMember member) {
		return mapper.memberUpdate(member);
	}
	
	// 회원정보 삭제 처리
	public int memberDelete(String id) {
		return mapper.memberDelete(id);
	}
	
	// 회원 전체 리스트 처리
	public List<MavenMember> memberList() {
		return mapper.memberList();
	}
	
}

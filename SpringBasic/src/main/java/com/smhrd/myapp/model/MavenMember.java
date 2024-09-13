package com.smhrd.myapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class MavenMember {
	
	// lombok 사용법
	// 1. 현재 사용하는 이클립스 프로그램에 추가
	// 2. 이클립스 리스타트
	// 3. 프로젝트에 lombok.jar dependency 추가
	
	public MavenMember(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	private String id;
	private String pw;
	private String nickname;
	//본인 테이블 컬럼에 맞춰 작성하기!

}

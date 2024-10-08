package com.smhrd.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.smhrd.myapp.model.MavenMember;

@Mapper
public interface MemberMapper {

   // 회원가입 처리
   public int memberJoin(MavenMember member);
   
   //로그인 처리
   public MavenMember memberLogin(MavenMember member);
   
   // 회원정보 수정 처리
   @Update("update mavenmember set pw=#{pw} , nickname=#{nickname} where id=#{id}")
   public int memberUpdate(MavenMember member);
   
   // 회원 삭제 처리
   @Delete("delete from mavenmember where id=#{id}")
   // 어차피 id를 받아와서 {} 안에 뭘 적어도 상관 없음
   public int memberDelete(String id);
   // 결과를 확실하게 보고 싶으면 int
   
   // 회원 전체 리스트
   @Select("select * from mavenmember")
   public List<MavenMember> memberList();
   
   
   
}
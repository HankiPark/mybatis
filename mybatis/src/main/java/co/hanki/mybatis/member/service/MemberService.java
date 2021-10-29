package co.hanki.mybatis.member.service;

import java.util.List;

public interface MemberService { //Model에서 사용
List<MemberVO> MemberSelectList();
MemberVO MemberSelect(MemberVO vo);
int MemberInsert(MemberVO vo);
int MemberUpdate(MemberVO vo);
int MemberDelete(MemberVO vo);
}

package co.hanki.mybatis.command;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.member.service.MemberService;
import co.hanki.mybatis.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
/*		List<MemberVO> list= new ArrayList<MemberVO>();
		MemberService memberDao = new MemberServiceImpl();
		list=memberDao.MemberSelectList();
		request.setAttribute("members", list);*/
		
		
		MemberService memberDao = new MemberServiceImpl();
		request.setAttribute("members", memberDao.MemberSelectList());
		
		return "member/memberList";
	}

}

package co.hanki.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.member.service.MemberService;
import co.hanki.mybatis.member.service.MemberVO;
import co.hanki.mybatis.member.serviceImpl.MemberServiceImpl;

public class MemberJoin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		int n=0;
	
		MemberVO vo= new MemberVO();
		MemberService memberDao = new MemberServiceImpl();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setAddress(request.getParameter("address"));
		vo.setTel(request.getParameter("tel"));
		vo.setAuthor(request.getParameter("author"));
		n = memberDao.MemberInsert(vo);
		if(n!=0) {
			request.setAttribute("join", "회원가입을 축하드립니다.");
		}else {
			request.setAttribute("join", "회원가입에 실패했습니다.");
		}
		return "member/memberJoin";
	}

}

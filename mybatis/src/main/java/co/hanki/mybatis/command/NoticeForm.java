package co.hanki.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.member.service.MemberService;
import co.hanki.mybatis.member.service.MemberVO;
import co.hanki.mybatis.member.serviceImpl.MemberServiceImpl;

public class NoticeForm implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberVO vo = new MemberVO();
		MemberService memberDao = new MemberServiceImpl();
		vo.setId((String)session.getAttribute("id"));
		vo=memberDao.MemberSelect(vo);		
		request.setAttribute("member", vo);

		return "notice/noticeForm";
	}

}

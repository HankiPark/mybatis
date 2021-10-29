package co.hanki.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.member.service.MemberService;
import co.hanki.mybatis.member.service.MemberVO;
import co.hanki.mybatis.member.serviceImpl.MemberServiceImpl;

public class MemberLogin implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberService memberDao = new MemberServiceImpl();
		HttpSession session = request.getSession();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = memberDao.MemberSelect(vo);
		request.setAttribute("member", vo);
		if (vo != null) {
			request.setAttribute("message", vo.getName() + "님 환영합니다.");
			session.setAttribute("id", vo.getId());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("name", vo.getName());

		} else {
			request.setAttribute("message", "아이디 또는 패스워드가 틀렸습니다.");
		}
		return "member/memberLogin";
	}

}

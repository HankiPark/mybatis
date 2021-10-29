package co.hanki.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.member.service.MemberService;
import co.hanki.mybatis.member.service.MemberVO;
import co.hanki.mybatis.member.serviceImpl.MemberServiceImpl;
import co.hanki.mybatis.notice.service.NoticeService;
import co.hanki.mybatis.notice.service.NoticeVO;
import co.hanki.mybatis.notice.serviceImpl.NoticeServiceImpl;

public class MemberDelete implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		MemberVO vo = new MemberVO();
		NoticeVO nvo = new NoticeVO();
		NoticeService noticeDao = new NoticeServiceImpl();
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		vo.setId((String) session.getAttribute("id"));
		memberDao.MemberDelete(vo);
		/* nvo =noticeDao.noticeId(vo); */
		
		
		
		
		
		
		session.invalidate();
	
		return "home.do";
	}

}

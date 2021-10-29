package co.hanki.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.member.service.MemberVO;
import co.hanki.mybatis.notice.service.NoticeService;
import co.hanki.mybatis.notice.service.NoticeVO;
import co.hanki.mybatis.notice.serviceImpl.NoticeServiceImpl;

public class NoticeSelect implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberVO mvo = new MemberVO();
		mvo.setId((String)session.getAttribute("id"));
		mvo.setAuthor((String)session.getAttribute("author"));
		NoticeService noticeDao =new NoticeServiceImpl();
		NoticeVO vo= new NoticeVO();
		vo.setNid(Integer.valueOf(request.getParameter("nid")));
		vo=noticeDao.noticeSelect(vo);
		request.setAttribute("member", mvo);
		request.setAttribute("notice", vo);
		return "notice/noticeSelect";
	}

}

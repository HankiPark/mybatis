package co.hanki.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.notice.service.NoticeService;
import co.hanki.mybatis.notice.service.NoticeVO;
import co.hanki.mybatis.notice.serviceImpl.NoticeServiceImpl;

public class NoticeDelete implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		int n =0;
		String page=null;
		NoticeVO vo = new NoticeVO();
		NoticeService noticeDao = new NoticeServiceImpl();
		vo.setNid(Integer.valueOf(request.getParameter("nid")));
		n= noticeDao.noticeDelete(vo);
		if(n!=0) {
			page="noticeList.do";
		}else {
			request.setAttribute("message", "삭제에 실패했습니다.");
			page="noticeFail.do";
		}
		return page;
	}

}

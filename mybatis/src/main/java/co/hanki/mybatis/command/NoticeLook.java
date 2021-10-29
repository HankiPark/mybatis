package co.hanki.mybatis.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.notice.service.NoticeService;
import co.hanki.mybatis.notice.service.NoticeVO;
import co.hanki.mybatis.notice.serviceImpl.NoticeServiceImpl;

public class NoticeLook implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		List<NoticeVO> list = new ArrayList<NoticeVO>();
		String page=null;
		NoticeVO vo = new NoticeVO();
		NoticeService noticeDao = new NoticeServiceImpl();		
		if(request.getParameter("chwhat").equals("제목")) {
			request.removeAttribute("message");
			vo.setTitle(request.getParameter("tt"));
			list=noticeDao.noticeSelectTiList(vo);
			if(list.isEmpty()) {
				
				request.setAttribute("message", "검색결과가 없습니다.");
				page="noticeList.do";
			}else {
			request.setAttribute("notices", list);
			page="notice/noticeList";}
		}
		else if(request.getParameter("chwhat").equals("작성자")) {
			request.removeAttribute("message");
			vo.setName(request.getParameter("tt"));
			list=noticeDao.noticeSelectNaList(vo);
			if(list.isEmpty()) {
				
				request.setAttribute("message", "검색결과가 없습니다.");
				page="noticeList.do";
			}else {
			request.setAttribute("notices", list);
		page="notice/noticeList";	
		}}
		return page;
	}

}

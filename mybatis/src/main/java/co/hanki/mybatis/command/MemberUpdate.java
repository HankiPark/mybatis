package co.hanki.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.member.service.MemberService;
import co.hanki.mybatis.member.service.MemberVO;
import co.hanki.mybatis.member.serviceImpl.MemberServiceImpl;

public class MemberUpdate implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		int n=0;
		String page=null;
		MemberVO vo= new MemberVO();
		HttpSession session = request.getSession();
		MemberService memberDao = new MemberServiceImpl();
		vo.setId((String) session.getAttribute("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setAuthor(request.getParameter("author"));
		n =memberDao.MemberUpdate(vo);
		if(n!=0) {
		page="memberSelect.do";	
		}else {
			page="memberUpdateForm.do";	
		}
		return page;
	}

}

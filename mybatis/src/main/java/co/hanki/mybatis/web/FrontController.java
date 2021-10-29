package co.hanki.mybatis.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.hanki.mybatis.comm.Command;
import co.hanki.mybatis.command.HomeCommand;
import co.hanki.mybatis.command.MemberDelete;
import co.hanki.mybatis.command.MemberJoin;
import co.hanki.mybatis.command.MemberJoinForm;
import co.hanki.mybatis.command.MemberList;
import co.hanki.mybatis.command.MemberLogOut;
import co.hanki.mybatis.command.MemberLogin;
import co.hanki.mybatis.command.MemberLoginForm;
import co.hanki.mybatis.command.MemberSelect;
import co.hanki.mybatis.command.MemberUpdate;
import co.hanki.mybatis.command.MemberUpdateForm;
import co.hanki.mybatis.command.NoticeDelete;
import co.hanki.mybatis.command.NoticeEdit;
import co.hanki.mybatis.command.NoticeFail;
import co.hanki.mybatis.command.NoticeForm;
import co.hanki.mybatis.command.NoticeInsert;
import co.hanki.mybatis.command.NoticeList;
import co.hanki.mybatis.command.NoticeLook;
import co.hanki.mybatis.command.NoticeSelect;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();
       
   
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		map.put("/home.do", new HomeCommand());
		map.put("/memberList.do", new MemberList()); //멤버 리스트 전부 가져오기
		map.put("/memberSelect.do", new MemberSelect()); //멤버 한명 가져오기
		map.put("/memberLoginForm.do", new MemberLoginForm()); //로그인 화면
		map.put("/memberLogin.do", new MemberLogin()); //로그인 로직
		map.put("/memberUpdateForm.do", new MemberUpdateForm()); //회원정보 수정 화면
		map.put("/memberUpdate.do", new MemberUpdate());// 수정 로직
		map.put("/memberDelete.do", new MemberDelete());//삭제
		map.put("/memberLogOut.do", new MemberLogOut());//로그아웃
		map.put("/memberJoinForm.do", new MemberJoinForm()); //회원가입 화면
		map.put("/memberJoin.do", new MemberJoin());//회원가입 로직
	
		
		
		map.put("/noticeList.do", new NoticeList()); //공지사항 목록
		map.put("/noticeForm.do",new NoticeForm()); //공지사항 만들기
		map.put("/noticeInsert.do", new NoticeInsert()); //공지사항 추가
		map.put("/noticeSelect.do", new NoticeSelect()); //공지사항 세부보기
		map.put("/noticeEdit.do", new NoticeEdit());
		map.put("/noticeFail.do", new NoticeFail());
		map.put("/noticeDelete.do", new NoticeDelete());
		map.put("/noticeLook.do", new NoticeLook());
		
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String contextPath= request.getContextPath();
		String co =uri.substring(contextPath.length());
		
		Command command =map.get(co);
		String viewPage = command.run(request, response);
		if(!viewPage.endsWith(".do")) {
			viewPage="WEB-INF/views/"+ viewPage+".jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}

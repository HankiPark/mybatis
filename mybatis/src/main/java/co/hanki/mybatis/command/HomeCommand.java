package co.hanki.mybatis.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.hanki.mybatis.comm.Command;

public class HomeCommand implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		
		return "home/home";
	}

}

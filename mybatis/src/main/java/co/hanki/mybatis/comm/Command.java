package co.hanki.mybatis.comm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	String run(HttpServletRequest request, HttpServletResponse response);
}

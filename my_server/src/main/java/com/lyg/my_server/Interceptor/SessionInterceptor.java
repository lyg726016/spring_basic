package com.lyg.my_server.Interceptor;

import java.io.IOException;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


import com.lyg.my_server.Dao.myDaoImpl;

/*login �� ���� Ȯ�� �� ���ѿ� ������ ���� Ȯ��*/


public class SessionInterceptor extends HandlerInterceptorAdapter {

	@Resource(name = "myDaoImpl")
	private myDaoImpl myDaoImpl;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws IOException {
		System.out.println("SessionInterceptor INIT");

		String reqUrl = request.getRequestURI().toString();
			

		return true;
	}
}
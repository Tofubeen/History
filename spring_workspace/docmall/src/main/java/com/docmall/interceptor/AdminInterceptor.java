package com.docmall.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.docmall.domain.AdminVO;

public class AdminInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {


		boolean result = false;

		HttpSession session = request.getSession();
		AdminVO user = (AdminVO)session.getAttribute("adminStatus");

		if(user == null) { //인증정보가 없는 경우

			result = false; // 컨트롤러로 진행을 하지 못한다

			if(isAjaxRequest(request)) {

				//상태코드 값을 전송하는 기능
				response.sendError(400); //클라이언트 쪽에 ajax 구문에서 error :동작됨

			}else {
				getTargetUrl(request);
				response.sendRedirect("/admin/intro");
			}

		}else { //인증정보가 있는 경우. 즉 세션 "loginStatus" 정보가 존재 (사용자는 로그인중)

			result = true; //컨트롤러로 진행을 하게된다

		}

		//preHandler에 리턴값이 true면 컨트롤러로 진행하고 false면 컨트롤러로 진행하지 못한다
		return result;
	}

	//인증되지 않은 상태에서 사용자가 요청한 URL을 저장하고, 로그인 후 URL로 리다이렉트 작업
	private void getTargetUrl(HttpServletRequest request) {

		String uri = request.getRequestURI();
		String query = request.getQueryString();

		if(query == null || query.equals("null")) {
			query = "";
		}else {
			query = "?" + query;
		}

		String targetUrl = uri + query;

		if(request.getMethod().equals("GET")) {
			request.getSession().setAttribute("target", targetUrl);
		}
	}

	//사용자 요청이 ajax 요청인지 체크
	private boolean isAjaxRequest(HttpServletRequest request) {

		boolean isAjax = false;

		String header = request.getHeader("AJAX");
		if(header != null && header.equals("true")) {
			isAjax = true;
		}

		return isAjax;
	}
}

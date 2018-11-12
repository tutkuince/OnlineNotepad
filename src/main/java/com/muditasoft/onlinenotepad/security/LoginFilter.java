package com.muditasoft.onlinenotepad.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.muditasoft.onlinenotepad.model.User;

@Component
@Scope("session")
public class LoginFilter implements HandlerInterceptor {

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		if (request.getRequestURI().contains("login")) {
			HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
			return;
		}

		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
			return;
		} else {
			response.sendRedirect("http://localhost:8080/onlinenotepad/showlogin");
		}

		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
}

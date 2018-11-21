package com.javalec.guestbook.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInController {
	@RequestMapping("login.do")
	public String login(HttpServletRequest request, HttpSession session) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		session = request.getSession();
		
		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
		
		
		
		return "getguestbooklist.do";
	}
}

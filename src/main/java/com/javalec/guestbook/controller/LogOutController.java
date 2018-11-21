package com.javalec.guestbook.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogOutController {

	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "loginform.jsp";
	}
}

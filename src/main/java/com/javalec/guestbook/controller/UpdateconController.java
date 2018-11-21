package com.javalec.guestbook.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpdateconController {

	@RequestMapping("/updatecon.do")
	public String updatecon(HttpServletRequest request) {
		if (request.getParameter("pwcon").equals(request.getParameter("password"))) {
			return "updateform.jsp";

		} else {
			return "getguestbooklist.do";

		}
	}
}

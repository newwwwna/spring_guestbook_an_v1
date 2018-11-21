package com.javalec.guestbook.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class UpdateFormController {

	@RequestMapping("/updateform.do")
	public String updateForm() {
		
		return "updateform.jsp";
	}
}

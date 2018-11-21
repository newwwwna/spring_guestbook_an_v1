package com.javalec.guestbook.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteFormController {

	@RequestMapping("/deleteform.do")
	public String deleteForm() {
		
		return "deleteform.jsp";
	}
}

package com.javalec.guestbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddFormController {

	@RequestMapping("/addform.do")
	public String addForm() {
		
		return "addform.jsp";
	}
}

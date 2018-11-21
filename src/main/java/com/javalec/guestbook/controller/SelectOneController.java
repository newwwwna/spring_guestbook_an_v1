package com.javalec.guestbook.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

@Controller
public class SelectOneController {

	@RequestMapping("/selectone.do")
	public String selectone(GuestBookDAO dao, Model model, HttpServletRequest request, GuestBookVO vo) {
	
		
		vo=dao.getGuestBook(vo);
		model.addAttribute("vo", vo);
		
		return "selectone.jsp";
		
	}
}

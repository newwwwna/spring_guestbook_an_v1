package com.javalec.guestbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

@Controller
public class AddController {
	@RequestMapping("/add.do")
	public String add(GuestBookVO vo, GuestBookDAO dao) {
	
		dao.insert(vo);
		return "getguestbooklist.do";
		
	}
}

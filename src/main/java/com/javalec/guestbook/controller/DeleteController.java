package com.javalec.guestbook.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

@Controller
public class DeleteController {

	@RequestMapping("/delete.do")
	public String delete(GuestBookDAO dao, GuestBookVO vo) {
		dao.delete(vo);
		return "getguestbooklist.do";
	}
}

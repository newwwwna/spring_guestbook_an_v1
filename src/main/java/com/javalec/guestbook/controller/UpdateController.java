package com.javalec.guestbook.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

@Controller
public class UpdateController {

	@RequestMapping("/update.do")
	public String update(GuestBookDAO dao, GuestBookVO vo) {
		
		dao.update(vo);
		
		return "getguestbooklist.do";
	}
}

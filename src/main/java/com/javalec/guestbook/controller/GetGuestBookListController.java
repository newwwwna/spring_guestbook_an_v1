package com.javalec.guestbook.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.guestbook.dao.GuestBookDAO;
import com.javalec.guestbook.vo.GuestBookVO;

@Controller
public class GetGuestBookListController {

	@RequestMapping("/getguestbooklist.do")
	public String getList(GuestBookDAO dao, Model model, HttpServletRequest req, HttpSession session) {
		session = req.getSession();
		String id = (String) session.getAttribute("id");
		String pw = (String) session.getAttribute("pw");

	
		if (session.isNew() || id == null) {
			return "loginform.jsp";

		} else {

			String keyword = req.getParameter("search");
			List<GuestBookVO> list = null;

			
			String select = req.getParameter("select");
			dao = new GuestBookDAO();

				
			if (keyword != null) {
				if (select.equals("name")) {	
					list = dao.nameSearch(keyword);	
				} else {	
					list = dao.search(keyword);	
				}
			} else {	
				list = dao.getGuestBookList();
			}
			model.addAttribute("list", list);
			return "index.jsp";
		}
	}
}

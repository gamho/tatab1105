package com.bit.tatab.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@ResponseBody
	@RequestMapping(value="/board.do")
	public ModelAndView board(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView("board");
		
		String projectName = request.getParameter("projectNames");
		
		HttpSession session = request.getSession();
		session.setAttribute("projectName", projectName);
		
		System.out.println("board 프로젝트 이름 "+projectName);
		
		mav.addObject("projectName", projectName);
		
		return mav;
	}
}

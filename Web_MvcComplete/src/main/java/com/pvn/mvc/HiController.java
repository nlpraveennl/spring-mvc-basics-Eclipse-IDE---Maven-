package com.pvn.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class HiController extends AbstractController 
{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("Simple Hi Controller");
		
		String message = request.getParameter("name");
		System.out.println(message);
		return new ModelAndView("hi", "message", message);
	}

}

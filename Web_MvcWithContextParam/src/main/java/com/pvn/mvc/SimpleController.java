package com.pvn.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class SimpleController extends AbstractController 
{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("Handling Request Simple");
		
		String message = request.getParameter("name");
		return new ModelAndView("simple", "message", message);
	}

}

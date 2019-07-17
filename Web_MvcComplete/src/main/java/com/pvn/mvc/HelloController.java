package com.pvn.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


public class HelloController extends AbstractController 
{
	private static final Logger OUT = LoggerFactory.getLogger(HelloController.class);
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		OUT.info("Simple Hello Controller");
		
		String message = request.getParameter("name");
		System.out.println(message);
		return new ModelAndView("hello", "message", message);
	}

}

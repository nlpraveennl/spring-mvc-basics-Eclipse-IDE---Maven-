package com.pvn.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;


public class ParameterizableViewControllerExample extends ParameterizableViewController 
{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		System.out.println("Parameterizable View Controller");
		
		String message = request.getParameter("name");
		System.out.println(message);
		return new ModelAndView(this.getViewName(), "message", message);
	}

}

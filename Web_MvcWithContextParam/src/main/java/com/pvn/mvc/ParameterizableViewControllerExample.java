package com.pvn.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

public class ParameterizableViewControllerExample extends ParameterizableViewController
{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp)
	throws Exception 
	{
		System.out.println("Handling Request using ParameterizableViewController");
		String name=req.getParameter("name");
		return new ModelAndView(this.getViewName(), "name", name);
	}
}

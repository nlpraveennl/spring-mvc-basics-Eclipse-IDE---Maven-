package com.pvn.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.pvn.model.Circle;


public class GreetingController extends AbstractController 
{
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("Handling Request Greetings");
		WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
		Circle circle = (Circle) ctx.getBean("circle");
		System.out.println(circle.getName());
		
		String message = request.getParameter("name");
		return new ModelAndView("greetings", "message", message);
	}

}

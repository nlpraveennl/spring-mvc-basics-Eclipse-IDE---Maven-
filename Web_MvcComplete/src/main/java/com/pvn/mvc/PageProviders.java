package com.pvn.mvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.UrlFilenameViewController;

public class PageProviders extends UrlFilenameViewController
{
	private static final Logger OUT = LoggerFactory.getLogger(HelloController.class);

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
	{
		OUT.info("Handling Request Url File Name view controller");
		OUT.info("view extracted from url by UrlFilenameViewController {}" , this.getViewNameForRequest(request));
		
		Map<String, String> map = new HashMap<>();
		map.put("name", "User");
		map.put("impl", "UrlFilenameViewController");
		return new ModelAndView(this.getViewNameForRequest(request), "map", map);
	}
}

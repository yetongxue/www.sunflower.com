package com.sunflower.asone.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "index")
public class indexController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value = "/index", method = { RequestMethod.GET })
	public String index() {
		System.out.println("232");
		return "index";
	}
}

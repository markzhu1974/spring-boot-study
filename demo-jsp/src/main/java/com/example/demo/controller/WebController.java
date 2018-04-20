package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/web")
public class WebController {
	private static final Logger logger = LoggerFactory.getLogger(WebController.class);
		
	@RequestMapping("index")
	public String index(ModelMap map) {
		logger.info("This is the index of Web Controller");
		map.put("name", "Mark");
		return "index";
	}

	@RequestMapping("index2")
	public String index2(ModelMap map) {
		logger.info("This is the 7-1 of Web Controller");
		map.put("name", "Frank");
		return "7-1.html";
	}

}

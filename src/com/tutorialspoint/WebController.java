package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.apache.log4j.Logger;

@Controller
// @RequestMapping("/")
public class WebController {

	private static final Logger log = Logger.getLogger(WebController.class.getName());

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
	
		return "hello";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		System.out.println(System.getProperty("${catalina.base}")  + "  /  "+System.getProperty("log4j.appender.FILE.File")); 
		log.info("Going to printHello");
		return "index";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect() {

		return "redirect:finalPage";
	}

	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage() {

		return "final";
	}

}
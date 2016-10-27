package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
// @RequestMapping("/")
public class WebController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");

		return "hello";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
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
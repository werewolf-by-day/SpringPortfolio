package com.jasonswitzer.portfolio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "forward:/index.html";
		
	}
	@RequestMapping("/about")
	public String about() {
		return "forward:/me.html";
	}	
		
	@RequestMapping("/proj")
	public String proj() {
		return "forward:/projects.html";
	}	

}

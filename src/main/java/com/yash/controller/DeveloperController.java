package com.yash.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/developer")
public class DeveloperController {

	
	@GetMapping("/get")
	public String getDeveloper()
	{
		return "developer";
	}
}
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HomrInterface;

@RestController
@RequestMapping("/api")
public class HomeController {

	@Qualifier("HomeService")
	@Autowired
	
	HomrInterface homeInterface;
	
	@GetMapping("/test")
	public String test()
	{
		return homeInterface.test();
	}
	
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CustomConfigForDbService;

@RestController
public class CustomConfigForDbController {
	@Autowired
	public CustomConfigForDbService CustomConfigForDbService;
	
	@GetMapping("/test")
	public String test()
	{
		CustomConfigForDbService.getData();
		return "Service is on!!";
	}

}

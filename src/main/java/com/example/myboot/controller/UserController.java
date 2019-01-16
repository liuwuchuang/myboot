package com.example.myboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Value("${project.name}")
	private String env;

	@RequestMapping(value="/env",method=RequestMethod.GET)
	public String getEnv() {
		return env;
	}
}

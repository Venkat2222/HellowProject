package com.example.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	public String hello() {
		return "java";
	}
	

}

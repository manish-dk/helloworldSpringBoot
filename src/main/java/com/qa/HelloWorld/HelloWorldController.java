package com.qa.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String index()
	{
		return "Hello World, this is Spring Boot";
	}
	@RequestMapping("/test")
	public String index1()
	{
		return "Hello Wor121213332ld, this is Spring Boot";
	}
}

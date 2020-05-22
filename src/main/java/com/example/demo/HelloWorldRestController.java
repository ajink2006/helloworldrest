package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldRestController {
	
	@GetMapping("/hi")
	public String sayHello()
	{
		return "Hi AJit";
	}
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello AJit";
	}

}

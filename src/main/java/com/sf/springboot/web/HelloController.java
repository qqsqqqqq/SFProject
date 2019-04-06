package com.sf.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/a")
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring Boot!";
	}

}

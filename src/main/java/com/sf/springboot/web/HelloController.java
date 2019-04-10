package com.sf.springboot.web;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sf.springboot.exception.SFRuntimeException;

@Controller
//@RequestMapping("/a")
public class HelloController {

	@RequestMapping("/hello")
	public String hello(Model m) throws Exception {
		m.addAttribute("now", DateFormat.getDateInstance().format(new Date()));
		boolean truea = true;
		if (truea) {
			throw new SFRuntimeException();
		}
		return "hello";
	}

	@RequestMapping("/helloError")
	public String hello2(Model m) throws Exception {
		m.addAttribute("now", DateFormat.getDateInstance().format(new Date()));
		boolean truea = true;
		if (truea) {
			throw new Exception("Global Exception");
		}
		return "hello";
	}
}

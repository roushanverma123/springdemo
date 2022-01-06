package com.roushanv.test.springdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String test() {
		String v = "Hello world";
		return  v.toString();
	}
}

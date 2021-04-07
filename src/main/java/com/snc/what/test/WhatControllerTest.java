package com.snc.what.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhatControllerTest {
	
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello pring boot</h1>";
	}
	
}

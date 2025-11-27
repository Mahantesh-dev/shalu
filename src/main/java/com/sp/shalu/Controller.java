package com.sp.shalu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/Shalu")
public String greet() {
	System.out.println("hello");
	System.out.println("===========");
	System.out.println("Welcome to my hoome");
	return "welcome to my home";
}
}

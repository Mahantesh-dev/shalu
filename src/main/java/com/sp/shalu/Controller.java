package com.sp.shalu;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/Shalu")
public String greet() {
	System.out.println("hello");
	return "welcome";
}
}

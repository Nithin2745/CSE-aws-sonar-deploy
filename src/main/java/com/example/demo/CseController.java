package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/hi")
	public String hi(@RequestParam int a, @RequestParam int b) {
		return "Hi, My name is Nithin with roll:23MH1A05L8. The product of "+a+" and "+b+" is "+ (a*b);
	}
}

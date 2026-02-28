package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/cseadd")
	public int add(@RequestParam int a, @RequestParam int b) {
		return a+b;
	}
	@GetMapping("/hello")
	public String Hello(@RequestParam String name) {
		return "Hello "+name;
	}
	@GetMapping("/hi")
	public String Hi() {
		return "Hi, My name is Nithin with roll:23MH1A05L8";
	}
}

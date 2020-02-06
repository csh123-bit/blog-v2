package com.cos.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping("/user/join")
	public String join() {
		System.out.println("들어옴");
		return"/user/join";
	}
	
	@GetMapping("/user/login")
	public String login() {
		System.out.println("들어옴");
		return"/user/login";
	}
	@GetMapping("/user/profile/{id}")
	public String profile() {
		System.out.println("들어옴");
		return"/user/profile";
	}
}

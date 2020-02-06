package com.cos.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
	
	@GetMapping({"","/","post"})

	public String posts() {
		System.out.println("들어옴");
		return"/post/list";
		
	}
	@GetMapping("/post/{id}")
	public String post() {
		System.out.println("들어옴");
		return "/post/detail";
	}
	
	@GetMapping("/post/write")
	public String write() {
		System.out.println("들어옴");
		return "/post/write";
	}
	
	@GetMapping("/post/update/{id}")
	public String update() {
		System.out.println("들어옴");
		return "/post/update";
	}

}

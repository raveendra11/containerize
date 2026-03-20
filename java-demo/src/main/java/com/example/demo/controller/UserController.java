package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class UserController {
	@GetMapping("/message")
	public String message() {
		return "Hello, I'm practicing on containerizing this app!";
	}
}
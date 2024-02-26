package com.decodingcloud.todo.controller;

//WelcomeController.java
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class WelcomeController {

	@GetMapping
	public String welcome() {
		return "Welcome to decodingcloud. This is sample TODO app";
	}

}

package com.projectbook.bookstoremanager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    
	@GetMapping
	public String hello() {
		return "teste aplication base 2";
	}
}

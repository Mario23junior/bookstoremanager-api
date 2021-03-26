package com.projectbook.bookstoremanager.author.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectbook.bookstoremanager.author.Service.AuthorService;

@RestController
@RequestMapping("/api/v1/authores")
public class AuthorController implements AuthorControllerDocs {
      
	private AuthorService authorService;
	
	public AuthorController(AuthorService authorService) {
		this.authorService = authorService;
 	}
	
	
}

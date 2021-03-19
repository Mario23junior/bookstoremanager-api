package com.projectbook.bookstoremanager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    
	
	@ApiOperation(value = "Retornando mensagem de exemplo ola mundo")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Methodo executado com sucesso")
	})
	@GetMapping
	public String hello() {
		return "teste aplication horrrrr";
	}
}

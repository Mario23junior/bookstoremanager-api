package com.projectbook.bookstoremanager.author.builder;

import com.projectbook.bookstoremanager.author.dto.AuthorDTO;

import lombok.Builder;

@Builder
public class AuthorDTOBuilder {
    
	@Builder.Default
	private final Long id = 1L; 
	
	@Builder.Default
	private final String name = "Mario junior";
	 
	@Builder.Default
	private final Integer age = 11;
	
	 public AuthorDTO builderAuthorDTO() {
		 return new AuthorDTO(id, name, age);
	 }
	 
	
	
}

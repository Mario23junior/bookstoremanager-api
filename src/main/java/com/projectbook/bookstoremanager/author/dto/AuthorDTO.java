package com.projectbook.bookstoremanager.author.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class AuthorDTO {
    
	 
	 private Long id;
	 
	 @NotNull
	 @NotEmpty
	 @Size(max = 255)
 	 private String name;
	 
	 @NotNull
	 @Max(120)
 	 private Integer age;

	 public AuthorDTO() {
		// TODO Auto-generated constructor stub
	}
	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	 
	
}

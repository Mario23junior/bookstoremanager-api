package com.projectbook.bookstoremanager.author.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectbook.bookstoremanager.author.mapper.AuthorMapper;
import com.projectbook.bookstoremanager.author.repository.AuthorRepository;

@Service
public class AuthorService {
   
	private final static AuthorMapper AUTHOR_MAPPER = AuthorMapper.INCTANCE;
	
	private AuthorRepository authorRepository;
	
	@Autowired
	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
 	}
	
	
}

package com.projectbook.bookstoremanager.author.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.projectbook.bookstoremanager.author.Service.AuthorService;
import com.projectbook.bookstoremanager.author.builder.AuthorDTOBuilder;
import com.projectbook.bookstoremanager.author.mapper.AuthorMapper;
import com.projectbook.bookstoremanager.author.repository.AuthorRepository;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {
  
	private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;
	
	@Mock
	private AuthorRepository authroRepository;
	
	@InjectMocks
	private AuthorService authrAuthorService;
	
	private AuthorDTOBuilder authorDTOBuilder;
	
	@BeforeEach
	void setUp() {
		authorDTOBuilder = AuthorDTOBuilder.builder().build();
	}
}

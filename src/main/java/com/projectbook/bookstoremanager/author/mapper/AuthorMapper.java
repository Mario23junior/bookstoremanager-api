package com.projectbook.bookstoremanager.author.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.projectbook.bookstoremanager.author.dto.AuthorDTO;
import com.projectbook.bookstoremanager.author.entity.Author;

@Mapper
public interface AuthorMapper {
   
	AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);
	
	Author toModel(AuthorDTO authorDTO);
	
	AuthorDTO toDTO(Author author);
}

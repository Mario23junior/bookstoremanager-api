package com.projectbook.bookstoremanager.author.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectbook.bookstoremanager.author.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}

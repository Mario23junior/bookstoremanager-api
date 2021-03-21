package com.projectbook.bookstoremanager.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectbook.bookstoremanager.Book.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}

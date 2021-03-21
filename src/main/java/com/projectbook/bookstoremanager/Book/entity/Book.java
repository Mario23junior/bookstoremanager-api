package com.projectbook.bookstoremanager.Book.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.projectbook.bookstoremanager.Publisher.entity.Publisher;
import com.projectbook.bookstoremanager.User.entity.User;
import com.projectbook.bookstoremanager.author.entity.Author;
import com.projectbook.bookstoremanager.entity.Auditable;

@Entity
public class Book extends Auditable {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false)
	private String isbn;
	
	@Column(columnDefinition = "integer default 0")
	private int page;
	
	@Column(columnDefinition = "integer default 0")
	private int chapters;

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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	private Author author;
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	public Publisher publisher;
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	private User user;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}



















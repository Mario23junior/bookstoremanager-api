package com.projectbook.bookstoremanager.Publisher.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.projectbook.bookstoremanager.Book.entity.Book;

@Entity
public class Publisher {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true, length = 100)
	private String code;
	
	@Column(nullable = false, unique = true , columnDefinition = "TIMESTAMP")
	private LocalDate fundationDate;
	
	@OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
	 private List<Book> books;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDate getFundationDate() {
		return fundationDate;
	}

	public void setFundationDate(LocalDate fundationDate) {
		this.fundationDate = fundationDate;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	
	
}

package com.projectbook.bookstoremanager.author.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.projectbook.bookstoremanager.Book.entity.Book;
import com.projectbook.bookstoremanager.entity.Auditable;

@Entity
public class Author extends Auditable {
     
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(nullable = false, unique = true)
	 private String name;
	 
	 @Column(columnDefinition = "integer default 0")
	 private int age;
	 
	 @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
	 private List<Book> books;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	 
}








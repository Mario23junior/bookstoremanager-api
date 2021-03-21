package com.projectbook.bookstoremanager.publishers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectbook.bookstoremanager.Publisher.entity.Publisher;

public interface publishersRepository extends JpaRepository<Publisher, Long>{

}

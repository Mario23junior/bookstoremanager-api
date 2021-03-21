package com.projectbook.bookstoremanager.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectbook.bookstoremanager.User.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

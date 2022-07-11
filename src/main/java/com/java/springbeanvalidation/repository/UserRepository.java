package com.java.springbeanvalidation.repository;

import com.java.springbeanvalidation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
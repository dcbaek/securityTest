package com.example.securityTest.repository;

import com.example.securityTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // findBy 규칙 -> Username뭄법
    // select *from user where username =1?
    public User findByUsername(String username); // jpa query method
}

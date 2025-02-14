package com.example.BuySell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BuySell.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

package com.example.BuySell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BuySell.models.Product;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}

package com.example.BuySell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BuySell.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}

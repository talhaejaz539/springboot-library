package com.example.entityrelationship.repository;


import com.example.entityrelationship.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
package com.example.entityrelationship.repository;


import com.example.entityrelationship.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
package com.example.entityrelationship.repository;


import com.example.entityrelationship.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

}
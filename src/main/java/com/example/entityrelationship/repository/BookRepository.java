package com.example.entityrelationship.repository;


import com.example.entityrelationship.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
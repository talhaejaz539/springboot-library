package com.example.entityrelationship.repository;


import com.example.entityrelationship.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
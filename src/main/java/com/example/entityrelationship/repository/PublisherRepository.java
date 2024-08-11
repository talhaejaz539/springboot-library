package com.example.entityrelationship.repository;

import com.example.entityrelationship.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
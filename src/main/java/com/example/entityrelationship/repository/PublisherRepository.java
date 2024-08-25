package com.example.entityrelationship.repository;

import com.example.entityrelationship.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublisherRepository extends MongoRepository<Publisher, String> {
}
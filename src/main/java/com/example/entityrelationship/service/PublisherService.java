package com.example.entityrelationship.service;

import com.example.entityrelationship.model.Publisher;

import java.util.List;

public interface PublisherService {

    List<Publisher> getAllPublishers();
    Publisher createPublisher(Publisher publisher);

}

package com.example.entityrelationship.controller;

import com.example.entityrelationship.model.Author;
import com.example.entityrelationship.model.Publisher;
import com.example.entityrelationship.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping(path = "/getAllPublishers")
    public List<Publisher> getAllPublishers() {
        return publisherService.getAllPublishers();
    }

    @PostMapping(path = "/createPublisher")
    public Publisher createAuthor(@RequestBody Publisher publisher) {
        return publisherService.createPublisher(publisher);
    }

}

package com.example.entityrelationship.service;

import com.example.entityrelationship.model.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();
    Author createAuthor(Author author);

}

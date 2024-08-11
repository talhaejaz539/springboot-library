package com.example.entityrelationship.controller;

import com.example.entityrelationship.model.Author;
import com.example.entityrelationship.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping(path = "/getAllAuthors")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping(path = "/createAuthor")
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

}

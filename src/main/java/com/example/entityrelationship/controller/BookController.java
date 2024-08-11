package com.example.entityrelationship.controller;

import com.example.entityrelationship.model.Author;
import com.example.entityrelationship.model.Book;
import com.example.entityrelationship.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(path = "/getAllBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping(path = "/createBook")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

}

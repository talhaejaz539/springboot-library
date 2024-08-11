package com.example.entityrelationship.service;

import com.example.entityrelationship.model.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    Book createBook(Book book);

}

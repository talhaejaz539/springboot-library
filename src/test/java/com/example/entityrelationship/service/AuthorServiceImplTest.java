package com.example.entityrelationship.service;

import com.example.entityrelationship.model.Author;
import com.example.entityrelationship.repository.AuthorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceImplTest {

    @Mock
    private AuthorRepository authorRepository;

    @InjectMocks
    private AuthorServiceImpl authorService;

    private Author author1;
    private Author author2;

    @BeforeEach
    void setUp() {
        author1 = new Author("1", "Talha Ejaz");
        author2 = new Author("2", "Talha Minhas");
    }

    @Test
    void testGetAllAuthors() {
        // Mock the repository response
        when(authorRepository.findAll()).thenReturn(Arrays.asList(author1, author2));

        // Call the method
        List<Author> authors = authorService.getAllAuthors();

        // Assertions
        assertEquals(2, authors.size());
        assertEquals("Talha Ejaz", authors.get(0).getName());
        assertEquals("Talha Minhas", authors.get(1).getName());

        // Verify interaction with repository
        verify(authorRepository, times(1)).findAll();
    }

    @Test
    void testCreateAuthor() {
        // Mock repository save method
        when(authorRepository.save(author1)).thenReturn(author1);

        // Call the method
        Author savedAuthor = authorService.createAuthor(author1);

        // Assertions
        assertNotNull(savedAuthor);
        assertEquals("Talha Ejaz", savedAuthor.getName());

        // Verify interaction with repository
        verify(authorRepository, times(1)).save(author1);
    }

}

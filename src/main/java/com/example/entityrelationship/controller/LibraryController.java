package com.example.entityrelationship.controller;



import com.example.entityrelationship.model.Library;
import com.example.entityrelationship.repository.LibraryRepository;
import com.example.entityrelationship.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping(path = "/getAllLibraries")
    public List<Library> getAllLibraries() {
        return libraryService.getAllLibraries();
    }

    @PostMapping(path = "/createLibrary")
    public Library createLibrary(@RequestBody Library library) {
        return libraryService.createLibrary(library);
    }
}
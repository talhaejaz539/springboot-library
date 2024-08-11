package com.example.entityrelationship.service;

import com.example.entityrelationship.model.Library;
import com.example.entityrelationship.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    @Override
    public List<Library> getAllLibraries() {
        return libraryRepository.findAll();
    }

    @Override
    public Library createLibrary(Library library) {
        return libraryRepository.save(library);
    }
}

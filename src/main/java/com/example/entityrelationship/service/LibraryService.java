package com.example.entityrelationship.service;

import com.example.entityrelationship.model.Library;

import java.util.List;

public interface LibraryService {

    List<Library> getAllLibraries();
    Library createLibrary(Library library);

}

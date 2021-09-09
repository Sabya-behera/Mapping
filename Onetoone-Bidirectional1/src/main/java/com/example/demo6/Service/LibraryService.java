package com.example.demo6.Service;

import com.example.demo6.Model.Library;
import com.example.demo6.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService
{
    @Autowired
        LibraryRepository libraryRepository;

        public List<Library> getAllLibrary() {
            return libraryRepository.findAll();
        }

        public Library postAllLibrary(Library library) {
            System.out.println("service");
            return libraryRepository.save(library);
        }
    }

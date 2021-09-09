package com.example.demo6.Controller;

import com.example.demo6.Model.Library;
import com.example.demo6.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController
{
    @Autowired
    LibraryService libraryService;


    @GetMapping("/get2")
    public List<Library> getAllLibrary()
    {
        return libraryService.getAllLibrary();
    }

    @PostMapping("/post2")
    public Library postAllLibrary(@RequestBody Library library)
    {
        System.out.println("controller");
        return libraryService.postAllLibrary(library);
    }
}


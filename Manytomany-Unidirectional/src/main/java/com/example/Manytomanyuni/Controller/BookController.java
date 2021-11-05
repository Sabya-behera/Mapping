package com.example.Manytomanyuni.Controller;

import com.example.Manytomanyuni.Model.Book;
import com.example.Manytomanyuni.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/post")
    public Book saveBook(@RequestBody Book book)
    {
        return bookService.saveBook(book);
    }
    @GetMapping("/get")
    public List<Book> getBooks()
    {
        return bookService.getBooks();
    }
    @GetMapping("/get/{id}")
    public Book getBooksById(@PathVariable("id") int id)
    {
        return bookService.getBooksById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id)
    {
         bookService.deleteBook(id);
         return "DELETED";
    }
    @PutMapping("/put/{id}")
    public Book updateBook(@PathVariable("id") int id,@RequestBody Book book)
    {
         bookService.updateBook(id,book);
         return book;
    }



}

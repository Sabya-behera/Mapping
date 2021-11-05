package com.example.Manytomanyuni.Service;

import com.example.Manytomanyuni.Model.Book;
import com.example.Manytomanyuni.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> getBooks()
    {
        return bookRepo.findAll();
    }

    public Book getBooksById(int id)
    {
        return bookRepo.getById(id);
    }

    public Book saveBook(Book book)
    {
        return bookRepo.save(book);
    }

    public String deleteBook(int id)
    {
        bookRepo.deleteById(id);
        return "Deleted";
    }

    public Book updateBook(int id, Book book)
    {
        Book book1 = bookRepo.getById(id);
        book1.setB_name(book.getB_name());
        book1.setGenre(book.getGenre());
        book1.setPrice(book.getPrice());
        book1.setAuthor(book.getAuthor());
        bookRepo.save(book1);
        return book1;
    }
}

package com.example.Manytomanyuni.Model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookid;
    @Column(name = "B_NAME", nullable = false)
    private String b_name;
    private String genre;
    @Column(scale = 5, precision = 2)
    private double price;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Author> author;

    public Book() {
    }

    public Book(int bookid, String b_name, String genre, double price, List<Author> author) {
        this.bookid = bookid;
        this.b_name = b_name;
        this.genre = genre;
        this.price = price;
        this.author = author;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }
}
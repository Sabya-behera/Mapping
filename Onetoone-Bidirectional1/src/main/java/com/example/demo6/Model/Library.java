package com.example.demo6.Model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "library")
public class Library implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "book")
    private String book;
    @Column(name = "author")
    private String Author;
    @Column(name = "price")
    private long price;


//    @OneToOne
//    @JoinColumn(name = "Student_libraryid")
//    private Student_2 stu;

    public Library() {

    }

//    public Library(int id, String book, String author, long price, Student_2 stu) {
//        this.id = id;
//        this.book = book;
//        Author = author;
//        this.price = price;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

//    public Student_2 getStudent() {
//        return stu;
//    }
//
//    public void setStudent(Student_2 stu) {
//        this.stu = stu;
//    }

//    @Override
//    public String toString() {
//        return "Library{" +
//                "id=" + id +
//                ", book='" + book + '\'' +
//                ", Author='" + Author + '\'' +
//                ", price=" + price +
//                ", stu=" + stu +
//                '}';
//    }

}


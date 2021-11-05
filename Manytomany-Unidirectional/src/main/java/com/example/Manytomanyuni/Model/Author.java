package com.example.Manytomanyuni.Model;

import javax.persistence.*;

@Entity
@Table(name = "Author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorid;
    @Column(name = "A_NAME",nullable = false)
    private String a_name;

    public Author() {
    }

    public Author(int authorid, String a_name) {
        this.authorid = authorid;
        this.a_name = a_name;
    }

    public int getAuthorid() {
        return authorid;
    }

    public void setAuthorid(int authorid) {
        this.authorid = authorid;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }
}

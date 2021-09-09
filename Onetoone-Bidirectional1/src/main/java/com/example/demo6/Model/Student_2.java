package com.example.demo6.Model;


import org.hibernate.dialect.MySQL8Dialect;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student_2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "student Name")
    private String name;
    @Column(name = "branch")
    private String branch;
    @Column(name = "per")
    private double per;

    //joining two tables
//    @OneToOne(targetEntity = Library.class, cascade = CascadeType.ALL)
//    private Library lib;

    public Student_2() {

    }



    public Student_2(int id, String name, String branch, double per) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.per = per;
//        this.lib = lib;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

//    public Library getLibrary() {
//        return lib;
//    }
//
//    public void setLibrary(Library lib) {
//        this.lib = lib;
//    }

//    @Override
//    public String toString() {
//        return "Student_2{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", branch='" + branch + '\'' +
//                ", per=" + per +
//                ", lib=" + lib +
//                '}';
//    }
}

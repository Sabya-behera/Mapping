package com.example.demo12.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pID;
    @Column(name = "PName")
    private String pname;

    @ManyToMany(cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Emp> emp;

    public Project() {
    }

    public Project(int pID, String pname, List<Emp> emp) {
        this.pID = pID;
        this.pname = pname;
        this.emp = emp;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public List<Emp> getEmp() {
        return emp;
    }

    public void setEmp(List<Emp> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Project{" +
                "pID=" + pID +
                ", pname='" + pname + '\'' +
                ", emp=" + emp +
                '}';
    }
}

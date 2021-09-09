package com.example.demo12.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Emp")
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eID;
    @Column(name = "Name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
   @JoinTable(name = "emp_project",joinColumns ={@JoinColumn(name = "EID")},inverseJoinColumns = {@JoinColumn(name = "PID")})
    private List<Project> project;

    public Emp() {

    }

    public Emp(int eID, String name, List<Project> project) {
        this.eID = eID;
        this.name = name;
        this.project = project;
    }

    public int geteID() {
        return eID;
    }

    public void seteID(int eID) {
        this.eID = eID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eID=" + eID +
                ", name='" + name + '\'' +
                ", project=" + project +
                '}';
    }
}

package com.example.demo11.Model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Parent")
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Children")
    private int children;
    private int age;
   @OneToMany(cascade = CascadeType.ALL,mappedBy = "parent")
    private List<Child> child;

    public Parent() {
    }

    public Parent(int id, String name, int children, int age, List<Child> child) {
        this.id = id;
        this.name = name;
        this.children = children;
        this.age = age;
        this.child = child;
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

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Child> getChild() {
        return child;
    }

    public void setChild(List<Child> child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", children=" + children +
                ", age=" + age +
                ", child=" + child +
                '}';
    }
}
package com.example.demo11.Model;


import javax.persistence.*;

@Entity
@Table(name = "Child")
public class Child
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;



    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "PID")
    private Parent parent;

    public Child() {
    }

    public Child(int id, String name, int age, Parent parent) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", parent=" + parent +
                '}';
    }
}

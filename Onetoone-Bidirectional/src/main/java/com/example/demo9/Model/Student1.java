package com.example.demo9.Model;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT1")
public class Student1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private long id;


    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "SECTION")
    private String section;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "student1")
    private Address1 address1;

    public Student1() {

    }

    public Student1(String firstName, String lastName, String section, Address1 address1)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
        this.address1 = address1;
    }

    public Address1 getAddress()
    {
        return address1;
    }

    public void setAddress(Address1 address1)
    {
        this.address1 = address1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student1 [id=" + id + ", firstName=" + firstName + ", lastName="
                + lastName + ", section=" + section + ", address1=" + address1
                +"]";
    }

}

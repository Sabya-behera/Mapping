package com.example.demo7.Model;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {

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

    @OneToOne(cascade = CascadeType.ALL/*,optional = false  Every Student row is bound to have an address relation*/)
   // @JoinColumn(name = "AID") //(Join column suggest that there is column AID(FK) in Student table which will refer to the PK of Address table
   private Address address;

    public Student() {

    }

    public Student(String firstName, String lastName, String section,Address address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.section = section;
        this.address=address;
    }

    public com.example.demo7.Model.Address getAddress() {
        return address;
    }

    public void setAddress(com.example.demo7.Model.Address address) {
        this.address = address;
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
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName="
                + lastName + ", section=" + section + ", address=" + address
                 +"]";
    }

}
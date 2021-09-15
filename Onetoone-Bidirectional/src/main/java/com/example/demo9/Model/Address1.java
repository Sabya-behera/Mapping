package com.example.demo9.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;


    @Entity
    @Table(name = "ADDRESS1")
    public class Address1
    {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ADDRESS_ID")
        private long id;

        @Column(name = "STREET")
        private String street;

        @Column(name = "CITY")
        private String city;

        @Column(name = "COUNTRY")
        private String country;

        @OneToOne(cascade = CascadeType.ALL)
        @JsonBackReference
        private Student1 student1;
        public Address1() {

        }


        public Address1(String street, String city, String country, Student1 student1)
        {
            this.street = street;
            this.city = city;
            this.country = country;
            this.student1 = student1;
        }

        public Student1 getStudent()
        {
            return student1;
        }

        public void setStudent(Student1 student1) {
            this.student1 = student1;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "Address1 [id=" + id + ", street=" + street + ", city=" + city
                    + ", country=" + country + "]";
        }

    }

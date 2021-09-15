package com.example.onetomany.Model;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;
    @Column(name = "Name")
    private String name;
    @Column(name = "Department")
    private String department;
    @Column(name = "Salary")
    private Long salary;

    @OneToMany(mappedBy ="employee",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Address> address;

    public Employee() {
    }

    public Employee(int empid, String name, String department, Long salary, List<Address> address) {
        this.empid = empid;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.address = address;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}

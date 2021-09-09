package com.example.demo8.Model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEES")
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="EMP_ID")
    private Long empId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Department")
    private String department;
    @Column(name = "Salary")
    private Long salary;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinColumn(name="EMP_ID")
    private List<Address> address;

    public Employee()
    {
    }

    public Employee(Long empId, String name, String department, Long salary, List<Address> address) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.address = address;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
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


    @Override
    public String toString() {

        String resp = this.empId+" | "+this.name+" | "+this.department+" | "+this.salary;

        return resp;
    }
}

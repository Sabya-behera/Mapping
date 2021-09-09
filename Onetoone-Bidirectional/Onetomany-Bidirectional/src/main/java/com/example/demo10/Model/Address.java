package com.example.demo10.Model;


import javax.persistence.*;

@Entity
@Table(name="Address")
public class Address{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="A_ID")
    private Long aId;

    @Column(name="mail_ID")
    private String mailID;

    private String stayID;

    @ManyToOne(cascade = CascadeType.ALL)
    private Employee employee;

    public Address()
    {

    }

    public Address(Long aId, String mailID, String stayID,Employee employee) {
        this.aId = aId;
        this.mailID = mailID;
        this.stayID = stayID;
        this.employee=employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public String getMailID() {
        return mailID;
    }

    public void setMailID(String mailID) {
        this.mailID = mailID;
    }

    public String getStayID() {
        return stayID;
    }

    public void setStayID(String stayID) {
        this.stayID = stayID;
    }

}


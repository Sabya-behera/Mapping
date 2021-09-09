package com.example.demo8.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Address()
    {

    }

    public Address(Long aId, String mailID, String stayID) {
        this.aId = aId;
        this.mailID = mailID;
        this.stayID = stayID;
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

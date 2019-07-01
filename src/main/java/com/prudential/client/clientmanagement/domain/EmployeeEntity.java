package com.prudential.client.clientmanagement.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    private String company;
    private String email;
    private String phone;
    private String subject;
    private boolean existingCustomer;

    public EmployeeEntity() {

    }

    public EmployeeEntity(int id, String fullName, String company, String email, String phone, String subject, boolean existingCustomer) {
        this.id = id;
        this.fullName = fullName;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
        this.existingCustomer = existingCustomer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isExistingCustomer() {
        return existingCustomer;
    }

    public void setExistingCustomer(boolean existingCustomer) {
        this.existingCustomer = existingCustomer;
    }

}

package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity // This tells Hibernate to make a table out of this class
@javax.persistence.Entity
public class User {
    //@Id
    @javax.persistence.Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @javax.persistence.GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)

    private Integer id;

    private String name;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
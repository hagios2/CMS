package com.example.accessingdatamysql.Models;

import com.example.accessingdatamysql.Services.UserService;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String email;

    private String name;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    public void setId(Integer Id)
    {
        this.id = Id;
    }

    public Integer getId() {
        return id;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public User( String name, String email, String phone, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public User() {
    }
}

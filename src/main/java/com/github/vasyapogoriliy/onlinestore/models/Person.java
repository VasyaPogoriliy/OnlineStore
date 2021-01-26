package com.github.vasyapogoriliy.onlinestore.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {

    @Id
    @GeneratedValue
    private int id;

    @NotEmpty(message = "empty name")
    @Size(min = 2, max = 30, message = "name is too small or too long")
    private String name;

    @NotEmpty(message = "empty surname")
    @Size(min = 2, max = 30, message = "surname is too small or too long")
    private String surname;

    @NotEmpty(message = "empty email")
    @Email(message = "invalid email")
    private String email;

    public Person(){

    }

    public Person(int id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

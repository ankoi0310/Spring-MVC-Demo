package com.koi.springdemo.model;

import javax.validation.constraints.Size;

public class Customer {

    private String firstName;

    @Size(min = 5)
    private String lastName;

    public Customer() {
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
}

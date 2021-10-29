package com.koi.demo.model;

import javax.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull
    @Size(min = 5)
    private String lastName;

    @Min(value = 18, message = "Must be at least 18")
    @Max(value = 120, message = "Must be less than 120")
    private int age;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 chars/digits")
    private String postalCode;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

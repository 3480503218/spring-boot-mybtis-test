package com.dhm.bean;

public class Employee {
    private String lastName;
    private Integer id;
    private  Integer gender;
    private String email;
    private Integer dId;

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", dId=" + dId +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public Employee() {
    }

    public Employee(String lastName, Integer id, Integer gender, String email, Integer dId) {
        this.lastName = lastName;
        this.id = id;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }
}

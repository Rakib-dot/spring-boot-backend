package com.backend.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int roll;
    private String name;
    private String Address;

    public Student(int roll, String name, String address) {
        this.roll = roll;
        this.name = name;
        this.Address = address;
    }

    public Student() {
        super();
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}


package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "new_student")
public class Student {
    @Id
    private int id;
    private String name;
    private String address;
    private Certificate C1;

    public Certificate getC1() {
        return C1;
    }

    public void setC1(Certificate c1) {
        C1 = c1;
    }

    // Public no-arg constructor for Hibernate
    public Student() {
    }

    // Constructor to initialize values
    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // (Optional) Setters if needed
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

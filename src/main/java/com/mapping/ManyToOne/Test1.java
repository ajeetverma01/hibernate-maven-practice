package com.mapping.ManyToOne;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;


@Entity
@Table(name = "test1")
public class Test1 {

    @Id
    private int id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    private Test2 test2; // ManyToOne relationship

    // Constructors
    public Test1() {
    }

    public Test1(int id, String name, Test2 test2) {
        this.id = id;
        this.name = name;
        this.test2 = test2;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }
}

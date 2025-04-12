package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "new_student")
public class Student {
    @Id
    int id;
    String name;
    String address;

    Student(int id, String name, String address) {
        this.id=id;
        this.name=name;
        this.address=address;
    }
}

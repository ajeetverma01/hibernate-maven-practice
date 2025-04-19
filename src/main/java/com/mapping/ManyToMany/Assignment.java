package com.mapping.ManyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Assignment {
    @Id
    private int aId;
    private String aName;

    @ManyToMany(mappedBy = "assignments")
    private List<Employee> employees;

    public Assignment(int aId, String aName) {
        this.aId = aId;
        this.aName = aName;
    }

    public Assignment() {
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

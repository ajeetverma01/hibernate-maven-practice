package com.mapping.ManyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    @Id
    private int eId;
    private String eName;
    @ManyToMany
    @JoinTable(name = "Emp_Join_Assignment",
            joinColumns = {@JoinColumn(name = "eId_FK")},
            inverseJoinColumns = {@JoinColumn(name = "aId_FK")}
    )

    private List<Assignment> assignments;


    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public Employee(int eId, String eName) {
        this.eId = eId;
        this.eName = eName;
    }

    public Employee() {
        super();
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

}

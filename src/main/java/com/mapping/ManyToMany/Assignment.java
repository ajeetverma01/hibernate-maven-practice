package com.mapping.ManyToMany;

public class Assignment {
    private int aId;
    private String aName;

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
}

package com.netcracker.financeapp.mapping;

public class Type implements java.io.Serializable {

    private int idType;
    private String name;
    private int idParent;

    public Type() {
    }

    public Type(int idType) {
        this.idType = idType;
    }

    public Type(int idType, String name, int idParent) {
        this.idType = idType;
        this.name = name;
        this.idParent = idParent;
    }

    public int getIdType() {
        return this.idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }

    public int getIdParent() {
        return idParent;
    }
}

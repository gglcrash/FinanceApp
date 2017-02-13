package com.netcracker.financeapp.mapping;

public class SpendingsType  implements java.io.Serializable {

     private int idType;
     private String name;

    public SpendingsType() {
    }

	
    public SpendingsType(int idType) {
        this.idType = idType;
    }
    public SpendingsType(int idType, String name) {
       this.idType = idType;
       this.name = name;
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
}



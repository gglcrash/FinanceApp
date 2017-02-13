package com.netcracker.financeapp.mapping;

public class IncomeType  implements java.io.Serializable {

     private int idType;
     private String name;

    public IncomeType() {
    }

	
    public IncomeType(int idType) {
        this.idType = idType;
    }
    public IncomeType(int idType, String name) {
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



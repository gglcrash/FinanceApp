package com.netcracker.financeapp.mapping;
// Generated Feb 11, 2017 12:29:32 PM by Hibernate Tools 4.3.1


import java.util.Date;

public class Finance  implements java.io.Serializable {

     private int idFinance;
     private int typeId;
     private int value;
     private String description;
     private Date date;

    public Finance() {
    }
	
    public Finance(int idFinance) {
        this.idFinance = idFinance;
    }

    public Finance(int idFinance, int typeId, int value, String description, Date date) {
       this.idFinance = idFinance;
       this.typeId = typeId;
       this.value = value;
       this.description = description;
       this.date = date;
    }
   
    public int getIdFinance() {
        return this.idFinance;
    }
    
    public void setIdFinance(int idFinance) {
        this.idFinance = idFinance;
    }
    public int getTypeId() {
        return this.typeId;
    }
    
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
}



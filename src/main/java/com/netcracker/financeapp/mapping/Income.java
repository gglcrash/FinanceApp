package com.netcracker.financeapp.mapping;
// Generated Feb 11, 2017 12:29:32 PM by Hibernate Tools 4.3.1


import java.util.Date;

public class Income  implements java.io.Serializable {


     private int idIncome;
     private int type;
     private int value;
     private String description;
     private Date date;

    public Income() {
    }
	
    public Income(int idIncome) {
        this.idIncome = idIncome;
    }

    public Income(int idIncome, int type, int value, String description, Date date) {
       this.idIncome = idIncome;
       this.type = type;
       this.value = value;
       this.description = description;
       this.date = date;
    }
   
    public int getIdIncome() {
        return this.idIncome;
    }
    
    public void setIdIncome(int idIncome) {
        this.idIncome = idIncome;
    }
    public int getType() {
        return this.type;
    }
    
    public void setType(int type) {
        this.type = type;
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



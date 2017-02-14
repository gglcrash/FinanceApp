package com.netcracker.financeapp.mapping;
// Generated Feb 11, 2017 12:29:32 PM by Hibernate Tools 4.3.1


import java.util.Date;


public class Spendings  implements java.io.Serializable {

     private int idSpending;
     private int type;
     private int value;
     private String description;
     private Date date;

    public Spendings() {
    }

    public Spendings(int idSpending) {
        this.idSpending = idSpending;
    }
    public Spendings(int idSpending, int type, int value, String description, Date date) {
       this.idSpending = idSpending;
       this.type = type;
       this.value = value;
       this.description = description;
       this.date = date;
    }
   
    public int getIdSpending() {
        return this.idSpending;
    }
    
    public void setIdSpending(int idSpending) {
        this.idSpending = idSpending;
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



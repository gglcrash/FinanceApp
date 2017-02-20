package com.netcracker.financeapp.mapping;

public class Agent  implements java.io.Serializable {

     private int idAgent;
     private int accountNumber;
     private String name;

    public Agent() {
    }
	
    public Agent(int idAgent) {
        this.idAgent = idAgent;
    }

    public Agent(int idAgent, int accountNumber, String name) {
       this.idAgent = idAgent;
       this.accountNumber = accountNumber;
       this.name = name;
       }
   
     public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
 
}



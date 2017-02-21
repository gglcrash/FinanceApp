package com.netcracker.financeapp.mapping;

public class Agent implements java.io.Serializable {

    private int idAgent;
    private String accountNumber;
    private String name;

    public Agent() {
    }

    public Agent(int idAgent) {
        this.idAgent = idAgent;
    }

    public Agent(int idAgent, String accountNumber, String name) {
        this.idAgent = idAgent;
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }
}

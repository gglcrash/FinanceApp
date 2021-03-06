package com.netcracker.financeapp.mapping;

public class Transaction  implements java.io.Serializable {

     private int idTransaction;
     private int idType;
     private int idTypeState;
     private int idAgent;
     private int idCard;
     private int idFinance;

    public Transaction() {
    }

    public Transaction(int idType, int idTypeState, int idAgent, int idCard, int idFinance) {
        this.idType = idType;
        this.idTypeState = idTypeState;
        this.idAgent = idAgent;
        this.idCard = idCard;
        this.idFinance = idFinance;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public int getIdType() {
        return idType;
    }

    public int getIdTypeState() {
        return idTypeState;
    }

    public int getIdAgent() {
        return idAgent;
    }

    public int getIdCard() {
        return idCard;
    }

    public int getIdFinance() {
        return idFinance;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public void setIdTypeState(int idTypeState) {
        this.idTypeState = idTypeState;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public void setIdFinance(int ifFinance) {
        this.idFinance = ifFinance;
    }
     
   
}



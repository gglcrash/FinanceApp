package com.netcracker.financeapp.mapping;

import java.util.Date;

public class TransactionObject  implements java.io.Serializable {

     private String transactionTypeName;
     private String financeTypeName;
     private int financeValue;
     private String agentName;
     private String bankCardNumber;
     private Date financeDate;

    public TransactionObject(Type type, Type typeState,Type typeFinance, Agent agent, BankCard bankCard , Finance finance) {
       transactionTypeName = type.getName();
       financeTypeName=typeFinance.getName();
       financeValue=finance.getValue();
       financeDate=finance.getDate();
       agentName=agent.getName();
       bankCardNumber=bankCard.getCardNumber();
    }

    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    public String getFinanceTypeName() {
        return financeTypeName;
    }

    public int getFinanceValue() {
        return financeValue;
    }

    public String getAgentName() {
        return agentName;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public Date getFinanceDate() {
        return financeDate;
    }

    public void setTransactionTypeName(String transactionTypeName) {
        this.transactionTypeName = transactionTypeName;
    }

    public void setFinanceTypeName(String financeTypeName) {
        this.financeTypeName = financeTypeName;
    }

    public void setFinanceValue(int financeValue) {
        this.financeValue = financeValue;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public void setFinanceDate(Date financeDate) {
        this.financeDate = financeDate;
    }
   
}



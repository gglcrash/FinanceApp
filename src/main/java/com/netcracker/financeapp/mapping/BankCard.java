package com.netcracker.financeapp.mapping;

public class BankCard implements java.io.Serializable {

    private int idCard;
    private int amount;
    private int cvv;
    private int expireMonth;
    private int expireYear;
    private String cardNumber;
    private String ownerName;
    private String ownerSurname;

    public BankCard() {
    }

    public BankCard(int amount, int cvv, String cardNumber, String ownerName, String ownerSurname, int expireMonth, int expireYear) {
        this.amount = amount;
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
    }

    public int getIdCard() {
        return idCard;
    }

    public int getAmount() {
        return amount;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public int getExpireMonth() {
        return expireMonth;
    }

    public int getExpireYear() {
        return expireYear;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public void setExpireMonth(int expireMonth) {
        this.expireMonth = expireMonth;
    }

    public void setExpireYear(int expireYear) {
        this.expireYear = expireYear;
    }

}

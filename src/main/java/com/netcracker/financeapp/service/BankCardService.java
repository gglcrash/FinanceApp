/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.netcracker.financeapp.dao.BankCardMapper;
import com.netcracker.financeapp.mapping.BankCard;

@Service
public class BankCardService {

    BankCardMapper bankCardMapper;

    public void setBankCardMapper(BankCardMapper bankCardMapper) {
        this.bankCardMapper = bankCardMapper;
    }

    public BankCard getBankCardByNumber(String cardNumber) {
        return bankCardMapper.getBankCardByNumber(cardNumber);
    }

    public ArrayList<String> getBankCardNumbers() {
        return bankCardMapper.getBankCardNumbers();
    }

    public int insertBankCard(int amount,int cvv,int expireMonth,int expireYear,
            String cardNumber, String ownerName, String ownerSurname){
        return bankCardMapper.insertBankCard(amount,cvv,expireMonth,expireYear,cardNumber, 
                ownerName, ownerSurname);
    }
    
    public int getAllMoney(){
        ArrayList<Integer> allMoneyList = bankCardMapper.getAllMoney();
        int allMoney = 0;
        for(int oneCardMoney : allMoneyList){
            allMoney+=oneCardMoney;
        }
        return allMoney;
    }
    
    public int editCardAmount(int cardId, int newAmount){
        return bankCardMapper.editCardAmount(cardId, newAmount);
    }
}

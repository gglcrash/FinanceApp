/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.beans;

import com.netcracker.financeapp.service.AgentService;
import com.netcracker.financeapp.service.BankCardService;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.SpendingService;
import com.netcracker.financeapp.service.TransactionService;
import com.netcracker.financeapp.service.TypeService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataBean {
    
    @Autowired
    IncomeService incomeService;
    @Autowired
    SpendingService spendingService;
    @Autowired
    TypeService typeService;
    @Autowired
    BankCardService bankCardService;
    @Autowired
    TransactionService transactionService;
    @Autowired
    AgentService agentService;
    
    public String insertIncome(int value, String description, Date date, String typeName){
        int idType = typeService.getTypeByName(typeName).getIdType();
        int idAgent = agentService.getAgentByName("OKEY").getIdAgent();
        int idCard = bankCardService.getBankCardByNumber("1234 1234 1234 1234").getIdCard();
        int idFinance = incomeService.insertIncome(value, description, date, idType);
        int idTypeState = typeService.getTypeByName("COMMITED").getIdType();
        int idTransaction = transactionService.insertTransaction(idType, idTypeState,
                idAgent, idCard, idFinance);

        if (idTransaction > 0) {
            return "success";
        } else {
            return "error";
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Transaction;
import com.netcracker.financeapp.mapping.Type;
import java.util.ArrayList;


public interface TransactionMapper {

    Transaction getTransactionById(int idTransaction);

    Transaction getTransactionByIdFinance(int idFinance);
    
    ArrayList<Transaction> getTransactionsByIdType(int idType);

    ArrayList<Transaction> getTransactionsByIdTypeState(int idTypeState);

    ArrayList<Transaction> getTransactionsByIdAgent(int idAgent);

    ArrayList<Transaction> getTransactionsByIdCard(int idCard);

    ArrayList<Transaction> getTransactionsByIdTypeAndIdCard(int idType, int idCard);

    int insertTransaction(int idType, int idTypeState, int idAgent, int idCard, int idFinance);
}

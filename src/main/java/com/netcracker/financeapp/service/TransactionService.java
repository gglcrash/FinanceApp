/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.netcracker.financeapp.dao.TransactionMapper;
import com.netcracker.financeapp.mapping.Transaction;

@Service
public class TransactionService {

    TransactionMapper transactionMapper;

    public void setTransactionMapper(TransactionMapper transactionMapper) {
        this.transactionMapper = transactionMapper;
    }

    public Transaction getTransactionById(int idTransaction) {
        return transactionMapper.getTransactionById(idTransaction);
    }

    public Transaction getTransactionByIdFinance(int idFinance) {
        return transactionMapper.getTransactionByIdFinance(idFinance);
    }

    public ArrayList<Transaction> getTransactionsByIdType(int idType) {
        return transactionMapper.getTransactionsByIdType(idType);
    }

    public ArrayList<Transaction> getTransactionsByIdAgent(int idAgent) {
        return transactionMapper.getTransactionsByIdAgent(idAgent);
    }

    public ArrayList<Transaction> getTransactionsByIdCard(int idCard) {
        return transactionMapper.getTransactionsByIdCard(idCard);
    }

    public ArrayList<Transaction> getTransactionsByIdTypeAndIdCard(int idType, int idCard) {
        return transactionMapper.getTransactionsByIdTypeAndIdCard(idType, idCard);
    }

    public int insertTransaction(int idType, int idTypeState, int idAgent, int idCard, int idFinance) {
        return transactionMapper.insertTransaction(idType, idTypeState, idAgent, idCard, idFinance);
    }
}

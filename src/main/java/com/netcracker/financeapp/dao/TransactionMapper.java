/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Transaction;
import com.netcracker.financeapp.mapping.Type;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Param;


public interface TransactionMapper {

    Transaction getTransactionById(int idTransaction);

    Transaction getTransactionByIdFinance(int idFinance);
    
    ArrayList<Transaction> getTransactionsByIdType(int idType);

    ArrayList<Transaction> getTransactionsByIdAgent(int idAgent);

    ArrayList<Transaction> getTransactionsByIdCard(int idCard);

    ArrayList<Transaction> getTransactionsByIdTypeAndIdCard(@Param("idType") int idType, 
            @Param("idCard") int idCard);

    int insertTransaction(@Param("idType") int idType,@Param("idTypeState") int idTypeState,
            @Param("idAgent") int idAgent,@Param("idCard") int idCard,@Param("idFinance") int idFinance);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import com.netcracker.financeapp.dao.SpendingsMapper;
import com.netcracker.financeapp.mapping.Income;
import com.netcracker.financeapp.mapping.Spendings;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpendingsService {
    SpendingsMapper spendingsMapper;
    public void setSpendingsMapper(SpendingsMapper spendingsMapper) {
        this.spendingsMapper = spendingsMapper;
    }
    
    public ArrayList<Spendings> getSpendingsList(Date startDate, Date endDate) {
        ArrayList<Spendings> tmp = spendingsMapper.getAllSpendings(startDate, endDate);
        return tmp;
    }
    
    public Spendings getMaxSpendings(){
        return spendingsMapper.getMaxSpending();
    }
   
    public ArrayList<Spendings> getAllSpendingsListByTypeName(String typeName){
        return spendingsMapper.getAllSpendingsListByTypeName(typeName);
    }
    
    public ArrayList<Spendings> getSpendingsListByTypeName(Date startDate,Date endDateString,String typeName){
        return spendingsMapper.getSpendingsListByTypeName(startDate, endDateString, typeName);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import com.netcracker.financeapp.dao.IncomeMapper;
import com.netcracker.financeapp.mapping.Income;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IncomeService {
    IncomeMapper incomeMapper;
    public void setIncomeMapper(IncomeMapper incomeMapper) {
        this.incomeMapper = incomeMapper;
    }
    
    public ArrayList<Income> getIncomeList(Date startDate, Date endDate) {
        ArrayList<Income> tmp = incomeMapper.getAllIncomes(startDate, endDate);
        return tmp;
    }
    
    public Income getMaxIncome(){
        return incomeMapper.getMaxIncome();
    }
    
    public ArrayList<Income> getAllIncomeListByTypeName(String typeName){
        return incomeMapper.getAllIncomeListByTypeName(typeName);
    }
    
    public ArrayList<Income> getIncomeListByTypeName(Date startDate,Date endDateString,String typeName){
        return incomeMapper.getIncomeListByTypeName(startDate, endDateString, typeName);
    }

}

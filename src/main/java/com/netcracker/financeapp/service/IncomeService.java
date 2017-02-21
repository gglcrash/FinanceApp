/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import com.netcracker.financeapp.mapping.Finance;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Service;
import com.netcracker.financeapp.dao.FinanceMapper;


@Service
public class IncomeService {
    FinanceMapper financeMapper;
    public void setIncomeMapper(FinanceMapper financeMapper) {
        this.financeMapper = financeMapper;
    }
    
    public ArrayList<Finance> getIncomeList(Date startDate, Date endDate) {
        ArrayList<Finance> tmp = financeMapper.getAllIncomes(startDate, endDate);
        return tmp;
    }
    
    public int getMaxIncome(){
        return financeMapper.getMaxIncome();
    }
    
    public ArrayList<Finance> getIncomeListByTypeName(Date startDate,Date endDateString,String typeName){
        return financeMapper.getFinanceListByTypeName(startDate, endDateString, typeName);
    }

    public int insertIncome(int value, String desc, Date date, int idType){
        return financeMapper.insertFinance(value, desc, date, idType);
    }
}

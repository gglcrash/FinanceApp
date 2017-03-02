/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import com.netcracker.financeapp.dao.FinanceMapper;
import com.netcracker.financeapp.mapping.Finance;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class SpendingService {
    FinanceMapper financeMapper;
    public void setSpendingMapper(FinanceMapper financeMapper) {
        this.financeMapper = financeMapper;
    }
    
    public ArrayList<Finance> getSpendingsList(Date startDate, Date endDate) {
        ArrayList<Finance> tmp = financeMapper.getAllSpendings(startDate, endDate);
        return tmp;
    }
    
    public int getMaxSpending(){
        return financeMapper.getMaxSpending();
    }
   
    public ArrayList<Finance> getSpendingListByTypeName(Date startDate,Date endDateString,String typeName){
        return financeMapper.getFinanceListByTypeName(startDate, endDateString, typeName);
    }
    
    public int insertSpending(int value, String desc, Date date, int idType){
        return financeMapper.insertFinance(value, desc, date, idType);
    }
    
    public Finance getFinanceById(int idFinance){
        return financeMapper.getFinanceById(idFinance);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import com.netcracker.financeapp.dao.IncomeMapper;
import com.netcracker.financeapp.mapping.Income;
import java.util.ArrayList;
import org.springframework.stereotype.Service;


@Service
public class IncomeService {
    IncomeMapper incomeMapper;
    public void setIncomeMapper(IncomeMapper incomeMapper) {
        this.incomeMapper = incomeMapper;
    }
    
    public ArrayList<Income> getIncomeList() {
        return incomeMapper.getAllIncomes();
    }
}

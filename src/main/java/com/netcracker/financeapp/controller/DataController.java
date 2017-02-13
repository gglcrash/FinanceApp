/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller;

import com.netcracker.financeapp.mapping.Income;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.SpendingsService;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@ManagedBean(name = "dataController")
@RequestScoped
@Controller
public class DataController {
    
    @Autowired
    IncomeService incomeService;
    
    @Autowired
    SpendingsService spendingService;
    
    boolean isIncome;
    ArrayList<Income> incomeList;
      
    public void setIsIncome(boolean isIncome) {
        this.isIncome = isIncome;
    }

    public void setIncomeList(ArrayList<Income> incomeList) {
        this.incomeList = incomeList;
    }

    public boolean isIsIncome() {
        return isIncome;
    }

    public ArrayList<Income> getIncomeList() {
        return incomeService.getIncomeList();
    }
}

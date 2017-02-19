/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller;

import com.netcracker.financeapp.beans.CalculationBean;
import com.netcracker.financeapp.mapping.Finance;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.SpendingService;
import com.netcracker.financeapp.service.TypeService;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.bean.ManagedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@ManagedBean(name = "dataController")
@Controller
@Scope("request")
public class DataController {
    @Autowired
    IncomeService incomeService;
    @Autowired
    SpendingService spendingService;
    @Autowired
    TypeService typeService;
    @Autowired
    CalculationBean calculation;
    
    boolean isIncome;
    ArrayList<Finance> incomeList;
    Date startDate;
    Date endDate;

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
      
    public void setIsIncome(boolean isIncome) {
        this.isIncome = isIncome;
    }

    public void setIncomeList(ArrayList<Finance> incomeList) {
        this.incomeList = incomeList;
    }

    public boolean isIsIncome() {
        return isIncome;
    }

    public ArrayList<Finance> getIncomeList() {
        //if(isIncome){return income} esle {return spendings}

        GregorianCalendar calendar = new GregorianCalendar(200,02,10);
        Date start = calendar.getTime();
        GregorianCalendar calendar2 = new GregorianCalendar(2118,02,10);
        Date end = calendar2.getTime();
        return incomeService.getIncomeList(start, end);
    }
    
    public int getSaldo(){
        return calculation.calculateSaldo(incomeService.getIncomeList(startDate, endDate),
                spendingService.getSpendingsList(startDate, endDate));
    }
}

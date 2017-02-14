/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller;

import com.netcracker.financeapp.beans.CalculationBean;
import com.netcracker.financeapp.mapping.Income;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.SpendingsService;
import com.netcracker.financeapp.service.IncomeTypeService;
import com.netcracker.financeapp.service.SpendingsTypeService;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
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
    SpendingsService spendingService;
    @Autowired
    IncomeTypeService incomeTypeService;
    @Autowired
    SpendingsTypeService spendingsTypeService;
    @Autowired
    CalculationBean calculation;
    
    boolean isIncome;
    ArrayList<Income> incomeList;
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

    public void setIncomeList(ArrayList<Income> incomeList) {
        this.incomeList = incomeList;
    }

    public boolean isIsIncome() {
        return isIncome;
    }

    public ArrayList<Income> getIncomeList() {
        //if(isIncome){return income} esle {return spendings}

        GregorianCalendar calendar = new GregorianCalendar(2016,02,10);
        Date start = calendar.getTime();
        GregorianCalendar calendar2 = new GregorianCalendar(2018,02,10);
        Date end = calendar2.getTime();
        return incomeService.getIncomeList(start, end);
    }
    
    public int getSaldo(){
        return calculation.calculateSaldo(incomeService.getIncomeList(startDate, endDate),
                spendingService.getSpendingsList(startDate, endDate));
    }
}

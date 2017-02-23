/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller;

import com.netcracker.financeapp.beans.CalculationBean;
import com.netcracker.financeapp.beans.DataBean;
import com.netcracker.financeapp.mapping.Finance;
import com.netcracker.financeapp.service.AgentService;
import com.netcracker.financeapp.service.BankCardService;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.SpendingService;
import com.netcracker.financeapp.service.TransactionService;
import com.netcracker.financeapp.service.TypeService;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

@Controller("dataController")
public class DataController extends HttpServlet{
    @Autowired
    IncomeService incomeService;
    @Autowired
    SpendingService spendingService;
    @Autowired
    TypeService typeService;
    @Autowired
    BankCardService bankCardService;
    @Autowired
    TransactionService transactionService;
    @Autowired
    AgentService agentService;
    @Autowired
    CalculationBean calculation;
    @Autowired
    DataBean dataBean;

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

        GregorianCalendar calendar = new GregorianCalendar(200, 02, 10);
        Date start = calendar.getTime();
        GregorianCalendar calendar2 = new GregorianCalendar(2118, 02, 10);
        Date end = calendar2.getTime();
        return incomeService.getIncomeList(start, end);
    }

    public int getSaldo() {
        return calculation.calculateSaldo(incomeService.getIncomeList(startDate, endDate),
                spendingService.getSpendingsList(startDate, endDate));
    }

    public String insertData(int value, String description, Date insertDate, String typeName) {

     /*   GregorianCalendar calendar = new GregorianCalendar(2020, 11, 25);
        Date insertDate = calendar.getTime();
       */ 
        return dataBean.insertIncome(20000, description, insertDate, typeName);
    }
    ArrayList<String> incomeTypeList;
    public ArrayList<String> getIncomeTypeList(){   
     incomeTypeList = typeService.getIncomeTypeNames();
   /*  incomeTypeList = new ArrayList<>();
     incomeTypeList.add("first");
     incomeTypeList.add("second");
     incomeTypeList.add("third");*/
     return incomeTypeList;
    }
}

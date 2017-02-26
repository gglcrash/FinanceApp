/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller;

import com.netcracker.financeapp.mapping.BankCard;
import com.netcracker.financeapp.service.AgentService;
import com.netcracker.financeapp.service.BankCardService;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.TypeService;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author gglcrash
 */
@WebServlet(name = "incomeServlet", urlPatterns = {"/incomeServlet"})
public class IncomeServlet extends HttpServlet {

    @Autowired
    TypeService typeService;
    @Autowired
    IncomeService incomeService;
    @Autowired
    BankCardService bankCardService;
    @Autowired
    AgentService agentService;

    @Override
    public void init(ServletConfig config) {
        try {
            super.init(config);
            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                    config.getServletContext());
        } catch (ServletException ex) {
            Logger.getLogger(IncomeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> incomeTypeList = typeService.getIncomeTypeNames();
        request.setAttribute("incomeTypeList", incomeTypeList);
        
        ArrayList<String> bankCardNumbers = bankCardService.getBankCardNumbers();
        request.setAttribute("toList", bankCardNumbers);
        
        ArrayList<String> agentNames = agentService.getAgentNames();
        request.setAttribute("fromList", agentNames);
        
        request.getRequestDispatcher("income/incomePage.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        int value = Integer.parseInt(request.getParameter("value"));

        Date date = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            date = dateFormat.parse(request.getParameter("date"));
        } catch (ParseException ex) {
            Logger.getLogger(IncomeServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String description = request.getParameter("description");
        String typeName = request.getParameter("incomeType");

        int typeId = typeService.getTypeByName(typeName).getIdType();
        
        String from = request.getParameter("fromListVal");
        String to = request.getParameter("toListVal");
        BankCard currentBankCard = bankCardService.getBankCardByNumber(to);
        bankCardService.editCardAmount(currentBankCard.getIdCard(), currentBankCard.getAmount()+value);

        int incomeId = incomeService.insertIncome(value, description, date, typeId);
        
        //INSERT TRANSACTION HERE
        
        if (incomeId > 0) {
            request.getRequestDispatcher("templates/success.jsp").forward(request, response);
        } else {
           request.getRequestDispatcher("templates/error.jsp").forward(request, response); 
        }
    }

}

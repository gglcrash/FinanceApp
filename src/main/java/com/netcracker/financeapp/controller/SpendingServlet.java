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
import com.netcracker.financeapp.service.SpendingService;
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
import javax.servlet.ServletContext;
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
@WebServlet(name = "spendingServlet", urlPatterns = {"/spendingServlet"})
public class SpendingServlet extends HttpServlet {

    @Autowired
    TypeService typeService;
    @Autowired
    SpendingService spendingService;
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
            Logger.getLogger(SpendingServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<String> spendingTypeList = typeService.getSpendingTypeNames();
        request.setAttribute("spendingTypeList", spendingTypeList);

        ArrayList<String> bankCardNumbers = bankCardService.getBankCardNumbers();
        request.setAttribute("fromList", bankCardNumbers);

        ArrayList<String> agentNames = agentService.getAgentNames();
        request.setAttribute("toList", agentNames);

        request.getRequestDispatcher("spending/spendingPage.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        int value = Integer.parseInt(request.getParameter("value"));

        String from = request.getParameter("fromListVal");
        String to = request.getParameter("toListVal");
        BankCard currentBankCard = bankCardService.getBankCardByNumber(from);
        if (currentBankCard.getAmount() > value) {
            bankCardService.editCardAmount(currentBankCard.getIdCard(), currentBankCard.getAmount() - value);

            Date date = null;
            try {
                DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                date = dateFormat.parse(request.getParameter("date"));
            } catch (ParseException ex) {
                Logger.getLogger(SpendingServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            String description = request.getParameter("description");
            String typeName = request.getParameter("spendingType");

            int typeId = typeService.getTypeByName(typeName).getIdType();

            int spendingId = spendingService.insertSpending(value, description, date, typeId);
            if (spendingId > 0) {
                request.getRequestDispatcher("templates/success.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("templates/error.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("templates/error.jsp").forward(request, response);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller.transaction;

import com.netcracker.financeapp.enums.FINANCE_TYPE;
import com.netcracker.financeapp.mapping.Agent;
import com.netcracker.financeapp.mapping.BankCard;
import com.netcracker.financeapp.mapping.Finance;
import com.netcracker.financeapp.mapping.Transaction;
import com.netcracker.financeapp.mapping.TransactionObject;
import com.netcracker.financeapp.mapping.Type;
import com.netcracker.financeapp.service.AgentService;
import com.netcracker.financeapp.service.BankCardService;
import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.SpendingService;
import com.netcracker.financeapp.service.TransactionService;
import com.netcracker.financeapp.service.TypeService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
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

@WebServlet(name = "transactionServlet", urlPatterns = {"/transactionServlet"})
public class TransactionServlet extends HttpServlet {

    @Autowired
    TypeService typeService;
    @Autowired
    IncomeService incomeService;
    @Autowired
    SpendingService spendingService;
    @Autowired
    BankCardService bankCardService;
    @Autowired
    AgentService agentService;
    @Autowired
    TransactionService transactionService;

    @Override
    public void init(ServletConfig config) {
        try {
            super.init(config);
            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                    config.getServletContext());
        } catch (ServletException ex) {
            Logger.getLogger(TransactionServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String currentOption = request.getParameter("optionListVal");
        ArrayList<TransactionObject> transList = null;
        if (currentOption != null) {
            switch (currentOption) {
                case "Select all incomes":
                    transList = getAllFinance(FINANCE_TYPE.INCOME);
                    break;
                case "Select all spendings":
                    transList = getAllFinance(FINANCE_TYPE.SPENDING);
                    break;
            }
        }
        ArrayList<String> optionList = new ArrayList();
        optionList.add("Select all incomes");
        optionList.add("Select all spendings");

        String clearOption = "Select option";

        request.setAttribute("clearOption", clearOption);
        request.setAttribute("optionList", optionList);
        request.setAttribute("transList", transList);

        request.getRequestDispatcher("transaction/transactionPage.jsp").forward(request, response);

    }

    public ArrayList<TransactionObject> getAllFinance(FINANCE_TYPE typeName) {
        int idTypeTmp = typeService.getTypeByName(typeName.toString()).getIdType();
        ArrayList<Transaction> transactionList = transactionService.getTransactionsByIdType(idTypeTmp);

        ArrayList<TransactionObject> transList = new ArrayList<>();

        for (int i = 0; i < transactionList.size(); i++) {
            int idType = transactionList.get(i).getIdType();
            int idTypeState = transactionList.get(i).getIdTypeState();
            int idFinance = transactionList.get(i).getIdFinance();
            int idCard = transactionList.get(i).getIdCard();
            int idAgent = transactionList.get(i).getIdAgent();

            Type type = typeService.getTypeById(idType);
            Type typeState = typeService.getTypeById(idTypeState);
            Finance finance = null;
            switch (typeName) {
                case INCOME:
                    finance = incomeService.getFinanceById(idFinance);
                    break;
                case SPENDING:
                    finance = spendingService.getFinanceById(idFinance);
                    break;
            }
            Type typeFinance = typeService.getTypeById(finance.getTypeId());
            Agent agent = agentService.getAgentById(idAgent);
            BankCard bankCard = bankCardService.getBankCardById(idCard);

            transList.add(new TransactionObject(type, typeState, typeFinance, agent, bankCard, finance));
        }
        return transList;
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

    }

}

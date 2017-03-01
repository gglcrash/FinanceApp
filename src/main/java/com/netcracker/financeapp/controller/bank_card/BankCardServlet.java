/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller.bank_card;

import com.netcracker.financeapp.mapping.BankCard;
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

@WebServlet(name = "bankCardServlet", urlPatterns = {"/bankCardServlet"})
public class BankCardServlet extends HttpServlet {

    @Autowired
    BankCardService bankCardService;

    @Override
    public void init(ServletConfig config) {
        try {
            super.init(config);
            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                    config.getServletContext());
        } catch (ServletException ex) {
            Logger.getLogger(BankCardServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> bankCardNumbers = bankCardService.getBankCardNumbers();
        request.setAttribute("cardList", bankCardNumbers);

        String currentCard = request.getParameter("cardListVal");
        if (currentCard != null && currentCard!="Select Card") {
           
        BankCard currCard = bankCardService.getBankCardByNumber(currentCard);
        request.setAttribute("cardNumber", currCard.getCardNumber());
        request.setAttribute("currentAmount", currCard.getAmount());
        request.setAttribute("ownerName", currCard.getOwnerName());
        request.setAttribute("ownerSurname", currCard.getOwnerSurname());
        request.setAttribute("expireMonth", currCard.getExpireMonth());
        request.setAttribute("expireYear", currCard.getExpireYear());
        request.setAttribute("cvv", currCard.getCvv());
        }
        request.setAttribute("clearCard", "Select Card");
        request.getRequestDispatcher("bankCard/bankCardPage.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
     
    }

}

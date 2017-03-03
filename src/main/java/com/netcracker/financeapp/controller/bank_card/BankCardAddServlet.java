/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller.bank_card;

import com.netcracker.financeapp.service.BankCardService;
import java.io.IOException;
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

@WebServlet(name = "bankCardAddServlet", urlPatterns = {"/bankCardAddServlet"})
public class BankCardAddServlet extends HttpServlet {

    @Autowired
    BankCardService bankCardService;
    
    @Override
    public void init(ServletConfig config) {
        try {
            super.init(config);
            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                    config.getServletContext());
        } catch (ServletException ex) {
            Logger.getLogger(BankCardAddServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("bankCard/bankCardAdd.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String cardNumber = request.getParameter("cardNumber"); 
        int amount = Integer.parseInt(request.getParameter("currentAmount")); 
        int cvv = Integer.parseInt(request.getParameter("cvv"));
        String ownerName = request.getParameter("ownerName");
        String ownerSurname = request.getParameter("ownerSurname");
        int expireMonth = Integer.parseInt(request.getParameter("expireMonth"));
        int expireYear = Integer.parseInt(request.getParameter("expireYear"));
        
        int cardId = bankCardService.insertBankCard(amount, cvv, expireMonth, expireYear, cardNumber, 
                ownerName, ownerSurname);
        if(cardId>0){
              request.getRequestDispatcher("templates/success.jsp").forward(request, response);
        } else {
           request.getRequestDispatcher("templates/error.jsp").forward(request, response); 
        }
    }

}

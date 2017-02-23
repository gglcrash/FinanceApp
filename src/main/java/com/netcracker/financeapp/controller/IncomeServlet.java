/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller;

import com.netcracker.financeapp.service.IncomeService;
import com.netcracker.financeapp.service.TypeService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
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
@WebServlet(name = "incomeServlet", urlPatterns = {"/main"})
public class IncomeServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) {
        try {
            super.init(config);
            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                    config.getServletContext());
        } catch (ServletException ex) {
            Logger.getLogger(DataController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Autowired
    TypeService typeService;
    @Autowired
    IncomeService incomeService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> incomeTypeList = typeService.getIncomeTypeNames();

        request.setAttribute("incomeTypeList", incomeTypeList);
        request.getRequestDispatcher("main.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        int value = Integer.getInteger(request.getParameter("value"));
        Date date = Date.valueOf(request.getParameter("date"));
        String description = request.getParameter("description");
        String typeName = request.getParameter("incomeType");

        int typeId = typeService.getTypeByName(typeName).getIdType();

        int x = incomeService.insertIncome(value, description, date, typeId);
        if (x < 0) {
            request.getRequestDispatcher("templates/sidebar.jsp").forward(request, response);
        }
    }

}

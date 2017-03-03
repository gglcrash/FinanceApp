/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller.type;

import com.netcracker.financeapp.service.TypeService;
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

@WebServlet(name = "typeAddServlet", urlPatterns = {"/typeAddServlet"})
public class typeAddServlet extends HttpServlet {

    @Autowired
    TypeService typeService;

    @Override
    public void init(ServletConfig config) {
        try {
            super.init(config);
            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                    config.getServletContext());
        } catch (ServletException ex) {
            Logger.getLogger(typeAddServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("type/typeAdd.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String typeName = request.getParameter("typeName");
        if (request.getParameter("radios") != null) {
            int typeId =0;
            if(request.getParameter("radios").equals("INCOME")){
                typeId = typeService.insertIncomeType(typeName);
            } else if (request.getParameter("radios").equals("SPENDING")){
                typeId = typeService.insertSpendingType(typeName);
            }
            
            if (typeId > 0) {
                request.getRequestDispatcher("templates/success.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("templates/error.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("templates/error.jsp").forward(request, response);
        }

    }

}

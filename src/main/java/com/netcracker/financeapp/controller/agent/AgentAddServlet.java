/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller.agent;

import com.netcracker.financeapp.service.AgentService;
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

@WebServlet(name = "agentAddServlet", urlPatterns = {"/agentAddServlet"})
public class AgentAddServlet extends HttpServlet {

    @Autowired
    AgentService agentService;

    @Override
    public void init(ServletConfig config) {
        try {
            super.init(config);
            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                    config.getServletContext());
        } catch (ServletException ex) {
            Logger.getLogger(AgentAddServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("agent/agentAdd.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String agentNumber = request.getParameter("agentNumber");
        String agentName = request.getParameter("agentName");
        int agentId = agentService.insertSpendingType(agentName, agentNumber);
        if (agentId > 0) {
            request.getRequestDispatcher("templates/success.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("templates/error.jsp").forward(request, response);
        }
    }

}

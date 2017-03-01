/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller.agent;

import com.netcracker.financeapp.mapping.Agent;
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

@WebServlet(name = "agentDeleteServlet", urlPatterns = {"/agentDeleteServlet"})
public class AgentDeleteServlet extends HttpServlet {

    @Autowired
    AgentService agentService;

    @Override
    public void init(ServletConfig config) {
        try {
            super.init(config);
            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                    config.getServletContext());
        } catch (ServletException ex) {
            Logger.getLogger(AgentDeleteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> agentList = agentService.getAgentNames();
        request.setAttribute("agentList", agentList);
        
        request.setAttribute("clearAgent", "Select Agent");
        request.getRequestDispatcher("agent/agentDelete.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        int deleted_id = agentService.deleteAgentByName(request.getParameter("agentListVal"));
        if (deleted_id > 0) {
            request.getRequestDispatcher("templates/success.jsp").forward(request, response);
        } else {
           request.getRequestDispatcher("templates/error.jsp").forward(request, response); 
        }
    }

}

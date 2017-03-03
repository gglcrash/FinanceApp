/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller.agent;

import com.netcracker.financeapp.mapping.Agent;
import com.netcracker.financeapp.service.AgentService;
import java.io.IOException;
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

@WebServlet(name = "agentServlet", urlPatterns = {"/agentServlet"})
public class AgentServlet extends HttpServlet {

    @Autowired
    AgentService agentService;

    @Override
    public void init(ServletConfig config) {
        try {
            super.init(config);
            SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                    config.getServletContext());
        } catch (ServletException ex) {
            Logger.getLogger(AgentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> agentList = agentService.getAgentNames();
        request.setAttribute("agentList", agentList);

        String currentAgent = request.getParameter("agentListVal");
        if (currentAgent != null && currentAgent!="Select Agent") {
           
        Agent currAgent = agentService.getAgentByName(currentAgent);
        request.setAttribute("agentNumber", currAgent.getAccountNumber());
        request.setAttribute("agentName", currAgent.getName());
        }
        request.setAttribute("clearAgent", "Select Agent");
        request.getRequestDispatcher("agent/agentPage.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
     
    }

}

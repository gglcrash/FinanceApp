/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.netcracker.financeapp.dao.AgentMapper;
import com.netcracker.financeapp.mapping.Agent;
import org.apache.ibatis.annotations.Param;

@Service
public class AgentService {

    AgentMapper agentMapper;

    public void setAgentMapper(AgentMapper agentMapper) {
        this.agentMapper = agentMapper;
    }

    public Agent getAgentByName(String agentName) {
        return agentMapper.getAgentByName(agentName);
    }
    
    public Agent getAgentById(int agentId) {
        return agentMapper.getAgentById(agentId);
    }

    public ArrayList<String> getAgentNames() {
        return agentMapper.getAgentNames();
    }

    public int insertSpendingType(String agentName, String accountNumber){
        return agentMapper.insertAgent(agentName,accountNumber);
    }
    
    public int deleteAgentByName(String agentName){
        return agentMapper.deleteAgentByName(agentName);
    }
}

package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Agent;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Param;

public interface AgentMapper {

    Agent getAgentByName(String agentName);
    
    Agent getAgentById(int agentId);
    
    ArrayList<String> getAgentNames();
    
    int insertAgent(@Param("agentName") String agentName, @Param("accountNumber") String accountNumber);
    
    int deleteAgentByName(@Param("agentName") String agentName);
}

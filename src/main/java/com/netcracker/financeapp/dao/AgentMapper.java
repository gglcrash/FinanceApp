package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Agent;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Param;

public interface AgentMapper {

    String getAgentNumberByName(String agentName);

    ArrayList<String> getAgentNames();
    
    int insertAgent(@Param("agentName") String agentName, @Param("accountNumber") String accountNumber);
}

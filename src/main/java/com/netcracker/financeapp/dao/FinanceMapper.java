/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Finance;
import java.util.ArrayList;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

public interface FinanceMapper {

    ArrayList<Finance> getFinanceListByTypeName(@Param("startDate") Date startDate,
            @Param("endDate") Date endDateString, @Param("typeName") String typeName);

    int insertFinance(@Param("value") int Value, @Param("desc") String description,
            @Param("date") Date date, @Param("idType") int idType);

    
    int getMaxIncome();

    ArrayList<Finance> getAllIncomes(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    
    int getMaxSpending();

    ArrayList<Finance> getAllSpendings(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Income;
import com.netcracker.financeapp.mapping.Spendings;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.apache.ibatis.annotations.Param;

public interface IncomeMapper {
    Income getMaxIncome();
    ArrayList<Income> getAllIncomes(@Param("startDate") Date startDate,@Param("endDate") Date endDate);
    ArrayList<Income> getAllIncomeListByTypeName(String typeName);
    ArrayList<Income> getIncomeListByTypeName(@Param("startDate") Date startDate,
        @Param("endDate") Date endDateString,@Param("typeName") String typeName);
}

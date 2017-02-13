/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Spendings;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.apache.ibatis.annotations.Param;

public interface SpendingsMapper {
    Spendings getMaxSpending();
    ArrayList<Spendings> getAllSpendings(@Param("startDate") Date startDate,@Param("endDate") Date endDate);
    ArrayList<Spendings> getAllSpendingsListByTypeName(String typeName);
    ArrayList<Spendings> getSpendingsListByTypeName(@Param("startDate") Date startDate,
        @Param("endDate") Date endDateString,@Param("typeName") String typeName);
}

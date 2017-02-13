/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Income;
import com.netcracker.financeapp.mapping.IncomeType;
import java.util.ArrayList;

public interface IncomeTypeMapper {
    IncomeType getTypeById(int idIncome);
    int getTypeIdByName(String typeName);
    ArrayList<String> getTypeNames();
}

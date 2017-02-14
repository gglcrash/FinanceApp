/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.IncomeType;
import java.util.ArrayList;

public interface IncomeTypeMapper {
    IncomeType getIncomeTypeById(int idIncome);
    int getIncomeTypeIdByName(String typeName);
    ArrayList<String> getIncomeTypeNames();
}

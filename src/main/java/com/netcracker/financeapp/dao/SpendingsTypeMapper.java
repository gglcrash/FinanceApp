/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.SpendingsType;
import java.util.ArrayList;

public interface SpendingsTypeMapper {
    SpendingsType getSpendingsTypeById(int idSpendings);
    int getSpendingsTypeIdByName(String typeName);
    ArrayList<String> getSpendingsTypeNames();
}

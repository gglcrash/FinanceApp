/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Income;
import com.netcracker.financeapp.mapping.Spendings;
import java.util.ArrayList;

public interface SpendingsMapper {
    Income getSpendingById(int idIncome);
    ArrayList<Spendings> getAllSpendings();
}

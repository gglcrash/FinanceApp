/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Income;
import java.util.ArrayList;
import java.util.Date;

public interface IncomeMapper {
    Income getMaxIncome();
    ArrayList<Income> getAllIncomes(Date startDate, Date endDate);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.beans;

import com.netcracker.financeapp.mapping.Income;
import com.netcracker.financeapp.mapping.Spendings;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class CalculationBean {
    public int calculateSaldo(ArrayList<Income> incomeList, ArrayList<Spendings> spendingsList){
        int totalIncome = 0;
        int totalSpendings = 0;
        for (Income income : incomeList) {
            totalIncome+=income.getValue();
        }
        for (Spendings spendings : spendingsList) {
            totalSpendings+=spendings.getValue();
        }
        return totalIncome-totalSpendings;
    }
}

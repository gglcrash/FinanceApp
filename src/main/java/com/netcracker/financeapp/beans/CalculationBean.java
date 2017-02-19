/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.beans;

import com.netcracker.financeapp.mapping.Finance;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class CalculationBean {
    public int calculateSaldo(ArrayList<Finance> incomeList, ArrayList<Finance> spendingsList){
        int totalIncome = 0;
        int totalSpendings = 0;
        for (Finance income : incomeList) {
            totalIncome+=income.getValue();
        }
        for (Finance spending : spendingsList) {
            totalSpendings+=spending.getValue();
        }
        return totalIncome-totalSpendings;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Income;
import com.netcracker.financeapp.mapping.Type;
import java.util.ArrayList;

public interface TypeMapper {
    Income getTypeById(int idIncome);
    ArrayList<Type> getAllTypes();
}

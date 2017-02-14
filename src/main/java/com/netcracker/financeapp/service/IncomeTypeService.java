/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import com.netcracker.financeapp.mapping.IncomeType;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.netcracker.financeapp.dao.IncomeTypeMapper;

@Service
public class IncomeTypeService {
    IncomeTypeMapper incomeTypeMapper;
    public void setTypeMapper(IncomeTypeMapper typeMapper) {
        this.incomeTypeMapper = typeMapper;
    }
    
    public IncomeType getIncomeTypeById(int id_type) {
        return incomeTypeMapper.getIncomeTypeById(id_type);
    }
    
    public ArrayList<String> getIncomeTypeNames(){
        return incomeTypeMapper.getIncomeTypeNames();
    }
    
    public int getIncomeTypeIdByName(String typeName){
        return incomeTypeMapper.getIncomeTypeIdByName(typeName);
    }
}

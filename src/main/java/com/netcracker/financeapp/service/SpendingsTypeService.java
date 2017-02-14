/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.netcracker.financeapp.dao.SpendingsTypeMapper;
import com.netcracker.financeapp.mapping.SpendingsType;

@Service
public class SpendingsTypeService {
    SpendingsTypeMapper spendingsTypeMapper;
    public void setTypeMapper(SpendingsTypeMapper typeMapper) {
        this.spendingsTypeMapper = typeMapper;
    }
    
    public SpendingsType getSpendingsTypeById(int id_type) {
        return spendingsTypeMapper.getSpendingsTypeById(id_type);
    }
    
    public ArrayList<String> getSpendingsTypeNames(){
        return spendingsTypeMapper.getSpendingsTypeNames();
    }
    
    public int getSpendingsTypeIdByName(String typeName){
        return spendingsTypeMapper.getSpendingsTypeIdByName(typeName);
    }
}

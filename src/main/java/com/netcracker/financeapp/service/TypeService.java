/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import com.netcracker.financeapp.dao.SpendingsMapper;
import com.netcracker.financeapp.dao.TypeMapper;
import com.netcracker.financeapp.mapping.Income;
import com.netcracker.financeapp.mapping.Spendings;
import com.netcracker.financeapp.mapping.Type;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService {
    TypeMapper typeMapper;
    public void setTypeMapper(TypeMapper typeMapper) {
        this.typeMapper = typeMapper;
    }
    
    public ArrayList<Type> getTypeList() {
        ArrayList<Type> tmp = typeMapper.getAllTypes();
        return tmp;
    }
}

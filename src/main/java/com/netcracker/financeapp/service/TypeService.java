/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.service;

import com.netcracker.financeapp.mapping.Type;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.netcracker.financeapp.dao.TypeMapper;

@Service
public class TypeService {

    TypeMapper typeMapper;

    public void setTypeMapper(TypeMapper typeMapper) {
        this.typeMapper = typeMapper;
    }

    public Type getTypeById(int id_type) {
        return typeMapper.getTypeById(id_type);
    }

    public Type getParentTypeByChildId(int id_type) {
        return typeMapper.getParentTypeByChildId(id_type);
    }

    public Type getTypeByName(String typeName) {
        return typeMapper.getTypeByName(typeName);
    }

    public Type getParentTypeByChildName(String typeName) {
        return typeMapper.getParentTypeByChildName(typeName);
    }

    public ArrayList<String> getIncomeTypeNames() {
        return typeMapper.getIncomeTypeNames();
    }

    public ArrayList<String> getSpendingTypeNames(){
        return typeMapper.getSpendingTypeNames();
    }

    public int insertIncomeType(String typeName){
        return typeMapper.insertIncomeType(typeName);
    }
    
    public int insertSpendingType(String typeName){
        return typeMapper.insertSpendingType(typeName);
    }
}

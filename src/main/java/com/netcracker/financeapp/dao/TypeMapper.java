/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.dao;

import com.netcracker.financeapp.mapping.Type;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Param;

public interface TypeMapper {

    Type getTypeById(int idIncome);

    Type getParentTypeByChildId(int idType);

    Type getTypeByName(String typeName);

    Type getParentTypeByChildName(String typeName);

    ArrayList<String> getIncomeTypeNames();
    
    ArrayList<String> getSpendingTypeNames();
    
    int insertIncomeType(String typeName);
    
    int insertSpendingType(String typeName);
    
    int deleteTypeByName(@Param("typeName") String typeName);
}

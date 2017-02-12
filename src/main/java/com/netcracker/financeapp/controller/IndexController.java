/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.controller;

import com.netcracker.financeapp.dao.IncomeMapper;
import com.netcracker.financeapp.mapping.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class IndexController {
 
    @Autowired
    private IncomeMapper incomeMapper;
 
    @RequestMapping("index.htm")
    public ModelAndView execute(Model model) {
        Income inc = incomeMapper.getIncome(1);
        System.out.println(inc.getDescription());
        System.out.println(inc.getValue());
        
        return new ModelAndView("start");
    }
 
}
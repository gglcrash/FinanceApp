/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.financeapp.hibernate;

import com.netcracker.financeapp.mapping.Income;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gglcrash
 */
public class IncomeHelper {
    Session session = null;

    public IncomeHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getIncomeByID(int incomeId){
    List<Income> actorList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from income as actor where income.idIncome ="+incomeId);
        actorList = (List<Income>) q.list();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return actorList;
}
}

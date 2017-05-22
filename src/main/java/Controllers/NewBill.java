/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Bill;
import Pojo.Clients;
import Utils.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;

/**
 *
 * @author Evander R
 */
public class NewBill {
     NewHibernateUtil conect = new NewHibernateUtil();
    public NewBill() {
    }
    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Bill bill, int selection) {
        conect.open();
        Transaction trans = conect.getSession().beginTransaction();
        switch (selection) {
            case 0:
                conect.getSession().save(bill);
                trans.commit();
                break;
            case 1:
                conect.getSession().update(bill);
                trans.commit();
                break;            
        }
        conect.close();
    }

    public List<Bill> findAll() {
        conect.open();
        List<Bill> list= new ArrayList<>();
        SQLQuery query= conect.getSession().createSQLQuery("select * from Bill");
        query.addEntity(Bill.class);
        for (Iterator i=query.list().iterator();i.hasNext();) {
            Bill c= (Bill) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }
    
    /*================CRUD====================*/
}

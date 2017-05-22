/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Category;
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
public class NewClient {

    NewHibernateUtil conect = new NewHibernateUtil();
    public NewClient() {
    }
    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Clients client, int selection) {
        conect.open();
        Transaction trans = conect.getSession().beginTransaction();
        switch (selection) {
            case 0:
                conect.getSession().save(client);
                trans.commit();
                break;
            case 1:
                conect.getSession().update(client);
                trans.commit();
                break;
            case 2:
                client.setErasedStatus(false);
                conect.getSession().update(client);
                trans.commit();
                break;
        }
        conect.close();
    }

    public List<Clients> findAll() {
        conect.open();
        List<Clients> list= new ArrayList<>();
        SQLQuery query= conect.getSession().createSQLQuery("select * from Clients where erasedStatus=1");
        query.addEntity(Clients.class);
        for (Iterator i=query.list().iterator();i.hasNext();) {
            Clients c= (Clients) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }
    
    /*================CRUD====================*/
}

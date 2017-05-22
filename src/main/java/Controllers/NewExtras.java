/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Category;
import Pojo.Extras;
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
public class NewExtras {
     NewHibernateUtil conect = new NewHibernateUtil();
    public NewExtras() {
    }

    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Extras extras, int selection) {
        conect.open();
        Transaction trans = conect.getSession().beginTransaction();
        switch (selection) {
            case 0:
                conect.getSession().save(extras);
                trans.commit();
                break;
            case 1:
                conect.getSession().update(extras);
                trans.commit();
                break;
            case 2:
                conect.getSession().update(extras);
                trans.commit();
                break;
        }
        conect.close();
    }

    public List<Extras> findAll() {
        conect.open();
        List<Extras> list= new ArrayList<>();
        SQLQuery query= conect.getSession().createSQLQuery("select * from Extras");
        query.addEntity(Extras.class);
        for (Iterator i=query.list().iterator();i.hasNext();) {
            Extras c= (Extras) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }
    
    /*================CRUD====================*/
}

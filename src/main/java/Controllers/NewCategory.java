/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Category;
import Utils.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Evander R
 */
public class NewCategory {

    NewHibernateUtil conect = new NewHibernateUtil();
    public NewCategory() {
    }

    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Category category, int selection) {
        conect.open();
        Transaction trans = conect.getSession().beginTransaction();
        switch (selection) {
            case 0:
                conect.getSession().save(category);
                trans.commit();
                break;
            case 1:
                conect.getSession().update(category);
                trans.commit();
                break;
            case 2:
                category.setErasedStatus(false);
                conect.getSession().update(category);
                trans.commit();
                break;
        }
        conect.close();
    }

    public List<Category> findAll() {
        conect.open();
        List<Category> list= new ArrayList<>();
        SQLQuery query= conect.getSession().createSQLQuery("select * from Category where erasedStatus=1");
        query.addEntity(Category.class);
        for (Iterator i=query.list().iterator();i.hasNext();) {
            Category c= (Category) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }
    
    /*================CRUD====================*/
}

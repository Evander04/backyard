/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Detailreservationclient;
import Pojo.Detailreservationroom;
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
public class NewDetailReservationRoom {
        NewHibernateUtil conect = new NewHibernateUtil();
    public NewDetailReservationRoom() {
    }

    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Detailreservationroom detail, int selection) {
        conect.open();
        Transaction trans = conect.getSession().beginTransaction();
        switch (selection) {
            case 0:
                conect.getSession().save(detail);
                trans.commit();
                break;
            case 1:
                conect.getSession().update(detail);
                trans.commit();
                break;
            case 2:                
                conect.getSession().update(detail);
                trans.commit();
                break;
        }
        conect.close();
    }

    public List<Detailreservationroom> findAll() {
        conect.open();
        List<Detailreservationroom> list= new ArrayList<>();
        SQLQuery query= conect.getSession().createSQLQuery("select * from DetailReservationRoom");
        query.addEntity(Detailreservationroom.class);
        for (Iterator i=query.list().iterator();i.hasNext();) {
            Detailreservationroom c= (Detailreservationroom) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }
    
    /*================CRUD====================*/
}

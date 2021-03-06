/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Category;
import Pojo.Clients;
import Pojo.Detailreservationclient;
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
public class NewDetailReservationClient {

    NewHibernateUtil conect = new NewHibernateUtil();
    
    public NewDetailReservationClient() {
    }

    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Detailreservationclient detail, int selection) {
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

    public List<Detailreservationclient> findAll() {
        conect.open();
        List<Detailreservationclient> list = new ArrayList<>();
        SQLQuery query = conect.getSession().createSQLQuery("select * from DetailReservationClient");
        query.addEntity(Detailreservationclient.class);
        for (Iterator i = query.list().iterator(); i.hasNext();) {
            Detailreservationclient c = (Detailreservationclient) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }
    
    public Clients findByReservation(int idReservation){
        conect.open();
        NewClient newClient= new NewClient();
        Clients e= new Clients();
        findAll().forEach(dr->{
             if (dr.getReservation().getIdReservation()==idReservation) {
                 if (dr.getTypeClient()) {
                     Clients c=newClient.findClientById(dr.getClients().getIdClient());
                     e.setIdClient(c.getIdClient());
                     e.setName(c.getName());
                 }
            }
        });
        return e;
    }
    /*================CRUD====================*/
}

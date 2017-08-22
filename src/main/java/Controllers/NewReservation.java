/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Category;
import Pojo.Reservation;
import Utils.NewHibernateUtil;
import com.mysql.jdbc.CallableStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;

/**
 *
 * @author Evander R
 */
public class NewReservation {
     NewHibernateUtil conect = new NewHibernateUtil();
     
    public NewReservation() {
    }

    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Reservation reservation, int selection) {
        conect.open();
        Transaction trans = conect.getSession().beginTransaction();
        switch (selection) {
            case 0:
                conect.getSession().save(reservation);
                trans.commit();
                break;
            case 1:
                conect.getSession().update(reservation);
                trans.commit();
                break;
            case 2:
                conect.getSession().update(reservation);
                trans.commit();
                break;
        }
        conect.close();
    }

    public List<Reservation> findAll() {
        conect.open();
        List<Reservation> list= new ArrayList<>();
        String sql="call ";
        SQLQuery query= conect.getSession().createSQLQuery("select * from Reservation");
        query.addEntity(Reservation.class);
        for (Iterator i=query.list().iterator();i.hasNext();) {
            Reservation c= (Reservation) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }
    
   public Reservation findByNo(int no){
       conect.open();
       Reservation r= new Reservation();
       findAll().forEach(re->{
           if (re.getIdReservation()==no) {
              r.setIdReservation(re.getIdReservation());
              r.setIdEmployee(re.getIdEmployee());
              r.setReservationDate(re.getReservationDate());
              r.setRegistrationDate(re.getRegistrationDate());
              r.setDueDate(re.getDueDate());
              r.setRode(re.getRode());
              r.setStatus(re.getStatus());
           }
       });
       return r;
   }
    /*================CRUD====================*/
}

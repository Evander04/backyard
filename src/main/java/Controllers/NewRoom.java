/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Category;
import Pojo.Room;
import Utils.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Transaction;

/**
 *
 * @author Evander R
 */
public class NewRoom {

    NewHibernateUtil conect = new NewHibernateUtil();
    NewReservation newReserv = new NewReservation();
    boolean noExist=true;
    public NewRoom() {
    }

    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Room room, int selection) {
        conect.open();
        Transaction trans = conect.getSession().beginTransaction();
        switch (selection) {
            case 0:
                conect.getSession().save(room);
                trans.commit();
                break;
            case 1:
                conect.getSession().update(room);
                trans.commit();
                break;
            case 2:
                room.setErasedStatus(false);
                conect.getSession().update(room);
                trans.commit();
                break;
        }
        conect.close();
    }

    public List<Room> findAll() {
        conect.open();
        List<Room> list = new ArrayList<>();
        SQLQuery query = conect.getSession().createSQLQuery("select * from Room where erasedStatus=1");
        query.addEntity(Room.class);
        for (Iterator i = query.list().iterator(); i.hasNext();) {
            Room c = (Room) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }

    public Room findByName(String name) {
        conect.open();
        Room r = new Room();
        findAll().forEach(ro -> {
            if (ro.getName().equals(name)) {
                r.setIdRoom(ro.getIdRoom());
                r.setCategory(ro.getCategory());
                r.setName(ro.getName());
                r.setCapacity(ro.getCapacity());
                r.setTypeRoom(ro.getTypeRoom());
                r.setStatusRoom(ro.getStatusRoom());
                r.setPrice(ro.getPrice());
            }
        });
        return r;
    }

    public List<Room> getRooms(Date init, Date finish) {
        conect.open();
        List<Room> list =new ArrayList<>();
        findAll().forEach(r -> {            
            getRoomsOc(init, finish).forEach(re -> {
                if (r.getIdRoom() == re.getIdRoom()) {
                   noExist=false;
                }
            });
            if (noExist) {
                list.add(r);
            }
            noExist=true;
        });
        
        return list;
    }

    public List<Room> getRoomsOc(Date init, Date finish) {
        conect.open();
        List<Room> list = new ArrayList<>();
        SQLQuery query = conect.getSession().createSQLQuery("call roomsAvailable(?,?)");
        query.setParameter(0, init);
        query.setParameter(1, finish);
        query.addEntity(Room.class);
        for (Iterator i = query.list().iterator(); i.hasNext();) {
            Room c = (Room) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }
    /*================CRUD====================*/
}

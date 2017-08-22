/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Category;
import Pojo.Users;
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
public class NewUsers {
     NewHibernateUtil conect = new NewHibernateUtil();
    public NewUsers() {
    }

    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Users users, int selection) {
        conect.open();
        Transaction trans = conect.getSession().beginTransaction();
        switch (selection) {
            case 0:
                conect.getSession().save(users);
                trans.commit();
                break;
            case 1:
                conect.getSession().update(users);
                trans.commit();
                break;
            case 2:                
                conect.getSession().delete(users);
                trans.commit();
                break;
        }
        conect.close();
    }

    public List<Users> findAll() {
        conect.open();
        List<Users> list= new ArrayList<>();
        SQLQuery query= conect.getSession().createSQLQuery("select * from users");
        query.addEntity(Users.class);
        for (Iterator i=query.list().iterator();i.hasNext();) {
            Users c= (Users) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }
    
    public Users findByUserName(String username){
        Users u= new Users();
        findAll().forEach(user->{
            if (user.getUserName().equals(username)) {
                u.setIdUser(user.getIdUser());
                u.setUserName(user.getUserName());
                u.setPass(user.getPass());
                u.setEmployee(user.getEmployee());
            }
        });      
        return u;
    }
    public List<Users> findByUserNameLike(String username){
        List<Users> list= new ArrayList<>();
        findAll().forEach(user->{
            if (user.getUserName().contentEquals(username)) {
                list.add(user);
            }
        });      
        return list;
    }
    
    /*================CRUD====================*/
}

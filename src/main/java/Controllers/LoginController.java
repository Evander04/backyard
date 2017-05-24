/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Employee;
import Pojo.Users;
import Utils.Hash;
import Utils.NewHibernateUtil;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 *
 * @author Evander R
 */
public class LoginController {

    NewHibernateUtil conect = new NewHibernateUtil();
    NewUsers userController = new NewUsers();
    Hash hash= new Hash();

    public Boolean access(String user, String password) throws NoSuchAlgorithmException {
        Users u = findUserLogin(user);
        if (u != null) {
            if (u.getPass().equals(hash.Sha512(password))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    } 
    public int typeUser(String user){
        NewEmployee ne= new NewEmployee();
        Employee e= ne.findEmployeeByUser(user);
        return e.getTypeEmployee();
       
    }
    
     public Users findUserLogin(String user){
       Users u= new Users();       
       List<Users> us= userController.findAll();
       us.forEach(users->{
           if (users.getUserName().equals(user)) {
               u.setUserName(users.getUserName());
               u.setPass(users.getPass());
           }
       });
              
       return u;
    }    
    
}

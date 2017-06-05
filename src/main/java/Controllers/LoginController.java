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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Evander R
 */
public class LoginController {

    NewHibernateUtil conect = new NewHibernateUtil();
    NewUsers userController = new NewUsers();
    Hash hash= new Hash();

    public Boolean access(String user, String password)  {
        Boolean val= false;
        try{
        Users u = findUserLogin(user);
        if (u.getUserName()!= null) {
            if (u.getPass().equals(hash.Sha512(password))) {
                val= true;
            } else {
                val= false;
            }
        } else {
            val= false;
        }
        }catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Controllers.LoginController;
import Controllers.NewCategory;
import Controllers.NewClient;
import Controllers.NewEmployee;
import Controllers.NewRoom;
import Controllers.NewUsers;
import Pojo.Category;
import Pojo.Clients;
import Pojo.Employee;
import Pojo.Room;
import Pojo.Users;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Evander R
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Hash h= new Hash();
            NewUsers nu= new NewUsers();
            NewEmployee ne= new NewEmployee();
            Users u= new Users();
            Employee e= new Employee();         
            NewCategory nc= new NewCategory();
            Category c= new Category();
            e.setFirstName("Jesser");
            e.setSecondName("Evander");
            e.setSurname("Martinez");
            e.setSecondSurname("Rojas");
            e.setDocIdentity("001-04129-0002E");
            e.setPhone("89043582");
            e.setAddress("por la donde salen dos soles");
            e.setSalary(Long.parseLong("45000"));
            e.setEmail("rojasevander@gmail.com");
            e.setTypeEmployee(2);
            e.setErasedStatus(true);
            //ne.save(e,0);
            u.setUserName("JEMR");
            u.setPass(h.Sha512("hash"));
            u.setEmployee(e);
            //nu.save(u, 0);
            c.setIdCategory(1);
            c.setCategoryType(1);
            c.setDescription("con olor a culo");
            c.setErasedStatus(true);
            //nc.save(c, 1);
            NewRoom nr= new NewRoom();
            Room r= new Room();
            r.setCategory(c);
            r.setCapacity(10);
            r.setPrice(Long.parseLong("1500"));
            r.setStatusRoom(0);
            r.setDescription("el cuarto de los aplausos");
            r.setTypeRoom(false);
            r.setErasedStatus(true);
            //nr.save(r, 0);
            Clients cli= new Clients();
            NewClient ncli= new NewClient();
            cli.setName("Kakaroto");
            cli.setLastName("Goku");
            cli.setDocIdentity("001-041297-0256D");
            cli.setDocType(false);
            cli.setNationality("Nicaragua");
            cli.setPhone("88563207");
            cli.setAddress("por ahi");
            cli.setEmail("correo@gmail.com");
            cli.setErasedStatus(true);
            //ncli.save(cli, 0);
            LoginController lc= new LoginController();
            Users user = lc.findUserLogin("JEMR");
            System.out.println(user.getUserName()+" "+user.getPass());
                   
            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}

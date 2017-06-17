/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Category;
import Pojo.Employee;
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
public class NewEmployee {

    NewHibernateUtil conect = new NewHibernateUtil();

    public NewEmployee() {
    }

    /*=================CRUD 0: crea uno nuevo 1: actualiza 2:borra=================*/
    public void save(Employee employee, int selection) {
        conect.open();
        Transaction trans = conect.getSession().beginTransaction();
        switch (selection) {
            case 0:
                conect.getSession().save(employee);
                trans.commit();
                break;
            case 1:
                conect.getSession().update(employee);
                trans.commit();
                break;
            case 2:
                employee.setErasedStatus(false);
                conect.getSession().update(employee);
                trans.commit();
                break;
        }
        conect.close();
    }

    public List<Employee> findAll() {
        conect.open();
        List<Employee> list = new ArrayList<>();
        SQLQuery query = conect.getSession().createSQLQuery("select * from Employee where erasedStatus=1");
        query.addEntity(Employee.class);
        for (Iterator i = query.list().iterator(); i.hasNext();) {
            Employee c = (Employee) i.next();
            list.add(c);
        }
        conect.close();
        return list;
    }

    /*================CRUD====================*/
 /*================Controller==============*/
    public Employee findEmployeeByUser(String user) {
        conect.open();
        Employee e = (Employee) conect.getSession().createSQLQuery(String.format("select * from employee e\n"
                + "inner join users u\n"
                + "on e.IdEmployee=u.IdEmployee\n"
                + "where u.userName='%s'", user)).addEntity(Employee.class).list().iterator().next();
        conect.close();
        return e;
    }    
    public Employee findEmployeeByDoc(String docIdentity){
        conect.open();
        Employee e= new Employee();
        findAll().forEach(emp->{
            if (emp.getDocIdentity().equals(docIdentity)) {
                e.setIdEmployee(emp.getIdEmployee());
                e.setFirstName(emp.getFirstName());
                e.setSecondName(emp.getSecondName());
                e.setSurname(emp.getSurname());
                e.setSecondSurname(emp.getSecondSurname());
                e.setDocIdentity(emp.getDocIdentity());
                e.setPhone(emp.getPhone());
                e.setAddress(emp.getAddress());
                e.setSalary(emp.getSalary());
                e.setEmail(emp.getEmail());
                e.setTypeEmployee(emp.getTypeEmployee());
                e.setErasedStatus(emp.getErasedStatus());
            }
        });
        return e;
    }
    /*================Controller==============*/

}

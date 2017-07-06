/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Pojo.Clients;
import Pojo.Room;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Evander R
 */
public class GlobalVars {

    public static int userId;
    public static String userName;
    public static int typeEmployee;
    public static String nameEmployee;
    public static int employeeId;
    public static List<Clients> clients = new ArrayList<>();
    public static List<Room> rooms = new ArrayList<>();
    public static Date dateReservation;
    public static Date dateDue;
    public static int days;
    public static long rode;

    public GlobalVars() {
    }

    public static int getIndex(Room r) {
        int i = 0;
        int j = 0;
        for (Room ro : rooms) {
            if (ro.getIdRoom() == r.getIdRoom()) {
                j = i;
            }
            i++;
        }
        return j;
    }

    public static void setPrincipal(Clients c) {
        clients.forEach(cli->{
            if (cli.getIdClient()==c.getIdClient()) {
                cli.setDocType(true);
            }
            else{
                cli.setDocType(false);
            }
        });
    }

    public static int getUserId() {
        return userId;
    }
        
    public static void setUserId(int userId) {
        GlobalVars.userId = userId;
    }

    public static long getRode() {
        return rode;
    }

    public static void setRode(long rode) {
        GlobalVars.rode = rode;
    }
    
    public static Date getDateReservation() {
        return dateReservation;
    }

    public static void setDateReservation(Date dateReservation) {
        GlobalVars.dateReservation = dateReservation;
    }

    public static Date getDateDue() {
        return dateDue;
    }

    public static int getDays() {
        return days;
    }

    public static void setDays(int days) {
        GlobalVars.days = days;
    }

    public static void setDateDue(Date dateDue) {
        GlobalVars.dateDue = dateDue;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        GlobalVars.userName = userName;
    }

    public static int getTypeEmployee() {
        return typeEmployee;
    }

    public static void setTypeEmployee(int typeEmployee) {
        GlobalVars.typeEmployee = typeEmployee;
    }

    public static String getNameEmployee() {
        return nameEmployee;
    }

    public static void setNameEmployee(String nameEmployee) {
        GlobalVars.nameEmployee = nameEmployee;
    }

    public static int getEmployeeId() {
        return employeeId;
    }

    public static void setEmployeeId(int employeeId) {
        GlobalVars.employeeId = employeeId;
    }

}

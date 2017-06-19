/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

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
    public GlobalVars() {
    }

    
    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        GlobalVars.userId = userId;
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

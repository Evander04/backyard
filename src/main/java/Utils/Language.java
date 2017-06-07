/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.IOException;

/**
 *
 * @author Evander R
 */
public class Language {

    ConfigFile cf= new ConfigFile();
    public final int config;
    public String var = "";

    public Language() throws IOException {
        this.config = cf.findByID(1).getLanguage();
    }

  
    public String getNuevo() {
        switch (config) {
            case 0:
                var = "Nuevo";
                break;
            case 1:
                var = "New";
                break;
        }
        return var;
    }
    
    public String getNuevoEmpleado() {
        switch (config) {
            case 0:
                var = "Nuevo Empleado";
                break;
            case 1:
                var = "New Employee";
                break;
        }
        return var;
    }
    public String getNuevoCliente() {
        switch (config) {
            case 0:
                var = "Nuevo Cliente";
                break;
            case 1:
                var = "New Client";
                break;
        }
        return var;
    }
    public String getNuevaHabitacion() {
        switch (config) {
            case 0:
                var = "Nueva Habitación";
                break;
            case 1:
                var = "New Room";
                break;
        }
        return var;
    }
    
    public String getNuevaCategoria() {
        switch (config) {
            case 0:
                var = "Nueva Categoría";
                break;
            case 1:
                var = "New Category";
                break;
        }
        return var;
    }
   public String getNuevaExtra() {
        switch (config) {
            case 0:
                var = "Nueva Extra";
                break;
            case 1:
                var = "New Extra";
                break;
        }
        return var;
    }
   public String getBotonGuardar() {
        switch (config) {
            case 0:
                var = "Guardar";
                break;
            case 1:
                var = "Save";
                break;
        }
        return var;
    }
    
//prueba
    
}

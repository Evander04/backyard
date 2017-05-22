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
public class Language {

    public final int config = 1;
    public String var = "";

    public Language() {
    }

    public String getTitulo() {
        switch (config) {
            case 0:
                var = "Titulo en español";
                break;
            case 1:
                var = "English Title";
                break;
        }
        return var;
    }

    public String getMensaje() {
        switch (config) {
            case 0:
                var = "Buñuelo sin queso";
                break;
            case 1:
                var = "Buñueleishon with out cheese";
                break;
        }
        return var;
    }
//prueba
    
}

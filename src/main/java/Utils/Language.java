/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Frames.FrameCrearReserva;
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

    // ***************************************************FRAME PRINCIPAL *****************************************************************************************************************
    public String getPrincipalTitulo() {
        switch (config) {
            case 0:
                var = "BIENVENIDO";
                break;
            case 1:
                var = "WELCOME";
                break;
        }
        return var;
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
   public String getSalida() {
        switch (config) {
            case 0:
                var = "Salir";
                break;
            case 1:
                var = "Exit";
                break;
        }
        return var;
    }
   public String getOperaciones() {
        switch (config) {
            case 0:
                var = "Operaciones";
                break;
            case 1:
                var = "Operations";
                break;
        }
        return var;
    }
   public String getNuevaReserva() {
        switch (config) {
            case 0:
                var = "Reserva";
                break;
            case 1:
                var = "Reserved";
                break;
        }
        return var;
    }
   public String getNuevaFactura() {
        switch (config) {
            case 0:
                var = "Factura";
                break;
            case 1:
                var = "Invoice";
                break;
        }
        return var;
    }
   public String getCentralEstadistica() {
        switch (config) {
            case 0:
                var = "Central Estadistica";
                break;
            case 1:
                var = "Statistics Central";
                break;
        }
        return var;
    }
   public String getReporte() {
        switch (config) {
            case 0:
                var = "Reportes";
                break;
            case 1:
                var = "Report";
                break;
        }
        return var;
    }
   public String getConfiguracion() {
        switch (config) {
            case 0:
                var = "Configuraciones";
                break;
            case 1:
                var = "Configuration";
                break;
        }
        return var;
    }
   public String getCambiarIdioma() {
        switch (config) {
            case 0:
                var = "Idioma";
                break;
            case 1:
                var = "Language";
                break;
        }
        return var;
    }
   public String getCambioUsuario() {
        switch (config) {
            case 0:
                var = "Usuario";
                break;
            case 1:
                var = "User";
                break;
        }
        return var;
    }
   //=========================================================Frame Usuario y  algo del Frame Login==========================================================
    public String getFrameUsuarioTitulo() {
        switch (config) {
            case 0:
                var = "USUARIO";
                break;
            case 1:
                var = "USER";
                break;
        }
        return var;
    }
    public String getLabelUsuario() {
        switch (config) {
            case 0:
                var = "Usuario:";
                break;
            case 1:
                var = "User:";
                break;
        }
        return var;
    }
    public String getLabelContraseña() {
        switch (config) {
            case 0:
                var = "Contraseña:";
                break;
            case 1:
                var = "Password:";
                break;
        }
        return var;
    }
    public String getlabelTrabajador() {
        switch (config) {
            case 0:
                var = "Trabajador:";
                break;
            case 1:
                var = "Workman:";
                break;
        }
        return var;
    }
     public String getCBMostrar() {
        switch (config) {
            case 0:
                var = "Mostrar";
                break;
            case 1:
                var = "Show";
                break;
        }
        return var;
    }
 //=========================================================Frame Crear Reserva=========================================================
     public String getFrameCrearReservaTitulo() {
        switch (config) {
            case 0:
                var = "RESERVACION";
                break;
            case 1:
                var = "RESERVATION";
                break;
        }
        return var;
    }
     public String getlabelBuscarCliente() {
        switch (config) {
            case 0:
                var = "Buscar Cliente:";
                break;
            case 1:
                var = "Search Customer:";
                break;
        }
        return var;
    }
      public String getDatePiker() {
        switch (config) {
            case 0:
                FrameCrearReserva cr = new FrameCrearReserva();
               // cr.jXDatePicker1.setDefaults( jXDatePicker1.datepicker.regional[ "fr" ] );

                break;
            case 1:
                var = "Search Customer:";
                break;
        }
        return var;
    }
      public String getTabPanePrivada() {
      switch (config) {
            case 0:
                var = "PRIVADA";
                break;
            case 1:
                var = "PRIVATE";
                break;
        }
        return var;
    }
     public String getLabelCalendario() {
      switch (config) {
            case 0:
                var = "Calendario";
                break;
            case 1:
                var = "Calendar";
                break;
        }
        return var;
    }  
//=========================================================Frame Crear Empleado=========================================================
       public String getFrameCrearEmpleadoTitulo() {
      switch (config) {
            case 0:
                var = "Agregar Empleado";
                break;
            case 1:
                var = "Add Employee";
                break;
        }
        return var;
    } 
    public String getLabelPrimerNombre() {
      switch (config) {
            case 0:
                var = "Primer Nombre:";
                break;
            case 1:
                var = "First Name:";
                break;
        }
        return var;
    }
    public String getLabelSegundoNombre() {
      switch (config) {
            case 0:
                var = "Segundo Nombre:";
                break;
            case 1:
                var = "Second Name:";
                break;
        }
        return var;
    }
     public String getLabelPrimerApellido() {
      switch (config) {
            case 0:
                var = "Primer Apellido:";
                break;
            case 1:
                var = "First Surname:";
                break;
        }
        return var;
    }
    public String getLabelSegundoApellido() {
      switch (config) {
            case 0:
                var = "Segundo Apellido:";
                break;
            case 1:
                var = "Second Surname:";
                break;
        }
        return var;
    }
    public String getLabelIdentificacion() {
      switch (config) {
            case 0:
                var = "Identificación:";
                break;
            case 1:
                var = "Identification:";
                break;
        }
        return var;
    }
    public String getLabelTelefono() {
      switch (config) {
            case 0:
                var = "Teléfono:";
                break;
            case 1:
                var = "Telephone:";
                break;
        }
        return var;
    }
    public String getLabelSalario() {
      switch (config) {
            case 0:
                var = "Salario:";
                break;
            case 1:
                var = "Salary:";
                break;
        }
        return var;
    }
    public String getLabelCorreo() {
      switch (config) {
            case 0:
                var = "Correo:";
                break;
            case 1:
                var = "EMail:";
                break;
        }
        return var;
    }
    public String getLabelTipo() {
      switch (config) {
            case 0:
                var = "Tipo:";
                break;
            case 1:
                var = "Type:";
                break;
        }
        return var;
    }
    public String getLabelDireccion() {
      switch (config) {
            case 0:
                var = "Dirección:";
                break;
            case 1:
                var = "Anddress:";
                break;
        }
        return var;
    }
    public String getLabelTipodeBusqueda() {
      switch (config) {
            case 0:
                var = "Tipo de Busquedad:";
                break;
            case 1:
                var = "Search Type:";
                break;
        }
        return var;
    }
//=========================================================Frame Crear Cliente=========================================================
    public String getFrameCrearClienteTitulo() {
      switch (config) {
            case 0:
                var = "Cliente";
                break;
            case 1:
                var = "Customer";
                break;
        }
        return var;
    }
    
   public String getLabelNombre() {
      switch (config) {
            case 0:
                var = "Nombre:";
                break;
            case 1:
                var = "Name:";
                break;
        }
        return var;
    }
   public String getLabelApellido() {
      switch (config) {
            case 0:
                var = "Apellido:";
                break;
            case 1:
                var = "Last Name:";
                break;
        }
        return var;
    }
   public String getLabelTipoIdentificaion() {
      switch (config) {
            case 0:
                var = "Tipo de Identificación:";
                break;
            case 1:
                var = "Identification:";
                break;
        }
        return var;
    }
   public String getLabelNacionalidad() {
      switch (config) {
            case 0:
                var = "Nacionalidad:";
                break;
            case 1:
                var = "Nationality:";
                break;
        }
        return var;
    }
//=========================================================Frame Crear habitacion=========================================================
   public String getFrameAgregarHabitacionTitulo() {
      switch (config) {
            case 0:
                var = "Nueva Habitacion";
                break;
            case 1:
                var = "New Room";
                break;
        }
        return var;
    }
   public String getLabelCapacidad() {
      switch (config) {
            case 0:
                var = "Capacidad:";
                break;
            case 1:
                var = "Capacity:";
                break;
        }
        return var;
    }
   public String getLabelPrecio() {
      switch (config) {
            case 0:
                var = "Precio:";
                break;
            case 1:
                var = "Price:";
                break;
        }
        return var;
    }
   public String getLabelCategoria() {
      switch (config) {
            case 0:
                var = "Categoria:";
                break;
            case 1:
                var = "Category:";
                break;
        }
        return var;
    }
   public String getLabelDescripcion() {
      switch (config) {
            case 0:
                var = "Descripción:";
                break;
            case 1:
                var = "Description:";
                break;
        }
        return var;
    }
//=========================================================Frame Agregar Extra=========================================================
   public String getFrameAgregarExtraTitulo() {
      switch (config) {
            case 0:
                var = "AGREGAR EXTRA";
                break;
            case 1:
                var = "ADD EXTRA";
                break;
        }
        return var;
    }
   public String getLabelMonto() {
      switch (config) {
            case 0:
                var = "Monto:";
                break;
            case 1:
                var = "Amount:";
                break;
        }
        return var;
    }
//=========================================================Frame Agregar Extra=========================================================
   public String getFrameAgregarCategoria() {
      switch (config) {
            case 0:
                var = "CATEGORIA";
                break;
            case 1:
                var = "CATEGORY";
                break;
        }
        return var;
    }
   public String getLabelTipoCategoria() {
      switch (config) {
            case 0:
                var = "Tipo de Categoria:";
                break;
            case 1:
                var = "Category Type:";
                break;
        }
        return var;
    }
//************************************************************BOTONES************************************************************
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
     public String getBotonCrear() {
        switch (config) {
            case 0:
                var = "Crear";
                break;
            case 1:
                var = "Create";
                break;
        }
        return var;
    }
      public String getBotonEntrar() {
        switch (config) {
            case 0:
                var = "Entrar";
                break;
            case 1:
                var = "Come In";
                break;
        }
        return var;
    }
     public String getBotonBuscar() {
        switch (config) {
            case 0:
                var = "Buscar";
                break;
            case 1:
                var = "Search";
                break;
        }
        return var;
    }
     public String getBotonAgregarCliente() {
        switch (config) {
            case 0:
                var = "Agregar Cliente";
                break;
            case 1:
                var = "Add Customer";
                break;
        }
        return var;
    }
     public String getBotonCancelar() {
        switch (config) {
            case 0:
                var = "Cancelar";
                break;
            case 1:
                var = "Cancel";
                break;
        }
        return var;
    }
    public String getBotonAgregar() {
        switch (config) {
            case 0:
                var = "Agregar";
                break;
            case 1:
                var = "Add";
                break;
        }
        return var;
    }
//prueba
    
}

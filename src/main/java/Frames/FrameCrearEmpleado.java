/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controllers.NewEmployee;
import static Frames.PrincipalBackyard.desktopPane;
import Pojo.Clients;
import Pojo.Employee;
import Utils.Language;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.*;

/**
 *
 * @author Obed
 */
public class FrameCrearEmpleado extends javax.swing.JInternalFrame {
    
    NewEmployee newEmployee = new NewEmployee();
    boolean noExist = true;
    Employee employeeRecive;
    int origin = 0;    
    /**
     * Creates new form FrameCrearEmpleado
     */
    public FrameCrearEmpleado() {
        //this.l = new Language();
        initComponents();
        setLenguage();        
        origin = 0;
        patern();
    }
    public FrameCrearEmpleado(Employee e){
        try {
            this.employeeRecive = e;
            initComponents();
            setLenguage();
            loadData();
            origin=1;
            Language l= new Language();
            this.jBtnGuardarEmpleado.setText(l.getBotonActualizar());
            this.jBtnGuardarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/refresh.png")));
        } catch (IOException ex) {
            Logger.getLogger(FrameCrearEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void setLenguage(){
         try {
            Language l = new Language();
            FrameCrearEmpleado.this.setFrameIcon(new ImageIcon(getClass().getResource("../icon32x32/adim.png")));   
            this.jBtnGuardarEmpleado.setBackground(Color.WHITE);
            this.jBtnCancelarCreacionEmpleado.setBackground(Color.WHITE);
            FrameCrearEmpleado.this.setTitle(l.getFrameCrearEmpleadoTitulo());
            this.jLabelPrimerNombre.setText(l.getLabelPrimerNombre());
            this.jLabelSegundoNombre.setText(l.getLabelSegundoNombre());
            this.jLabelPrimerApellido.setText(l.getLabelPrimerApellido());
            this.jLabelSegundoApellido.setText(l.getLabelSegundoApellido());
            this.jLabelIdentificacion.setText(l.getLabelIdentificacion());
            this.jLabelTelefono.setText(l.getLabelTelefono());
            this.jLabelSalario.setText(l.getLabelSalario());
            this.jLabelCorreo.setText(l.getLabelCorreo());
            this.jLabelTipo.setText(l.getLabelTipo());
            this.jLabelDireccion.setText(l.getLabelDireccion());
            this.jBtnGuardarEmpleado.setText(l.getBotonGuardar());
            this.jBtnCancelarCreacionEmpleado.setText(l.getBotonCancelar());            
            origin = 1;
        } catch (IOException ex) {
            Logger.getLogger(PrincipalBackyard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void loadData(){
        this.jTextPrimerNombreEmpleado.setText(employeeRecive.getFirstName());
        this.jTextSegundoNombreEmpleado.setText(employeeRecive.getSecondName());
        this.jTextPrimerApellidoEmpleado.setText(employeeRecive.getSurname());
        this.jTextSegundoApellidoEmpleado.setText(employeeRecive.getSecondSurname());
        this.jFTFTidentificacion.setText(employeeRecive.getDocIdentity());
        this.jFTFTelefono.setText(employeeRecive.getPhone());
        this.jTextSalarioEmpleado.setText(employeeRecive.getSalary().toString());
        this.jTextCorreoEmpleado.setText(employeeRecive.getEmail());
        this.jCBTipoEmpleado.setSelectedIndex(employeeRecive.getTypeEmployee());
        this.jTextAreaDireccionEmpleado.setText(employeeRecive.getAddress().toString());
    }
    public void patern(){
        String pr = this.jTextSalarioEmpleado.getText();
        Pattern p = Pattern.compile("[\\p{Alnum}]");
        Matcher m = p.matcher(pr);
        if(!m.find()){
       // evt.consume();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabelPrimerNombre = new javax.swing.JLabel();
        jTextPrimerNombreEmpleado = new javax.swing.JTextField();
        jLabelSegundoNombre = new javax.swing.JLabel();
        jTextSegundoNombreEmpleado = new javax.swing.JTextField();
        jLabelPrimerApellido = new javax.swing.JLabel();
        jTextPrimerApellidoEmpleado = new javax.swing.JTextField();
        jLabelSegundoApellido = new javax.swing.JLabel();
        jTextSegundoApellidoEmpleado = new javax.swing.JTextField();
        jLabelIdentificacion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jTextSalarioEmpleado = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTextCorreoEmpleado = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jCBTipoEmpleado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDireccionEmpleado = new javax.swing.JTextArea();
        jLabelDireccion = new javax.swing.JLabel();
        jBtnGuardarEmpleado = new javax.swing.JButton();
        jBtnCancelarCreacionEmpleado = new javax.swing.JButton();
        jFTFTelefono = new javax.swing.JFormattedTextField();
        jFTFTidentificacion = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Agregar Empleado");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/hotel_finder_21775.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabelPrimerNombre.setText("Primer Nombre:");

        jLabelSegundoNombre.setText("Segundo Nombre:");

        jLabelPrimerApellido.setText("Primer Apellido:");

        jLabelSegundoApellido.setText("Segundo Apellido:");

        jLabelIdentificacion.setText("Identificación");

        jLabelTelefono.setText("Telefono:");

        jLabelSalario.setText("Salario:");

        jTextSalarioEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextSalarioEmpleadoKeyTyped(evt);
            }
        });

        jLabelCorreo.setText("Correo:");

        jLabelTipo.setText("Tipo:");

        jCBTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mortal", "Supervisor", "Gerente" }));

        jTextAreaDireccionEmpleado.setColumns(20);
        jTextAreaDireccionEmpleado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDireccionEmpleado);

        jLabelDireccion.setText("Dirección:");

        jBtnGuardarEmpleado.setBackground(new java.awt.Color(187, 187, 187));
        jBtnGuardarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnGuardarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/save.png"))); // NOI18N
        jBtnGuardarEmpleado.setText("Guardar");
        jBtnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarEmpleadoActionPerformed(evt);
            }
        });

        jBtnCancelarCreacionEmpleado.setBackground(new java.awt.Color(187, 187, 187));
        jBtnCancelarCreacionEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnCancelarCreacionEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/cancel.png"))); // NOI18N
        jBtnCancelarCreacionEmpleado.setText("Cancelar");
        jBtnCancelarCreacionEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarCreacionEmpleadoActionPerformed(evt);
            }
        });

        try {
            jFTFTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTFTidentificacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSegundoNombre)
                            .addComponent(jLabelPrimerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTipo)
                                    .addComponent(jLabelCorreo))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCBTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelDireccion)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSegundoApellido)
                                    .addComponent(jLabelPrimerApellido)
                                    .addComponent(jLabelSalario)
                                    .addComponent(jLabelTelefono)
                                    .addComponent(jLabelIdentificacion))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextSegundoNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextPrimerApellidoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextSegundoApellidoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextSalarioEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jFTFTelefono)
                                        .addComponent(jFTFTidentificacion)
                                        .addComponent(jTextPrimerNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jBtnGuardarEmpleado)
                .addGap(50, 50, 50)
                .addComponent(jBtnCancelarCreacionEmpleado)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrimerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextPrimerNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSegundoNombre)
                    .addComponent(jTextSegundoNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrimerApellido)
                    .addComponent(jTextPrimerApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSegundoApellido)
                    .addComponent(jTextSegundoApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificacion)
                    .addComponent(jFTFTidentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jFTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalario)
                    .addComponent(jTextSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorreo)
                    .addComponent(jTextCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jCBTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDireccion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelarCreacionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBtnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarEmpleadoActionPerformed
        // TODO add your handling code here:        
      Language l = null;
        try {
            l = new Language();
        } catch (IOException ex) {
            Logger.getLogger(FrameCrearEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (validateNull()) {
            JOptionPane.showMessageDialog(null, l.getCamposVaciosOMalos(), l.getAlerta(), JOptionPane.ERROR_MESSAGE);
        } else {
            NewEmployee newEmployee = new NewEmployee();
            switch (origin){
                case 0:{
            Employee e= new Employee();
            e.setFirstName(this.jTextPrimerNombreEmpleado.getText());
            e.setSecondName(this.jTextSegundoNombreEmpleado.getText());
            e.setSurname(this.jTextPrimerApellidoEmpleado.getText());
            e.setSecondSurname(this.jTextSegundoApellidoEmpleado.getText());
            e.setDocIdentity(this.jFTFTidentificacion.getText());
            e.setPhone(this.jFTFTelefono.getText());
            e.setEmail(this.jTextCorreoEmpleado.getText());
            e.setSalary(Long.parseLong(this.jTextSalarioEmpleado.getText()));
            e.setAddress(this.jTextAreaDireccionEmpleado.getText());
            e.setTypeEmployee(this.jCBTipoEmpleado.getSelectedIndex());
            e.setErasedStatus(true);
            newEmployee.save(e, 0);
            clean();
            JOptionPane.showMessageDialog(null,l.getGuardadocorrecto(),l.getEXITO(),JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            break;
                }
                case 1: {
            employeeRecive.setFirstName(this.jTextPrimerNombreEmpleado.getText());
            employeeRecive.setSecondName(this.jTextSegundoNombreEmpleado.getText());
            employeeRecive.setSurname(this.jTextPrimerApellidoEmpleado.getText());
            employeeRecive.setSecondSurname(this.jTextSegundoApellidoEmpleado.getText());
            employeeRecive.setDocIdentity(this.jFTFTidentificacion.getText());
            employeeRecive.setPhone(this.jFTFTelefono.getText());
            employeeRecive.setEmail(this.jTextCorreoEmpleado.getText());
            employeeRecive.setSalary(Long.parseLong(this.jTextSalarioEmpleado.getText()));
            employeeRecive.setAddress(this.jTextAreaDireccionEmpleado.getText());
            employeeRecive.setTypeEmployee(this.jCBTipoEmpleado.getSelectedIndex());
            newEmployee.save(employeeRecive, 1);
            JOptionPane.showMessageDialog(null, l.getActualizadocorrecto(),l.getEXITO(),JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
                }
            }      
    }//GEN-LAST:event_jBtnGuardarEmpleadoActionPerformed
    }
    private void jBtnCancelarCreacionEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarCreacionEmpleadoActionPerformed
        // TODO add your handling code here:
        
        FrameListEmployee fcc = new FrameListEmployee();
        desktopPane.add(fcc);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fcc.getSize();
        fcc.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fcc.show();
        this.dispose();
    }//GEN-LAST:event_jBtnCancelarCreacionEmpleadoActionPerformed

    private void jTextSalarioEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSalarioEmpleadoKeyTyped
        // TODO add your handling code here:
        String pr = Character.toString(evt.getKeyChar());
        Pattern p = Pattern.compile("[\\p{Alnum}]");
        Matcher m = p.matcher(pr);
        if(!m.find()){
        evt.consume();
            System.out.println("verga");
        }
    }//GEN-LAST:event_jTextSalarioEmpleadoKeyTyped
   /* public void loadData(){
    this.jCBTipoEmpleado
}*/
    
    public String docType(){
        String text = this.jCBTipoEmpleado.getSelectedItem().toString();
        String doc = text.substring(text.length() - 16,text.length());
        return doc;
    }
    public boolean validateNull() {
        boolean val = false;
        if (this.jTextPrimerNombreEmpleado.getText().equals("")) {
            val = true;
        } else if (this.jTextSegundoNombreEmpleado.getText().equals("")) {
            val = true;
        } else if (this.jTextPrimerApellidoEmpleado.getText().equals("")) {
            val = true;
        } else if (this.jTextSegundoApellidoEmpleado.getText().equals("")) {
            val = true;
        } else if (this.jFTFTidentificacion.getText().equals("")) {
            val = true;
        } else if (this.jFTFTelefono.getText().equals("")) {
            val = true;
        } else if (this.jTextSalarioEmpleado.getText().equals("")) {
            val = true;
        } else if (this.jTextCorreoEmpleado.getText().equals("")) {
            val = true;
        } else if (this.jTextAreaDireccionEmpleado.getText().equals("")) {
            val = true;
        }else if (this.jFTFTelefono.getText().length()<8) {
            val = true;
        }else if (this.jFTFTidentificacion.getText().length()<=15) {
            val = true;
        }
        return val;
    }

    public void clean() {
        this.jTextPrimerNombreEmpleado.setText("");
        this.jTextSegundoNombreEmpleado.setText("");
        this.jTextPrimerApellidoEmpleado.setText("");
        this.jTextSegundoApellidoEmpleado.setText("");
        this.jFTFTidentificacion.setText("");
        this.jFTFTelefono.setText("");
        this.jTextSalarioEmpleado.setText("");
        this.jTextCorreoEmpleado.setText("");
        this.jTextAreaDireccionEmpleado.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnCancelarCreacionEmpleado;
    private javax.swing.JButton jBtnGuardarEmpleado;
    private javax.swing.JComboBox<String> jCBTipoEmpleado;
    private javax.swing.JFormattedTextField jFTFTelefono;
    private javax.swing.JFormattedTextField jFTFTidentificacion;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelIdentificacion;
    private javax.swing.JLabel jLabelPrimerApellido;
    private javax.swing.JLabel jLabelPrimerNombre;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JLabel jLabelSegundoApellido;
    private javax.swing.JLabel jLabelSegundoNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDireccionEmpleado;
    private javax.swing.JTextField jTextCorreoEmpleado;
    private javax.swing.JTextField jTextPrimerApellidoEmpleado;
    private javax.swing.JTextField jTextPrimerNombreEmpleado;
    private javax.swing.JTextField jTextSalarioEmpleado;
    private javax.swing.JTextField jTextSegundoApellidoEmpleado;
    private javax.swing.JTextField jTextSegundoNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}

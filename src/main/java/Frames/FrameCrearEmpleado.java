/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controllers.NewEmployee;
import Pojo.Clients;
import Pojo.Employee;
import java.awt.Component;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.*;

/**
 *
 * @author Obed
 */
public class FrameCrearEmpleado extends javax.swing.JInternalFrame {

    Employee e;

    /**
     * Creates new form FrameCrearEmpleado
     */
    public FrameCrearEmpleado() {
        initComponents();
        e = new Employee();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextPrimerNombreEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextSegundoNombreEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextPrimerApellidoEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextSegundoApellidoEmpleado = new javax.swing.JTextField();
        jTextCedulaEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextSalarioEmpleado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextCorreoEmpleado = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCBTipoEmpleado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDireccionEmpleado = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jBtnGuardarEmpleado = new javax.swing.JButton();
        jBtnCancelarCreacionEmpleado = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Agregar Cliente");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/hotel_finder_21775.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Tipo de Busqueda:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Telefono", "Correo" }));

        jButton1.setBackground(new java.awt.Color(187, 187, 187));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/search.png"))); // NOI18N
        jButton1.setText("Buscar");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Primer Nombre:");

        jLabel3.setText("Segundo Nombre:");

        jLabel4.setText("Primer Apellido:");

        jLabel5.setText("Segundo Apellido:");

        jLabel6.setText("Identificación");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Salario:");

        jLabel11.setText("Correo:");

        jLabel9.setText("Tipo:");

        jCBTipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mortal", "Supervisor", "Gerente" }));

        jTextAreaDireccionEmpleado.setColumns(20);
        jTextAreaDireccionEmpleado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDireccionEmpleado);

        jLabel10.setText("Dirección:");

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextSegundoNombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jTextPrimerNombreEmpleado)))
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textTelefono)
                            .addComponent(jTextCedulaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jTextPrimerApellidoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextSegundoApellidoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextSalarioEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10))
                .addGap(0, 377, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jBtnGuardarEmpleado)
                .addGap(50, 50, 50)
                .addComponent(jBtnCancelarCreacionEmpleado)
                .addGap(297, 297, 297))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextPrimerNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextSegundoNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPrimerApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextSegundoApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextCorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCBTipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnGuardarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCancelarCreacionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBtnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarEmpleadoActionPerformed
        // TODO add your handling code here:        
        if (validateNull()) {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos", "Atención", JOptionPane.ERROR_MESSAGE);
        } else {
            NewEmployee newEmployee = new NewEmployee();
            e.setFirstName(this.jTextPrimerNombreEmpleado.getText());
            e.setSecondName(this.jTextSegundoNombreEmpleado.getText());
            e.setSurname(this.jTextPrimerApellidoEmpleado.getText());
            e.setSecondSurname(this.jTextSegundoApellidoEmpleado.getText());
            e.setDocIdentity(this.jTextCedulaEmpleado.getText());
            e.setPhone(this.textTelefono.getText());
            e.setEmail(this.jTextCorreoEmpleado.getText());
            e.setSalary(Long.parseLong(this.jTextSalarioEmpleado.getText()));
            e.setAddress(this.jTextAreaDireccionEmpleado.getText());
            e.setTypeEmployee(this.jCBTipoEmpleado.getSelectedIndex());
            e.setErasedStatus(true);
            newEmployee.save(e, 0);
            clean();
            JOptionPane.showMessageDialog(null,"Se guardó el empleado correctamente","Éxito",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnGuardarEmpleadoActionPerformed

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
        } else if (this.jTextCedulaEmpleado.getText().equals("")) {
            val = true;
        } else if (this.textTelefono.getText().equals("")) {
            val = true;
        } else if (this.jTextSalarioEmpleado.getText().equals("")) {
            val = true;
        } else if (this.jTextCorreoEmpleado.getText().equals("")) {
            val = true;
        } else if (this.jTextAreaDireccionEmpleado.getText().equals("")) {
            val = true;
        }
        return val;
    }

    public void clean() {
        this.jTextPrimerNombreEmpleado.setText("");
        this.jTextSegundoNombreEmpleado.setText("");
        this.jTextPrimerApellidoEmpleado.setText("");
        this.jTextSegundoApellidoEmpleado.setText("");
        this.jTextCedulaEmpleado.setText("");
        this.textTelefono.setText("");
        this.jTextSalarioEmpleado.setText("");
        this.jTextCorreoEmpleado.setText("");
        this.jTextAreaDireccionEmpleado.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnCancelarCreacionEmpleado;
    private javax.swing.JButton jBtnGuardarEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBTipoEmpleado;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDireccionEmpleado;
    private javax.swing.JTextField jTextCedulaEmpleado;
    private javax.swing.JTextField jTextCorreoEmpleado;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextPrimerApellidoEmpleado;
    private javax.swing.JTextField jTextPrimerNombreEmpleado;
    private javax.swing.JTextField jTextSalarioEmpleado;
    private javax.swing.JTextField jTextSegundoApellidoEmpleado;
    private javax.swing.JTextField jTextSegundoNombreEmpleado;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}

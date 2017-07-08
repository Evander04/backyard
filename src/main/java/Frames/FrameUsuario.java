/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controllers.LoginController;
import Controllers.NewEmployee;
import Controllers.NewUsers;
import Pojo.Employee;
import Pojo.Users;
import Utils.Hash;
import Utils.Language;
import java.awt.JobAttributes;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;
import javax.swing.JOptionPane;

/**
 *
 * @author Evander R
 */
public class FrameUsuario extends javax.swing.JInternalFrame {

    NewEmployee newEmployee = new NewEmployee();
    NewUsers newUsers = new NewUsers();
    boolean noExist = true;
    Users userRecieve = new Users();
    int origin = 0;
    /**
     * Creates new form FrameUsuario
     */
    public FrameUsuario() {
        initComponents();
        setLanguage();
        loadData();
        origin=0;
    }

    public FrameUsuario(Users u) {
        this.userRecieve = u;
        initComponents();
        setLanguage();
        loadData();
        this.jPanel2.remove(this.jlabeltrabajador);
        this.jPanel2.remove(this.textTrabajador);
        this.textUser.setText(userRecieve.getUserName());
        this.button.setText("Actualizar");
        this.button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/refresh.png")));
    }

    public void setLanguage() {
        try {
            Language l = new Language();
            FrameUsuario.this.setTitle(l.getFrameUsuarioTitulo());//Titulo frameuser     
            this.jLabelUsuario.setText(l.getLabelUsuario());
            this.jlabelContraseña.setText(l.getLabelContraseña());
            this.jlabeltrabajador.setText(l.getlabelTrabajador());
            this.button.setText(l.getBotonCrear());
            this.jCBMostra.setText(l.getCBMostrar());
            origin=1;
        } catch (IOException ex) {
            Logger.getLogger(FrameUsuario.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        jlabelContraseña = new javax.swing.JLabel();
        TextPass = new javax.swing.JPasswordField();
        jlabeltrabajador = new javax.swing.JLabel();
        textTrabajador = new javax.swing.JComboBox<>();
        button = new javax.swing.JButton();
        jCBMostra = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("USUARIO");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/Add_User-80_icon-icons.com_57380.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario:");
        jLabelUsuario.setPreferredSize(new java.awt.Dimension(100, 17));

        textUser.setEnabled(false);

        jlabelContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabelContraseña.setText("Contraseña: ");
        jlabelContraseña.setPreferredSize(new java.awt.Dimension(100, 17));

        jlabeltrabajador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlabeltrabajador.setText("Trabajador: ");
        jlabeltrabajador.setPreferredSize(new java.awt.Dimension(100, 17));

        textTrabajador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                textTrabajadorItemStateChanged(evt);
            }
        });

        button.setBackground(new java.awt.Color(255, 255, 255));
        button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/Add_User-80_icon-icons.com_57380.png"))); // NOI18N
        button.setText("Crear");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        jCBMostra.setBackground(new java.awt.Color(255, 255, 255));
        jCBMostra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCBMostra.setText("Mostrar");
        jCBMostra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBMostraItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabeltrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextPass)
                    .addComponent(textUser, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(textTrabajador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jCBMostra)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBMostra))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabeltrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBMostraItemStateChanged(java.awt.event.ItemEvent evt) {
        if ((evt.getStateChange() == 1) ? true : false) {
            this.TextPass.setEchoChar((char) 0); //password = JPasswordField
        } else {

            this.TextPass.setEchoChar('*');
        }
    }

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        try {
            Language l = new Language();
            if (validateNull()) {
                
                JOptionPane.showMessageDialog(null, l.getCamposVaciosOMalos(), l.getError(), JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    Hash h = new Hash();
                    NewUsers nu = new NewUsers();
                    switch (origin) {
                        case 0:
                            Users u = new Users();
                            Employee e = newEmployee.findEmployeeByDoc(docIdentity());
                            u.setEmployee(e);
                            u.setUserName(this.textUser.getText());
                            u.setPass(h.Sha512(this.TextPass.getText()));
                            nu.save(u, 0);
                            JOptionPane.showMessageDialog(null, l.getGuardadocorrecto(), l.getEXITO(), JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            break;
                        case 1:
                            userRecieve.setPass(h.Sha512(this.TextPass.getText()));
                            nu.save(userRecieve, 1);
                            JOptionPane.showMessageDialog(null, l.getActualizadocorrecto(), l.getEXITO(), JOptionPane.INFORMATION_MESSAGE);
                            this.dispose();
                            break;
                    }
                    
                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(FrameUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void textTrabajadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_textTrabajadorItemStateChanged
        setUser();
    }//GEN-LAST:event_textTrabajadorItemStateChanged
    public void loadData() {
        this.textTrabajador.removeAllItems();
        for (Employee em : newEmployee.findAll()) {
            noExist = true;
            newUsers.findAll().forEach(u -> {
                if (em.getIdEmployee() == u.getEmployee().getIdEmployee()) {
                    noExist = false;
                }
            });
            if (noExist) {
                String name = em.getFirstName() + " " + em.getDocIdentity();
                this.textTrabajador.addItem(name);
            }
        }
    }

    public void setUser() {
        Employee e = newEmployee.findEmployeeByDoc(docIdentity());
        String user = e.getFirstName().substring(0, 1) + e.getSurname();
        for (Users users : newUsers.findAll()) {
            if (users.getUserName().equals(user)) {
                user = user + String.valueOf(user.length());
            }
        }
        this.textUser.setText(user);
    }

    public String docIdentity() {
        String text = this.textTrabajador.getSelectedItem().toString();
        String doc = text.substring(text.length() - 16, text.length());
        return doc;
    }

    public Boolean validateNull() {
        boolean valor = false;
        if (this.textUser.getText().equals("")) {
            valor = true;
        } else if (this.TextPass.getText().equals("")) {
            valor = true;
        }
        return valor;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TextPass;
    private javax.swing.JButton button;
    private javax.swing.JCheckBox jCBMostra;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabelContraseña;
    private javax.swing.JLabel jlabeltrabajador;
    private javax.swing.JComboBox<String> textTrabajador;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}

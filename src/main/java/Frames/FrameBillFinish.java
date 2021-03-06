/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controllers.NewBill;
import Controllers.NewClient;
import Controllers.NewReservation;
import Pojo.Bill;
import Pojo.Clients;
import Pojo.Reservation;
import Utils.GlobalVars;
import Utils.Language;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Evander R
 */
public class FrameBillFinish extends javax.swing.JInternalFrame {

    NewClient newClient = new NewClient();
    Reservation r;
    NewBill newBill = new NewBill();
    NewReservation newReserv= new NewReservation();

    /**
     * Creates new form FrameBillFinish
     */
    public FrameBillFinish() {
        initComponents();
        loadData();
    }
    public void setLenguage(){
         try {
            Language l = new Language();
           this.jLabel1.setText(l.getLabelNombre());
           this.jLabel3.setText(l.getLabelresrva());
           this.jLabel5.setText(l.getLabelestadia());
           this.jLabel7.setText(l.getLabelMonto());
           this.jButton1.setText(l.getBotonaceptar());
           this.jButton2.setText(l.getBotonCancelar());
        } catch (IOException ex) {
            Logger.getLogger(PrincipalBackyard.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel1 = new javax.swing.JLabel();
        textNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textReservation = new javax.swing.JLabel();
        textDays = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textAmount = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/cash_icon-icons.com_51090 (1).png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/adim.png"))); // NOI18N
        jLabel1.setText("Nombre:");

        textNombre.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/calendar.png"))); // NOI18N
        jLabel3.setText("Reservación:");

        textReservation.setText("jLabel2");

        textDays.setText("jLabel2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/ic_hotel_128_28520.png"))); // NOI18N
        jLabel5.setText("Estadía:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/business-color_money-coins_icon-icons.com_53446.png"))); // NOI18N
        jLabel7.setText("Monto");

        textAmount.setText("jLabel2");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/ok_accept_15562.png"))); // NOI18N
        jButton1.setText("Facturar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/delete_40623.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(textAmount)
                    .addComponent(textDays)
                    .addComponent(textReservation)
                    .addComponent(textNombre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textDays))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Language l = new Language();
            Bill b = new Bill();
            b.setIdEmployee(GlobalVars.getEmployeeId());
            b.setIdReservation(r.getIdReservation());
            b.setDepartureDate(new Date());
            b.setRode(r.getRode());
            newBill.save(b,0);
            r.setStatus(2);
            newReserv.save(r,1);
            JOptionPane.showMessageDialog(null, "Facturación realizada con éxito",l.getEXITO() , JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(FrameBillFinish.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Language l = new Language();
            GlobalVars.setReservation(new Reservation());
            JOptionPane.showMessageDialog(null, "Facturación no realizada",l.getError() , JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(FrameBillFinish.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void loadData() {
        r = GlobalVars.getReservation();
        Clients c = newClient.findClientByReservation(r);
        this.textNombre.setText(c.getName() + " " + c.getLastName());
        this.textReservation.setText(String.valueOf(r.getIdReservation()));
        this.textAmount.setText(String.valueOf(r.getRode()));
        this.textDays.setText(String.valueOf((int) ((r.getDueDate().getTime() - r.getReservationDate().getTime()) / 86400000)));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textAmount;
    private javax.swing.JLabel textDays;
    private javax.swing.JLabel textNombre;
    private javax.swing.JLabel textReservation;
    // End of variables declaration//GEN-END:variables
}

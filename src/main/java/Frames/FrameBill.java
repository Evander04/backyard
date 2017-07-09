/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controllers.NewBill;
import Controllers.NewClient;
import Controllers.NewDetailReservationClient;
import Controllers.NewReservation;
import Pojo.Bill;
import Pojo.Clients;
import Pojo.Reservation;
import Utils.GlobalVars;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evander R
 */
public class FrameBill extends javax.swing.JInternalFrame {

    NewReservation newReserv = new NewReservation();
    NewClient newClient = new NewClient();
    NewDetailReservationClient detailClient = new NewDetailReservationClient();
    NewBill newBill= new NewBill();
    /**
     * Creates new form FrameBill
     */
    public FrameBill() {
        initComponents();
        loadData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReservation = new javax.swing.JTable();
        buttonAccept = new javax.swing.JButton();

        tableReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Reservacion", "Cliente", "Estadía", "Monto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableReservation);

        buttonAccept.setText("aceptar");
        buttonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(452, Short.MAX_VALUE)
                .addComponent(buttonAccept)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(buttonAccept)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE)))
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

    private void buttonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcceptActionPerformed
        if (this.tableReservation.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "seleccione fila", title, JOptionPane.ERROR);
        } else {
            Reservation r=newReserv.findByNo(Integer.parseInt(String.valueOf(this.tableReservation.getValueAt(this.tableReservation.getSelectedRow(),0))));
            Bill b= new Bill();
            b.setIdEmployee(GlobalVars.getEmployeeId());
            b.setIdReservation(r.getIdReservation());
            b.setDepartureDate(new Date());
            b.setRode(r.getRode());
            newBill.save(b,0);
        }
    }//GEN-LAST:event_buttonAcceptActionPerformed

    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) this.tableReservation.getModel();
        newReserv.findAll().forEach(r -> {
            if (r.getStatus() == 1) {
                Date date = r.getReservationDate();
                Date date1 = r.getDueDate();
                int dias = (int) ((date1.getTime() - date.getTime()) / 86400000);
                Clients c = detailClient.findByReservation(r.getIdReservation());
                model.addRow(new Object[]{r.getIdReservation(), c.getName(),dias,r.getRode()});
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAccept;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableReservation;
    // End of variables declaration//GEN-END:variables
}

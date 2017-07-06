/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controllers.NewClient;
import static Frames.FrameListUser.jTable1;
import static Frames.PrincipalBackyard.desktopPane;
import Pojo.Clients;
import Pojo.Users;
import Utils.Language;
import com.sun.security.ntlm.Client;
import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Steven
 */
public class FrameListCliente extends javax.swing.JInternalFrame {
    NewClient newClient = new NewClient();
    int origin = 0;
    int selection = 0;
    DefaultTableModel model;
    String[] arrayType = new String[]{"Cedula", "Pasaporte"};
    
    /**
     * Creates new form FrameListTrabajador
     */
    public FrameListCliente() {
        initComponents();
        loadData();
        origin = 0;
        setLenguage();
    }
    public void loadData(){
        model= (DefaultTableModel) this.jTable1.getModel();
        newClient.findAll().forEach(e -> {
            model.addRow(new Object[]{e.getName(), e.getLastName(),e.getDocIdentity(),arrayType[Boolean.compare(e.getDocType(), false)],e.getNationality(),e.getPhone(),e.getAddress(),e.getEmail()});
        });
    }
    public void setLenguage(){
         try {
            Language l = new Language();
            FrameListCliente.this.setTitle(l.getFrameListClientTitulo());
            this.jLabel1.setText(l.getLabelTipodeBusqueda()); 
             JTableHeader th = jTable1.getTableHeader();
             TableColumnModel tcm = th.getColumnModel();
             TableColumn tc = tcm.getColumn(0);
             tc.setHeaderValue(l.getColumnNombre());
              TableColumn tc1 = tcm.getColumn(1);
             tc1.setHeaderValue(l.getColumnApellido());
              TableColumn tc2 = tcm.getColumn(2);
             tc2.setHeaderValue(l.getColumnIdentificacion());
             TableColumn tc3 = tcm.getColumn(3);
             tc3.setHeaderValue(l.getColumnTipoIdentifiacion());
              TableColumn tc4 = tcm.getColumn(4);
             tc4.setHeaderValue(l.getColumnNacionalidad());
               TableColumn tc5 = tcm.getColumn(5);
             tc5.setHeaderValue(l.getColumnTelefono());
               TableColumn tc6 = tcm.getColumn(6);
             tc6.setHeaderValue(l.getColumnDireccion());
               TableColumn tc7 = tcm.getColumn(7);
             tc7.setHeaderValue(l.getColumnEmail());
             
        } catch (IOException ex) {
            Logger.getLogger(FrameListCliente.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Tipo de Busqueda:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Identificación", "Tipo de Identificación", "Nacionalidad", "Teléfono", "Dirección", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/delete.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/cancel2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(547, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (origin) {
            case 0:
                FrameCrearCliente fce = new FrameCrearCliente();
                desktopPane.add(fce);
                Dimension desktopSize = desktopPane.getSize();
                Dimension FrameSize = fce.getSize();
                fce.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
                fce.toFront();
                fce.show();
                break;
            case 1:
                Clients c= newClient.findClientByDoc(model.getValueAt(jTable1.getSelectedRow(),2).toString());
                FrameCrearCliente fce1= new FrameCrearCliente(c);
                desktopPane.add(fce1);
                Dimension desktopSize1 = desktopPane.getSize();
                Dimension FrameSize1 = fce1.getSize();
                fce1.setLocation((desktopSize1.width - FrameSize1.width) / 2, (desktopSize1.height - FrameSize1.height) / 2);
                fce1.toFront();
                jTable1.clearSelection();                
                fce1.show();
                break;
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/refresh.png")));
        origin = 1;
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cancel();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            Language l= new Language();
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            if (this.jTable1.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, l.getfilanoafectada(), l.getError(), JOptionPane.ERROR);
            } else {
                Clients c= newClient.findClientByDoc(model.getValueAt(jTable1.getSelectedRow(),2).toString());
                newClient.save(c,2);
                model.removeRow(this.jTable1.getSelectedRow());
                cancel();
                JOptionPane.showConfirmDialog(null, l.getELIMINADO(), l.getEXITO(), JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameListCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton2ActionPerformed

 public void cancel() {
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/add.png")));
        origin = 0;
        jTable1.clearSelection();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

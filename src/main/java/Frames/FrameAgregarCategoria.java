/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import Pojo.Category;
import Controllers.NewCategory;
import Utils.Language;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Steven
 */
public class FrameAgregarCategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameAgregarCategoria
     */
    public FrameAgregarCategoria() {
        initComponents();
        setLanguage();
    }
    public void setLanguage() {
        try {
            Language l = new Language();
         FrameAgregarCategoria.this.setTitle(l.getFrameAgregarCategoria());  
         this.jLTipo.setText(l.getLabelTipo());
         this.jLDescripcion.setText(l.getLabelDescripcion());
         this.jBTGuardar.setText(l.getBotonGuardar());
         this.jBTCancelar.setText(l.getBotonCancelar());
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
        jPanel2 = new javax.swing.JPanel();
        jLTipo = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox<>();
        jLDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextADescripcion = new javax.swing.JTextArea();
        jBTGuardar = new javax.swing.JButton();
        jBTCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Categoria");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_finder_21775.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTipo.setText("Tipo :");

        jCBTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));
        jCBTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoActionPerformed(evt);
            }
        });

        jLDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLDescripcion.setText("Descripción:");

        jTextADescripcion.setColumns(20);
        jTextADescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextADescripcion);

        jBTGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBTGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/save.png"))); // NOI18N
        jBTGuardar.setText("Guardar");
        jBTGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTGuardarActionPerformed(evt);
            }
        });

        jBTCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBTCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/cancel.png"))); // NOI18N
        jBTCancelar.setText("Cancelar");
        jBTCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jBTGuardar)
                        .addGap(32, 32, 32)
                        .addComponent(jBTCancelar)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipo)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTGuardar)
                    .addComponent(jBTCancelar))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void jCBTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTipoActionPerformed

    private void jBTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBTCancelarActionPerformed

    private void jBTGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTGuardarActionPerformed
        // TODO add your handling code here:
        
        if(validateNull()){
            JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS", "ATENCION", JOptionPane.ERROR_MESSAGE);
        }else{
        Category c = new Category();
        NewCategory nc = new NewCategory();
        c.setCategoryType(this.jCBTipo.getSelectedIndex());
        c.setDescription(this.jTextADescripcion.getText());
        c.setErasedStatus(true);
        nc.save(c, 0);
            clean();
            JOptionPane.showMessageDialog(null, "SE GUARDO LA CATEGORIA CORRECTAMENTE","EXITO", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBTGuardarActionPerformed
    public void clean(){
        this.jTextADescripcion.setText("");
        this.jCBTipo.setSelectedIndex(0);
    }
    public boolean validateNull(){
        boolean val = false;
        if(this.jTextADescripcion.getText().equals(""))
            val = true;
           
        return val;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTCancelar;
    private javax.swing.JButton jBTGuardar;
    private javax.swing.JComboBox<String> jCBTipo;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextADescripcion;
    // End of variables declaration//GEN-END:variables
}

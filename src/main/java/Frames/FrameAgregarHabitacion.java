/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import Controllers.NewCategory;
import Controllers.NewRoom;
import static Frames.PrincipalBackyard.desktopPane;
import Pojo.Category;
import Pojo.Room;
import Utils.Language;
import java.awt.Dimension;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javassist.CtMethod.ConstParameter.string;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Steven
 */
public class FrameAgregarHabitacion extends javax.swing.JInternalFrame {
    
    Map<String,String> mapCategory= new HashMap<>();
    Map<String,String> mapCategoryInverter= new HashMap<>();
    NewRoom newroom = new NewRoom();
    Room  roomrecieve = new Room();
    boolean noExist = true;
    int origin = 0;
    /**
    ne * Creates new form FrameAgregarHabitacion
     */
    public FrameAgregarHabitacion() {
        initComponents();
        setLanguage();
        mapa();
        mapInverter();
        NewCategory nc= new NewCategory();
        for (Category c : nc.findAll()) {
             this.jCBCategoria.addItem(mapCategory.get(String.valueOf(c.getCategoryType())));
        }
       origin = 0; 
    }
    public FrameAgregarHabitacion(Room r) {
        try {
            this.roomrecieve = r;
            Language l = new Language();
            origin=1;
            initComponents();
            setLanguage();
            loadData();
            this.jBTGuardar.setText(l.getBotonActualizar());
            this.jBTGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/refresh.png")));
        } catch (IOException ex) {
            Logger.getLogger(FrameAgregarHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void loadData() {
        this.jFTFCapacidad.setText(roomrecieve.getCapacity().toString());
        this.jFTFPrecio.setText(roomrecieve.getPrice().toString());
        this.jTextADescripcion.setText(roomrecieve.getDescription());
        this.jCBTipo.setSelectedItem(roomrecieve.getTypeRoom());
        this.jCBCategoria.setSelectedItem(roomrecieve.getCategory());
        
    }
    public void setLanguage() {
        try {
            Language l = new Language();
            FrameAgregarHabitacion.this.setTitle(l.getFrameAgregarHabitacionTitulo());
            this.label.setText(l.getLabelNombre());
            this.jLCapacidad.setText(l.getLabelCapacidad());
            this.jLPrecio.setText(l.getLabelPrecio());
            this.jLDescripcion.setText(l.getLabelDescripcion());
            this.jLTipo.setText(l.getLabelTipo());
            this.jLCategoria.setText(l.getLabelCategoria());
            this.jBTGuardar.setText(l.getBotonGuardar());
            this.jBTCancelar.setText(l.getBotonCancelar());
        } catch (IOException ex) {
            Logger.getLogger(PrincipalBackyard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void mapa(){
    mapCategory.put("0","A");
    mapCategory.put("1","B");
    mapCategory.put("2","C");
    mapCategory.put("3","D");
    mapCategory.put("4","E");
    mapCategory.put("5","F");
    }
    public void mapInverter(){
    mapCategoryInverter.put("A","0");
    mapCategoryInverter.put("B","1");
    mapCategoryInverter.put("C","2");
    mapCategoryInverter.put("D","3");
    mapCategoryInverter.put("E","4");
    mapCategoryInverter.put("F","5");
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
        jLCapacidad = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        jLDescripcion = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextADescripcion = new javax.swing.JTextArea();
        jBTGuardar = new javax.swing.JButton();
        jBTCancelar = new javax.swing.JButton();
        jCBTipo = new javax.swing.JComboBox<>();
        jFTFCapacidad = new javax.swing.JFormattedTextField();
        jFTFPrecio = new javax.swing.JFormattedTextField();
        jLCategoria = new javax.swing.JLabel();
        jCBCategoria = new javax.swing.JComboBox<>();
        label = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Crear Habitacion");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/ic_hotel_128_28520.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLCapacidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLCapacidad.setText("Capacidad:");
        jLCapacidad.setPreferredSize(new java.awt.Dimension(100, 17));

        jLPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLPrecio.setText("Precio:");
        jLPrecio.setPreferredSize(new java.awt.Dimension(100, 17));

        jLDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLDescripcion.setText("Descripció:");
        jLDescripcion.setPreferredSize(new java.awt.Dimension(100, 17));

        jLTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLTipo.setText("Tipo:");
        jLTipo.setPreferredSize(new java.awt.Dimension(100, 17));

        jTextADescripcion.setColumns(20);
        jTextADescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextADescripcion);

        jBTGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jBTGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBTGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/save.png"))); // NOI18N
        jBTGuardar.setText("Guardar");
        jBTGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTGuardarActionPerformed(evt);
            }
        });

        jBTCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBTCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBTCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/cancel.png"))); // NOI18N
        jBTCancelar.setText("Cancelar");
        jBTCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCancelarActionPerformed(evt);
            }
        });

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Publica", "Privada" }));

        jFTFCapacidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));

        jFTFPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#######"))));

        jLCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLCategoria.setText("Categoria:");
        jLCategoria.setPreferredSize(new java.awt.Dimension(100, 17));

        jCBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCategoriaActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label.setText("Nombre:");
        label.setPreferredSize(new java.awt.Dimension(100, 17));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCapacidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textNombre)
                                .addComponent(jFTFCapacidad)
                                .addComponent(jCBTipo, 0, 141, Short.MAX_VALUE)
                                .addComponent(jFTFPrecio)
                                .addComponent(jCBCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jBTGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBTCancelar)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jFTFCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFTFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTGuardar)
                    .addComponent(jBTCancelar))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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

    private void jBTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCancelarActionPerformed
        FrameListHabitacion flh = new FrameListHabitacion();
        desktopPane.add(flh);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = flh.getSize();
        flh.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        flh.show();
        this.dispose();
    }//GEN-LAST:event_jBTCancelarActionPerformed

    private void jBTGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTGuardarActionPerformed
        try {
            Language l = new Language();
            if (validaNull()){
                JOptionPane.showMessageDialog(null, l.getCamposVaciosOMalos(),l.getAlerta(), JOptionPane.ERROR_MESSAGE);
            }else{
                NewRoom nr = new NewRoom();
                NewCategory nc= new NewCategory();
                Room ro = new Room();
                 Category c =nc.findByCategoryType(Integer.parseInt(mapCategoryInverter.get(this.jCBCategoria.getSelectedItem().toString())));
                switch (origin){
                    case 0:        
                ro.setName(this.textNombre.getText());
                ro.setCategory(c);
                ro.setCapacity(Integer.parseInt(this.jFTFCapacidad.getText()));
                ro.setPrice(Long.parseLong(this.jFTFPrecio.getText()));
                ro.setStatusRoom(0);
                ro.setDescription(this.jTextADescripcion.getText());
                ro.setTypeRoom(this.jCBTipo.getSelectedIndex()==0?false:true);
                ro.setErasedStatus(true);
                nr.save(ro, 0);
                JOptionPane.showMessageDialog(null, l.getGuardadocorrecto(), l.getEXITO(), JOptionPane.INFORMATION_MESSAGE);
                clearfield();
                this.dispose();
                break;
                
                    case 1:
                      roomrecieve.setCategory(c);
                      roomrecieve.setCapacity(Integer.parseInt(this.jFTFCapacidad.getText()));
                      roomrecieve.setPrice(Long.parseLong(this.jFTFPrecio.getText()));
                      roomrecieve.setStatusRoom(0);
                      roomrecieve.setDescription(this.jTextADescripcion.getText());
                      roomrecieve.setTypeRoom(this.jCBTipo.getSelectedIndex()==0?false:true);
                      roomrecieve.setErasedStatus(true);
                      nr.save(roomrecieve, 1);
                      JOptionPane.showMessageDialog(null, l.getGuardadocorrecto(), l.getEXITO(), JOptionPane.INFORMATION_MESSAGE);
                      this.dispose();
                      break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameAgregarHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBTGuardarActionPerformed

    private void jCBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCategoriaActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_jCBCategoriaActionPerformed

private void clearfield(){
    jFTFCapacidad.setText("");
    jFTFPrecio.setText("");
    jTextADescripcion.setText("");
    textNombre.setText("");
}

public boolean validaNull(){
    boolean val = false;
    if(this.jFTFCapacidad.getText().equals("")){
    val = true;
    } else if (this.jFTFPrecio.getText().equals("")){
    val = true;
    } else if (this.jTextADescripcion.getText().equals("")){
        val = true;
    }
    return val;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTCancelar;
    private javax.swing.JButton jBTGuardar;
    private javax.swing.JComboBox<String> jCBCategoria;
    private javax.swing.JComboBox<String> jCBTipo;
    private javax.swing.JFormattedTextField jFTFCapacidad;
    private javax.swing.JFormattedTextField jFTFPrecio;
    private javax.swing.JLabel jLCapacidad;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLDescripcion;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextADescripcion;
    private javax.swing.JLabel label;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
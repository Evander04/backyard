/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controllers.NewClient;
import static Frames.PrincipalBackyard.desktopPane;
import Pojo.Clients;
import Utils.Language;
import java.awt.Dimension;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Obed
 */
public class FrameCrearCliente extends javax.swing.JInternalFrame {

    Clients clientRecieve = new Clients();
    NewClient newClient = new NewClient();
    boolean noExist = true;
    int origin = 0;

    /**
     * Creates new form FrameCrearCliente
     */
    public FrameCrearCliente() {
        initComponents();
        setLanguage();
        origin=0;
    }

    public FrameCrearCliente(Clients c) {
        try {
            this.clientRecieve = c;
            Language l = new Language();
            origin=1;
            initComponents();
            setLanguage();
            loadData();
            this.jbtnguardar.setText(l.getBotonActualizar());
            this.jbtnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/refresh.png")));
        } catch (IOException ex) {
            Logger.getLogger(FrameCrearCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setLanguage() {
        try {
            Language l = new Language();
            FrameCrearCliente.this.setTitle(l.getFrameCrearClienteTitulo());
            this.jLabelNombre.setText(l.getLabelNombre());
            this.jLabelApellido.setText(l.getLabelApellido());
            this.jLabelIdentificacion.setText(l.getLabelIdentificacion());
            this.jLabelTipoIdentificacion.setText(l.getLabelTipoIdentificaion());
            this.jLabelNacionalidad.setText(l.getLabelNacionalidad());
            this.jLabelTelefono.setText(l.getLabelTelefono());
            this.jLabelCorreo.setText(l.getLabelCorreo());
            this.jLabelDireccion.setText(l.getLabelDireccion());
            this.jbtnguardar.setText(l.getBotonGuardar());
            this.jbtnCancelar.setText(l.getBotonCancelar());
        } catch (IOException ex) {
            Logger.getLogger(FrameCrearCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadData() {
        this.jTextNombreCliente.setText(clientRecieve.getName());
        this.jTextApellidoCliente.setText(clientRecieve.getLastName());
        this.jTextIdentificacionCliente.setText(clientRecieve.getDocIdentity());
        this.jcbNacionalidadCliente.setSelectedItem(clientRecieve.getNationality());
        this.jFTFTelefono.setText(clientRecieve.getPhone());
        this.textEmail.setText(clientRecieve.getEmail());
        this.textDireccion.setText(clientRecieve.getAddress());
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
        jLabelNombre = new javax.swing.JLabel();
        jTextNombreCliente = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextApellidoCliente = new javax.swing.JTextField();
        jLabelIdentificacion = new javax.swing.JLabel();
        jLabelTipoIdentificacion = new javax.swing.JLabel();
        jcbIdentificacionCliente = new javax.swing.JComboBox<>();
        jLabelNacionalidad = new javax.swing.JLabel();
        jcbNacionalidadCliente = new javax.swing.JComboBox<>();
        jLabelTelefono = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jbtnguardar = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jLabelDireccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDireccion = new javax.swing.JTextArea();
        jTextIdentificacionCliente = new javax.swing.JFormattedTextField();
        jFTFTelefono = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("CLIENTE");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/hotel_finder_21775.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNombre.setFont(new java.awt.Font("Meiryo UI", 3, 14)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setFont(new java.awt.Font("Meiryo UI", 3, 14)); // NOI18N
        jLabelApellido.setText("Apellido:");

        jTextApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoClienteActionPerformed(evt);
            }
        });

        jLabelIdentificacion.setFont(new java.awt.Font("Meiryo UI", 3, 14)); // NOI18N
        jLabelIdentificacion.setText("Identificación:");

        jLabelTipoIdentificacion.setFont(new java.awt.Font("Meiryo UI", 3, 14)); // NOI18N
        jLabelTipoIdentificacion.setText("Tipo de Identificación:");

        jcbIdentificacionCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Pasaporte" }));

        jLabelNacionalidad.setFont(new java.awt.Font("Meiryo UI", 3, 14)); // NOI18N
        jLabelNacionalidad.setText("Nacionalidad:");

        jcbNacionalidadCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Akrotiri", "Albania", "Alemania", "Andorra", "Angola", "Anguila", "Antártida", "Antigua y Barbuda", "Antillas Neerlandesas", "Arabia Saudí", "Arctic Ocean", "Argelia", "Argentina", "Armenia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bahráin", "Bangladesh", "Barbados", "Bélgica", "Belice", "Benín", "Bermudas", "Bielorrusia", "Birmania; Myanmar", "Bolivia", "Bosnia y Hercegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Chad", "Chile", "China", "Chipre", "Clipperton Island", "Colombia", "Comoras", "Congo", "Coral Sea Islands", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dhekelia", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "El Vaticano", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Gaza Strip", "Georgia", "Ghana", "Gibraltar", "Granada", "Grecia", "Groenlandia", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea Ecuatorial", "Guinea-Bissau", "Guyana", "Haití", "Honduras", "Hong Kong", "Hungría", "India", "Indian Ocean", "Indonesia", "Irán", "Iraq", "Irlanda", "Isla Bouvet", "Isla Christmas", "Isla Norfolk", "Islandia", "Islas Caimán", "Islas Cocos", "Islas Cook", "Islas Feroe", "Islas Georgia del Sur y Sandwich del Sur", "Islas Heard y McDonald", "Islas Malvinas", "Islas Marianas del Norte", "Islas Marshall", "Islas Pitcairn", "Islas Salomón", "Islas Turcas y Caicos", "Islas Vírgenes Americanas", "Islas Vírgenes Británicas", "Israel", "Italia", "Jamaica", "Jan Mayen", "Japón", "Jersey", "Jordania", "Kazajistán", "Kenia", "Kirguizistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macao", "Macedonia", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Man, Isle of", "Marruecos", "Mauricio", "Mauritania", "Mayotte", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Montserrat", "Mozambique", "Mundo", "Namibia", "Nauru", "Navassa Island", "Nepal", "Nicaragua", "Níger", "Nigeria", "Niue", "Noruega", "Nueva Caledonia", "Nueva Zelanda", "Omán", "Pacific Ocean", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa-Nueva Guinea", "Paracel Islands", "Paraguay", "Perú", "Polinesia Francesa", "Polonia", "Portugal", "Puerto Rico", "Qatar", "Reino Unido", "República Centroafricana", "República Checa", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumania", "Rusia", "Sáhara Occidental", "Samoa", "Samoa Americana", "San Cristóbal y Nieves", "San Marino", "San Pedro y Miquelón", "San Vicente y las Granadinas", "Santa Helena", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Southern Ocean", "Spratly Islands", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Suecia", "Suiza", "Surinam", "Svalbard y Jan Mayen", "Tailandia", "Taiwán", "Tanzania", "Tayikistán", "Territorio Británico del Océano Indico", "Territorios Australes Franceses", "Timor Oriental", "Togo", "Tokelau", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Unión Europea", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Wake Island", "Wallis y Futuna", "West Bank", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));

        jLabelTelefono.setFont(new java.awt.Font("Meiryo UI", 3, 14)); // NOI18N
        jLabelTelefono.setText("Teléfono:");

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        jLabelCorreo.setFont(new java.awt.Font("Meiryo UI", 3, 14)); // NOI18N
        jLabelCorreo.setText("Correo:");

        jbtnguardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/Add_User-80_icon-icons.com_57380.png"))); // NOI18N
        jbtnguardar.setText("Guardar");
        jbtnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnguardarActionPerformed(evt);
            }
        });

        jbtnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/cancel.png"))); // NOI18N
        jbtnCancelar.setText("Cancelar");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jLabelDireccion.setFont(new java.awt.Font("Meiryo UI", 3, 14)); // NOI18N
        jLabelDireccion.setText("Dirección:");

        textDireccion.setColumns(20);
        textDireccion.setRows(5);
        jScrollPane1.setViewportView(textDireccion);

        try {
            jTextIdentificacionCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFTFTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTipoIdentificacion)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelIdentificacion)
                    .addComponent(jLabelCorreo)
                    .addComponent(jLabelTelefono)
                    .addComponent(jLabelNacionalidad)
                    .addComponent(jLabelApellido)
                    .addComponent(jLabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbNacionalidadCliente, javax.swing.GroupLayout.Alignment.TRAILING, 0, 1, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(textEmail)
                    .addComponent(jcbIdentificacionCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextIdentificacionCliente)
                    .addComponent(jTextApellidoCliente)
                    .addComponent(jTextNombreCliente)
                    .addComponent(jFTFTelefono))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jbtnguardar)
                .addGap(51, 51, 51)
                .addComponent(jbtnCancelar)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificacion)
                    .addComponent(jTextIdentificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbIdentificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoIdentificacion))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNacionalidad)
                    .addComponent(jcbNacionalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(jFTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorreo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelDireccion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnguardar)
                    .addComponent(jbtnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnguardarActionPerformed
        try {
            Language l = new Language();
            if (validateNull()) {
                JOptionPane.showMessageDialog(null, l.getCamposVaciosOMalos(), l.getAlerta(), JOptionPane.ERROR_MESSAGE);
            } else {
                NewClient nc = new NewClient();
                switch (origin) {
                    case 0:
                        Clients ce = new Clients();
                        ce.setName(this.jTextNombreCliente.getText());
                        ce.setLastName(this.jTextApellidoCliente.getText());
                        ce.setDocIdentity(this.jTextIdentificacionCliente.getText());
                        ce.setDocType(this.jcbIdentificacionCliente.getSelectedIndex() == 0 ? false : true);
                        ce.setNationality(this.jcbNacionalidadCliente.getSelectedItem().toString());
                        ce.setPhone(this.jFTFTelefono.getText());
                        ce.setEmail(this.textEmail.getText());
                        ce.setAddress(this.textDireccion.getText());
                        ce.setErasedStatus(true);
                        nc.save(ce, 0);
                        JOptionPane.showMessageDialog(null, "Cliente se guardó correctamente", l.getEXITO(), JOptionPane.INFORMATION_MESSAGE);
                        clean();
                        this.dispose();
                        break;
                    case 1:
                        clientRecieve.setName(this.jTextNombreCliente.getText());
                        clientRecieve.setLastName(this.jTextApellidoCliente.getText());
                        clientRecieve.setDocIdentity(this.jTextIdentificacionCliente.getText());
                        clientRecieve.setDocType(this.jcbIdentificacionCliente.getSelectedIndex() == 0 ? false : true);
                        clientRecieve.setNationality(this.jcbNacionalidadCliente.getSelectedItem().toString());
                        clientRecieve.setPhone(this.jFTFTelefono.getText());
                        clientRecieve.setEmail(this.textEmail.getText());
                        clientRecieve.setAddress(this.textDireccion.getText());
                        clientRecieve.setErasedStatus(true);
                        nc.save(clientRecieve, 1);
                        JOptionPane.showMessageDialog(null, "actualizado correctamente", l.getEXITO(), JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameCrearCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtnguardarActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void jTextApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextApellidoClienteActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:        
        FrameListCliente fcc = new FrameListCliente();
        desktopPane.add(fcc);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fcc.getSize();
        fcc.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fcc.show();
        this.dispose();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    public boolean validateNull() {
        boolean val = false;
        if (this.jTextNombreCliente.getText().equals("")) {
            val = true;
        } else if (this.jTextApellidoCliente.getText().equals("")) {
            val = true;
        } else if (this.jTextIdentificacionCliente.getText().equals("")) {
            val = true;
        } else if (this.textEmail.getText().equals("")) {
            val = true;
        } else if (this.jFTFTelefono.getText().equals("")) {
            val = true;
        } else if (this.jFTFTelefono.getText().length() < 8) {
            val = true;
        } else if (this.jTextIdentificacionCliente.getText().length() <= 15) {
            val = true;
        }

        return val;
    }

    public void clean() {
        this.jTextNombreCliente.setText("");
        this.jTextApellidoCliente.setText("");
        this.jTextIdentificacionCliente.setText("");
        this.jFTFTelefono.setText("");
        this.textEmail.setText("");
        this.textDireccion.setText("");
        this.jcbIdentificacionCliente.setSelectedIndex(0);
        this.jcbNacionalidadCliente.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFTFTelefono;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelIdentificacion;
    private javax.swing.JLabel jLabelNacionalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoIdentificacion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextApellidoCliente;
    private javax.swing.JFormattedTextField jTextIdentificacionCliente;
    private javax.swing.JTextField jTextNombreCliente;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnguardar;
    private javax.swing.JComboBox<String> jcbIdentificacionCliente;
    private javax.swing.JComboBox<String> jcbNacionalidadCliente;
    private javax.swing.JTextArea textDireccion;
    private javax.swing.JTextField textEmail;
    // End of variables declaration//GEN-END:variables
}

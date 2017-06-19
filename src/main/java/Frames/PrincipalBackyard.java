/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Pojo.Config;
import Pojo.Employee;
import Utils.ConfigFile;
import Utils.Language;
import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author Obed
 */
public class PrincipalBackyard extends javax.swing.JFrame {

    FrameLogin l = new FrameLogin();
    Employee employee;

    /**
     * Creates new form NewMDIApplication
     */
    public PrincipalBackyard(Employee e) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        this.employee = e;
    }

    public PrincipalBackyard() {
        initComponents();
        setLanguage();
        this.NuevaCategoriaMenuItem.setVisible(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);

    }

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    
    public void setLanguage() {
        try {
            Language l = new Language();
            PrincipalBackyard.this.setTitle(l.getPrincipalTitulo());//Titulo del principal
            //Menu Nuevo
            this.fileMenu.setText(l.getNuevo());
            this.NuevoEmpleadoMenuItem.setText(l.getNuevoEmpleado());
            this.NuevoClienteMenuItem.setText(l.getNuevoCliente());
            this.NuevaHabitacionMenuItem.setText(l.getNuevaHabitacion());
            this.NuevoExtraMenuItem.setText(l.getNuevaExtra());
            this.NuevaCategoriaMenuItem.setText(l.getNuevaCategoria());
            this.SalirMenuItem.setText(l.getSalida());
            //Menu Opeciones
            this.editMenu.setText(l.getOperaciones());
            this.NuevaReservaMenuItem.setText(l.getNuevaReserva());
            this.GenerarReportesMenuItem.setText(l.getNuevaFactura());
            //Menu Central Estadistica
            this.jCentralEstadistica.setText(l.getCentralEstadistica());
            //Menu Reportes
            this.jReport.setText(l.getReporte());
            //Menu Configuraciones
            this.jConfiguraciones.setText(l.getConfiguracion());
            this.jCanbiarIdioma.setText(l.getCambiarIdioma());
            this.jUsuario.setText(l.getCambioUsuario());
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        NuevoEmpleadoMenuItem = new javax.swing.JMenuItem();
        NuevoClienteMenuItem = new javax.swing.JMenuItem();
        NuevaHabitacionMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        NuevoExtraMenuItem = new javax.swing.JMenuItem();
        NuevaCategoriaMenuItem = new javax.swing.JMenuItem();
        SalirMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        NuevaReservaMenuItem = new javax.swing.JMenuItem();
        GenerarReportesMenuItem = new javax.swing.JMenuItem();
        jCentralEstadistica = new javax.swing.JMenu();
        jReport = new javax.swing.JMenu();
        jConfiguraciones = new javax.swing.JMenu();
        jCanbiarIdioma = new javax.swing.JMenuItem();
        jUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");
        setExtendedState(6);
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 700));

        desktopPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        menuBar.setBackground(new java.awt.Color(255, 255, 255));

        fileMenu.setBackground(new java.awt.Color(255, 255, 255));
        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/new-file_40454.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Nuevo");
        fileMenu.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        fileMenu.setMinimumSize(new java.awt.Dimension(90, 24));

        NuevoEmpleadoMenuItem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        NuevoEmpleadoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/new_add_user_info_16706.png"))); // NOI18N
        NuevoEmpleadoMenuItem.setMnemonic('s');
        NuevoEmpleadoMenuItem.setText("Nuevo Empleado");
        NuevoEmpleadoMenuItem.setToolTipText("");
        NuevoEmpleadoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoEmpleadoMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(NuevoEmpleadoMenuItem);

        NuevoClienteMenuItem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        NuevoClienteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/Add_User-80_icon-icons.com_57380.png"))); // NOI18N
        NuevoClienteMenuItem.setMnemonic('a');
        NuevoClienteMenuItem.setText("Nuevo Cliente");
        NuevoClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoClienteMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(NuevoClienteMenuItem);

        NuevaHabitacionMenuItem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        NuevaHabitacionMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/ic_hotel_128_28520.png"))); // NOI18N
        NuevaHabitacionMenuItem.setText("Nueva Habitación");
        NuevaHabitacionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaHabitacionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(NuevaHabitacionMenuItem);
        fileMenu.add(jSeparator1);

        NuevoExtraMenuItem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        NuevoExtraMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        NuevoExtraMenuItem.setText("Nuevo Extra");
        NuevoExtraMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoExtraMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(NuevoExtraMenuItem);

        NuevaCategoriaMenuItem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        NuevaCategoriaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        NuevaCategoriaMenuItem.setText("Nueva Categoria");
        NuevaCategoriaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaCategoriaMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(NuevaCategoriaMenuItem);

        SalirMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        SalirMenuItem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        SalirMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/exit-symbol-1_icon-icons.com_70162.png"))); // NOI18N
        SalirMenuItem.setMnemonic('x');
        SalirMenuItem.setText("Salir");
        SalirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(SalirMenuItem);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/business_ordering_pencil_table_2333.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Operaciones");
        editMenu.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N

        NuevaReservaMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        NuevaReservaMenuItem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        NuevaReservaMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/backup_39379.png"))); // NOI18N
        NuevaReservaMenuItem.setMnemonic('o');
        NuevaReservaMenuItem.setText("Reservar");
        NuevaReservaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaReservaMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(NuevaReservaMenuItem);

        GenerarReportesMenuItem.setBackground(new java.awt.Color(255, 255, 255));
        GenerarReportesMenuItem.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        GenerarReportesMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/invoice_78456.png"))); // NOI18N
        GenerarReportesMenuItem.setMnemonic('y');
        GenerarReportesMenuItem.setText("Facturar");
        editMenu.add(GenerarReportesMenuItem);

        menuBar.add(editMenu);

        jCentralEstadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/graph-5_icon-icons.com_58023.png"))); // NOI18N
        jCentralEstadistica.setText("Central Estadística");
        jCentralEstadistica.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        menuBar.add(jCentralEstadistica);

        jReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/trade_report_reports_documents_2351.png"))); // NOI18N
        jReport.setText("Reportes");
        jReport.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        menuBar.add(jReport);

        jConfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/settingtool1_80793.png"))); // NOI18N
        jConfiguraciones.setText("Configuraciones");
        jConfiguraciones.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N

        jCanbiarIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/1492616968-18-google-translate-text-language-translation_83413.png"))); // NOI18N
        jCanbiarIdioma.setText("Idioma");
        jCanbiarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCanbiarIdiomaActionPerformed(evt);
            }
        });
        jConfiguraciones.add(jCanbiarIdioma);

        jUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/User_Group-80_icon-icons.com_57247.png"))); // NOI18N
        jUsuario.setText("Usuario");
        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        jConfiguraciones.add(jUsuario);

        menuBar.add(jConfiguraciones);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirMenuItemActionPerformed

    private void NuevaReservaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaReservaMenuItemActionPerformed
        // TODO add your handling code here:
        FrameCrearReserva fcr = new FrameCrearReserva();
        desktopPane.add(fcr);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fcr.getSize();
        fcr.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fcr.show();

    }//GEN-LAST:event_NuevaReservaMenuItemActionPerformed

    private void NuevoClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClienteMenuItemActionPerformed
        // TODO add your handling code here:

        FrameListCliente fcc = new FrameListCliente();
        desktopPane.add(fcc);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fcc.getSize();
        fcc.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fcc.show();
    }//GEN-LAST:event_NuevoClienteMenuItemActionPerformed

    private void NuevoEmpleadoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoEmpleadoMenuItemActionPerformed
        // TODO add your handling code here:
        //FrameCrearEmpleado fce = new FrameCrearEmpleado();
        FrameListEmployee fce = new FrameListEmployee();
        desktopPane.add(fce);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fce.getSize();
        fce.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fce.show();
    }//GEN-LAST:event_NuevoEmpleadoMenuItemActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        FrameListUser fce = new FrameListUser();
        desktopPane.add(fce);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fce.getSize();
        fce.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fce.show();
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void NuevaHabitacionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaHabitacionMenuItemActionPerformed
        // TODO add your handling code here:
        FrameAgregarHabitacion fah = new FrameAgregarHabitacion();
        desktopPane.add(fah);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fah.getSize();
        fah.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fah.show();
    }//GEN-LAST:event_NuevaHabitacionMenuItemActionPerformed

    private void NuevoExtraMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoExtraMenuItemActionPerformed
        // TODO add your handling code here:
        FrameAgregarExtra fae = new FrameAgregarExtra();
        desktopPane.add(fae);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fae.getSize();
        fae.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fae.show();
    }//GEN-LAST:event_NuevoExtraMenuItemActionPerformed

    private void NuevaCategoriaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaCategoriaMenuItemActionPerformed
        // TODO add your handling code here:
        FrameAgregarCategoria fac = new FrameAgregarCategoria();
        desktopPane.add(fac);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fac.getSize();
        fac.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fac.show();
    }//GEN-LAST:event_NuevaCategoriaMenuItemActionPerformed

    private void jCanbiarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCanbiarIdiomaActionPerformed
        ConfigFile cf = new ConfigFile();
        try {
            if (cf.findByID(1).getLanguage()==0) {
                 cf.update(new Config(1, 1));
            }
            else{
                 cf.update(new Config(1, 0));
            }
            setLanguage();
        } catch (IOException ex) {
            Logger.getLogger(PrincipalBackyard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCanbiarIdiomaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalBackyard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalBackyard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalBackyard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalBackyard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalBackyard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GenerarReportesMenuItem;
    private javax.swing.JMenuItem NuevaCategoriaMenuItem;
    private javax.swing.JMenuItem NuevaHabitacionMenuItem;
    private javax.swing.JMenuItem NuevaReservaMenuItem;
    private javax.swing.JMenuItem NuevoClienteMenuItem;
    private javax.swing.JMenuItem NuevoEmpleadoMenuItem;
    private javax.swing.JMenuItem NuevoExtraMenuItem;
    private javax.swing.JMenuItem SalirMenuItem;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem jCanbiarIdioma;
    private javax.swing.JMenu jCentralEstadistica;
    private javax.swing.JMenu jConfiguraciones;
    private javax.swing.JMenu jReport;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jUsuario;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}

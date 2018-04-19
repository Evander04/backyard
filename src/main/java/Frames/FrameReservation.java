/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Controllers.NewCategory;
import Controllers.NewClient;
import Controllers.NewDetailReservationClient;
import Controllers.NewDetailReservationRoom;
import Controllers.NewReservation;
import Controllers.NewRoom;
import static Frames.FrameListUser.jTable1;
import static Frames.PrincipalBackyard.desktopPane;
import Pojo.Category;
import Pojo.Clients;
import Pojo.Detailreservationclient;
import Pojo.Detailreservationroom;
import Pojo.Reservation;
import Pojo.Room;
import Utils.GlobalVars;
import Utils.Language;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Convert;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.jdesktop.swingx.calendar.DateSelectionModel;

/**
 *
 * @author Evander R
 */
public class FrameReservation extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameReservation
     */
    NewClient newClient = new NewClient();
    NewCategory newCat = new NewCategory();
    NewRoom newRoom = new NewRoom();
    NewReservation newReserv = new NewReservation();
    NewDetailReservationClient newDetailC = new NewDetailReservationClient();
    NewDetailReservationRoom newDetailR = new NewDetailReservationRoom();
    Map<String, String> mapCategory = new HashMap<>();
    Map<String, String> mapStatus = new HashMap<>();
    boolean noExist = true;

    public FrameReservation(int origin) {
        initComponents();
        loadClients();
        setLenguage();
        if (origin == 1) {
            if (GlobalVars.clients.size() > 0 || GlobalVars.rooms.size() > 0) {
                JOptionPane.showMessageDialog(null, "Usted tiene una reservación pendiente", "INFO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void mapa() {
        try {
            Language l = new Language();
            mapCategory.put("0", "A");
            mapCategory.put("1", "B");
            mapCategory.put("2", "C");
            mapCategory.put("3", "D");
            mapCategory.put("4", "E");
            mapCategory.put("5", "F");
            mapStatus.put("0", l.getEstadoDisponible());
            mapStatus.put("1", l.getEstadoOcupado());
            mapStatus.put("2", l.getEstadoReservada());
            this.jComboBox1.setSelectedIndex(0);
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setLenguage() {
        try {
            Language l = new Language();
            FrameReservation.this.setTitle(l.getFrameCrearReservaTitulo());
            //TadPane #1
            this.jLabel4.setText(l.getlabeLAgregarCliente());
            this.jXLabelFechaentrada.setText(l.getlabeLFechaEntrada());
            this.jXLabelfechasalida.setText(l.getlabeLFechaSalida());
            this.jTabbedPane1.setTitleAt(0, l.getTabPaneClientes());
            this.jTabbedPane1.setTitleAt(1, l.getTabPaneHabitaciones());
            this.jTabbedPane1.setTitleAt(2, l.getTabPaneConfirmacion());
            JTableHeader th = jTable1.getTableHeader();
            TableColumnModel tcm = th.getColumnModel();
            TableColumn tc = tcm.getColumn(0);
            tc.setHeaderValue(l.getColumnNombre());
            TableColumn tc1 = tcm.getColumn(1);
            tc1.setHeaderValue(l.getColumnIdentificacion());
            TableColumn tc2 = tcm.getColumn(2);
            tc2.setHeaderValue(l.getColumnTipo());
            //TadPane #2tablet #1
            JTableHeader th1 = jTable2.getTableHeader();
            TableColumnModel tcm1 = th1.getColumnModel();
            TableColumn tcc = tcm1.getColumn(0);
            tcc.setHeaderValue(l.getColumnNombre());
            TableColumn tcc1 = tcm1.getColumn(1);
            tcc1.setHeaderValue(l.getColumnCategoria());
            TableColumn tcc2 = tcm1.getColumn(2);
            tcc2.setHeaderValue(l.getColumnCapacidad());
            TableColumn tcc3 = tcm1.getColumn(3);
            tcc3.setHeaderValue(l.getColumnPrecio());
            TableColumn tcc4 = tcm1.getColumn(4);
            tcc4.setHeaderValue(l.getColumnTipo());
            TableColumn tcc5 = tcm1.getColumn(5);
            tcc5.setHeaderValue(l.getColumnEstadoCuarto());
            //TadPane #2 tablet #2
            JTableHeader th2 = jTable3.getTableHeader();
            TableColumnModel tcm2 = th2.getColumnModel();
            TableColumn tcx = tcm2.getColumn(0);
            tcx.setHeaderValue(l.getColumnNombre());
            TableColumn tcx1 = tcm2.getColumn(1);
            tcx1.setHeaderValue(l.getColumnCategoria());
            TableColumn tcx2 = tcm2.getColumn(2);
            tcx2.setHeaderValue(l.getColumnCapacidad());
            TableColumn tcx3 = tcm2.getColumn(3);
            tcx3.setHeaderValue(l.getColumnPrecio());
            TableColumn tcx4 = tcm2.getColumn(4);
            tcx4.setHeaderValue(l.getColumnTipo());
            TableColumn tcx5 = tcm2.getColumn(5);
            tcx5.setHeaderValue(l.getColumnEstadoCuarto());
            //TadPane #3
            this.jLabel3.setText(l.getFrameCrearReservaTitulo());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXLabelFechaentrada = new org.jdesktop.swingx.JXLabel();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jXLabelfechasalida = new org.jdesktop.swingx.JXLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textCountClient = new javax.swing.JLabel();
        textCount = new javax.swing.JLabel();
        textCountRoom = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textReservation = new javax.swing.JLabel();
        textCountRoom1 = new javax.swing.JLabel();
        textMoney = new javax.swing.JLabel();
        textCount1 = new javax.swing.JLabel();
        textCountDays = new javax.swing.JLabel();
        calendar = new org.jdesktop.swingx.JXMonthView();
        jPanel6 = new javax.swing.JPanel();
        buttonAccept = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setForeground(java.awt.Color.white);
        setResizable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/trade_report_reports_documents_2351.png"))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Identificación", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/cancel2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/refresh.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("Agregar Clientes");

        jXLabelFechaentrada.setText("Fecha de Entrada");
        jXLabelFechaentrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jXLabelfechasalida.setText("Fecha de Salida");
        jXLabelfechasalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 448, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXLabelFechaentrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jXDatePicker2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jXLabelfechasalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabelFechaentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jXLabelfechasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jTabbedPane1.addTab("1.-Clientes", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoría", "Capacidad", "Precio", "Tipo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane1.setViewportView(jTable2);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categoría", "Tipo", "Estado" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Habitaciones a Reservar");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoría", "Capacidad", "Precio", "Tipo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setSelectionBackground(new java.awt.Color(255, 153, 0));
        jScrollPane3.setViewportView(jTable3);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/add.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/cancel2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addGap(0, 241, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2.-Habitaciones", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon64x64/person-icon_31846.png"))); // NOI18N

        textCountClient.setText("jLabel4");

        textCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon64x64/yellow_double-room_icon-icons.com_59563.png"))); // NOI18N

        textCountRoom.setText("jLabel4");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24x24/trade_report_reports_documents_2351.png"))); // NOI18N
        jLabel3.setText("Reserva:");

        textReservation.setText("jLabel4");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(textReservation)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(textReservation))
        );

        textCountRoom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon64x64/money_78376.png"))); // NOI18N

        textMoney.setText("jLabel4");

        textCount1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon64x64/calendar_icon-icons.com_66541.png"))); // NOI18N

        textCountDays.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textCountClient)
                .addGap(18, 18, 18)
                .addComponent(textCount, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textCountRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(textCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textCountDays)
                .addGap(26, 26, 26)
                .addComponent(textCountRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textMoney)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(textCountClient))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCountRoom1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(textMoney))
                    .addComponent(textCount, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(textCountRoom))
                    .addComponent(textCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(textCountDays)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        calendar.setDaysOfTheWeek(new String[] {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"});
        calendar.setSelectionMode(org.jdesktop.swingx.calendar.DateSelectionModel.SelectionMode.SINGLE_INTERVAL_SELECTION);
        calendar.setVerifyInputWhenFocusTarget(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        buttonAccept.setBackground(new java.awt.Color(255, 255, 255));
        buttonAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/ok_accept_15562.png"))); // NOI18N
        buttonAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcceptActionPerformed(evt);
            }
        });

        buttonCancel.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon32x32/delete_40623.png"))); // NOI18N
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAccept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonCancel)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonCancel)
                    .addComponent(buttonAccept))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("3.- Confirmación", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        try {
            Date date = this.jXDatePicker1.getDate();
            Date date1 = this.jXDatePicker2.getDate();
            Language l = new Language();

            DefaultTableModel model2 = (DefaultTableModel) this.jTable2.getModel();
            if (date != null && date1 != null) {
                //            String pattern = "yyyy-MM-dd";
                //            SimpleDateFormat formatter = new SimpleDateFormat(pattern);
                int dias = (int) ((date1.getTime() - date.getTime()) / 86400000);
                GlobalVars.setDays(dias);
                GlobalVars.setDateReservation(date);
                GlobalVars.setDateDue(date1);
                //            JOptionPane.showMessageDialog(null,dias, "Error", JOptionPane.ERROR_MESSAGE);
                this.calendar.setFlaggedDates(date, date1);
                this.calendar.setFlaggedDayForeground(Color.BLUE);
                this.calendar.setSelectionDate(date);
                this.calendar.setSelectionInterval(date, date1);
                this.calendar.setSelectionBackground(Color.ORANGE);
                if (date.after(date1)) {
                    this.jTabbedPane1.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, "Fechas incoherentes", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (GlobalVars.clients.size() < 1) {
                    this.jTabbedPane1.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, "Seleccione clientes", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            switch (this.jTabbedPane1.getSelectedIndex()) {
                case 0:
                    break;
                case 1:
                    if (date != null && date1 != null) {
                        int count = model2.getRowCount() - 1;
                        for (int i = count; i >= 0; i--) {
                            model2.removeRow(i);
                        }
                        newRoom.getRooms(date, date1).forEach(r -> {
                            Category ca = newCat.findByCategoryId(r.getCategory().getIdCategory());
                            model2.addRow(new Object[]{r.getName(), mapCategory.get(ca.getCategoryType().toString()), r.getCapacity(),
                                r.getPrice(), r.getTypeRoom() ? l.getEsTipoPrivada() : l.getEsTipoPublica(), mapStatus.get(r.getStatusRoom().toString())});

                        });
                    } else {
                        this.jTabbedPane1.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(null, "Selecciones rango de fecha", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 2:
                    if (!(GlobalVars.clients.size() > 0)) {
                        this.jTabbedPane1.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(null, "Ingreso por lo menos un cliente", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    if (!(GlobalVars.rooms.size() > 0)) {
                        this.jTabbedPane1.setSelectedIndex(0);
                        JOptionPane.showMessageDialog(null, "Ingreso por lo menos una habitación", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }

            loadDashboard();
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void buttonAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcceptActionPerformed
        try {
            Language l = new Language();
            Reservation reserv = new Reservation();
            reserv.setIdEmployee(GlobalVars.getEmployeeId());
            reserv.setStatus(1);
            reserv.setRegistrationDate(new Date());
            reserv.setReservationDate(GlobalVars.getDateReservation());
            reserv.setDueDate(GlobalVars.getDateDue());
            reserv.setRode(GlobalVars.getRode());
            newReserv.save(reserv, 0);
            reserv.setIdReservation(Integer.parseInt(this.textReservation.getText()));
            GlobalVars.clients.forEach(c -> {
                Detailreservationclient detail = new Detailreservationclient();
                detail.setReservation(reserv);
                detail.setTypeClient(c.getDocType());
                detail.setClients(c);
                newDetailC.save(detail, 0);
            });
            GlobalVars.rooms.forEach(r -> {
                Detailreservationroom detail = new Detailreservationroom();
                detail.setReservation(reserv);
                detail.setRoom(r);
                r.setStatusRoom(0);
                newRoom.save(r, 1);
                newDetailR.save(detail, 0);
            });
            JOptionPane.showMessageDialog(null, l.getGuardarReserva(), l.getEXITO(), JOptionPane.INFORMATION_MESSAGE);
            resetAll();
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonAcceptActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            Language l = new Language();
            if (this.jTable3.getSelectedRow() != -1) {
                Room r = newRoom.findByName(String.valueOf(this.jTable3.getValueAt(this.jTable3.getSelectedRow(), 0)));
                GlobalVars.rooms.remove(GlobalVars.getIndex(r));
                r.setStatusRoom(0);
                newRoom.save(r, 1);
                loadRooms();
            } else {
                JOptionPane.showMessageDialog(null, l.getfilanoselcecionada(), l.getError(), JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Language l = new Language();
            if (this.jTable2.getSelectedRow() != -1) {
                Room r = newRoom.findByName(String.valueOf(this.jTable2.getValueAt(this.jTable2.getSelectedRow(), 0)));
                if (r.getStatusRoom() == 0) {
                    GlobalVars.rooms.forEach(ro -> {
                        if (ro.getIdRoom() == r.getIdRoom()) {
                            noExist = false;
                        }
                    });
                    if (noExist) {
                        GlobalVars.rooms.add(r);
                        loadRooms();
                        r.setStatusRoom(1);
                        newRoom.save(r, 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "La habitación ya se agregó", l.getError(), JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Otro usuario está utilizando esta habitación", l.getError(), JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, l.getfilanoselcecionada(), l.getError(), JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        try {
            Language l = new Language();
            DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
            int count = model.getRowCount() - 1;
            for (int i = count; i >= 0; i--) {
                model.removeRow(i);
            }
            switch (this.jComboBox1.getSelectedIndex()) {
                case 0:
                    newRoom.findAll().forEach(r -> {
                        Category ca = newCat.findByCategoryId(r.getCategory().getIdCategory());
                        if (ca.getCategoryType() == this.jComboBox2.getSelectedIndex()) {
                            model.addRow(new Object[]{r.getName(), mapCategory.get(ca.getCategoryType().toString()), r.getCapacity(),
                                r.getPrice(), r.getTypeRoom() ? l.getEsTipoPrivada() : l.getEsTipoPublica(), mapStatus.get(r.getStatusRoom().toString())});
                        }
                    });
                    break;
                case 1:
                    newRoom.findAll().forEach(r -> {
                        Category ca = newCat.findByCategoryId(r.getCategory().getIdCategory());
                        int type = r.getTypeRoom() ? 1 : 0;
                        if (type == this.jComboBox2.getSelectedIndex()) {
                            model.addRow(new Object[]{r.getName(), mapCategory.get(ca.getCategoryType().toString()), r.getCapacity(),
                                r.getPrice(), r.getTypeRoom() ? l.getEsTipoPrivada() : l.getEsTipoPublica(), mapStatus.get(r.getStatusRoom().toString())});
                        }
                    });
                    break;
                case 2:
                    newRoom.findAll().forEach(r -> {
                        Category ca = newCat.findByCategoryId(r.getCategory().getIdCategory());
                        if (r.getStatusRoom() == this.jComboBox2.getSelectedIndex()) {
                            model.addRow(new Object[]{r.getName(), mapCategory.get(ca.getCategoryType().toString()), r.getCapacity(),
                                r.getPrice(), r.getTypeRoom() ? l.getEsTipoPrivada() : l.getEsTipoPublica(), mapStatus.get(r.getStatusRoom().toString())});
                        }
                    });
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
            Language l = new Language();
            this.jComboBox2.removeAllItems();
            switch (this.jComboBox1.getSelectedIndex()) {
                case 0:
                    this.jComboBox2.addItem("A");
                    this.jComboBox2.addItem("B");
                    this.jComboBox2.addItem("C");
                    this.jComboBox2.addItem("D");
                    this.jComboBox2.addItem("E");
                    this.jComboBox2.addItem("F");
                    break;
                case 1:
                    this.jComboBox2.addItem(l.getEsTipoPublica());
                    this.jComboBox2.addItem(l.getEsTipoPrivada());
                    break;
                case 2:
                    this.jComboBox2.addItem(l.getEstadoDisponible());
                    this.jComboBox2.addItem(l.getEstadoOcupado());
                    this.jComboBox2.addItem(l.getEstadoReservada());
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Language l = new Language();
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            if (jTable1.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, l.getfilanoselcecionada(), l.getError(), JOptionPane.ERROR_MESSAGE);
            } else {
                for (int i = 0; i < jTable1.getRowCount(); i++) {
                    model.setValueAt("Secundario", i, 2);
                }
                model.setValueAt("Principal", jTable1.getSelectedRow(), 2);
                Clients c = newClient.findClientByDoc(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
                GlobalVars.setPrincipal(c);
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Language l = new Language();
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            if (jTable1.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, l.getfilanoselcecionada(), l.getError(), JOptionPane.ERROR_MESSAGE);
            } else {
                Clients client = newClient.findClientByDoc(model.getValueAt(jTable1.getSelectedRow(), 1).toString());
                model.removeRow(jTable1.getSelectedRow());
                GlobalVars.clients.remove(client);
                JOptionPane.showMessageDialog(null, l.getEliminocliente(), l.getEXITO(), JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameListCliente fcc = new FrameListCliente(3);
        desktopPane.add(fcc);
        Dimension desktopSize = desktopPane.getSize();
        Dimension FrameSize = fcc.getSize();
        fcc.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        fcc.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        resetAll();
    }//GEN-LAST:event_buttonCancelActionPerformed
    public void resetAll() {
        GlobalVars.clients = new ArrayList<>();
        GlobalVars.rooms.forEach(r -> {
            r.setStatusRoom(0);
            newRoom.save(r, 1);
        });
        GlobalVars.rooms = new ArrayList<>();
        GlobalVars.setDays(0);
        this.dispose();
    }

    public void loadClients() {
        try {
            Language l = new Language();
            mapa();
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            DefaultTableModel model2 = (DefaultTableModel) this.jTable3.getModel();
            GlobalVars.clients.forEach(c -> {
                if (model.getRowCount() < 1) {
                    model.addRow(new Object[]{c.getName(), c.getDocIdentity(), "Principal"});
                    GlobalVars.setPrincipal(c);
                } else {
                    model.addRow(new Object[]{c.getName(), c.getDocIdentity(), "Secundario"});
                }

            });
            GlobalVars.rooms.forEach(r -> {
                Category ca = newCat.findByCategoryId(r.getCategory().getIdCategory());
                model2.addRow(new Object[]{r.getName(), mapCategory.get(ca.getCategoryType().toString()), r.getCapacity(),
                    r.getPrice(), r.getTypeRoom() ? l.getEsTipoPrivada() : l.getEsTipoPublica(), mapStatus.get(r.getStatusRoom().toString())});

            });
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadRooms() {
        try {
            Language l = new Language();
            DefaultTableModel model2 = (DefaultTableModel) this.jTable3.getModel();
            int count = model2.getRowCount() - 1;
            for (int i = count; i >= 0; i--) {
                model2.removeRow(i);
            }
            GlobalVars.rooms.forEach(r -> {
                Category ca = newCat.findByCategoryId(r.getCategory().getIdCategory());
                model2.addRow(new Object[]{r.getName(), mapCategory.get(ca.getCategoryType().toString()), r.getCapacity(),
                    r.getPrice(), r.getTypeRoom() ? l.getEsTipoPrivada() : l.getEsTipoPublica(), mapStatus.get(r.getStatusRoom().toString())});
            });
        } catch (IOException ex) {
            Logger.getLogger(FrameReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadDashboard() {
        float countMoney = 0;
        int reservation = 1;
        for (Room r : GlobalVars.rooms) {
            countMoney += r.getPrice() * GlobalVars.getDays();
        }
        for (Reservation r : newReserv.findAll()) {
            reservation++;
        }
        GlobalVars.setRode((long) countMoney);
        this.textReservation.setText(String.valueOf(reservation));
        this.textMoney.setText(String.valueOf(countMoney));
        this.textCountClient.setText(String.valueOf(GlobalVars.clients.size()));
        this.textCountRoom.setText(String.valueOf(GlobalVars.rooms.size()));
        this.textCountDays.setText(String.valueOf(GlobalVars.getDays()));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAccept;
    private javax.swing.JButton buttonCancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.jdesktop.swingx.JXMonthView calendar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private org.jdesktop.swingx.JXLabel jXLabelFechaentrada;
    private org.jdesktop.swingx.JXLabel jXLabelfechasalida;
    private javax.swing.JLabel textCount;
    private javax.swing.JLabel textCount1;
    private javax.swing.JLabel textCountClient;
    private javax.swing.JLabel textCountDays;
    private javax.swing.JLabel textCountRoom;
    private javax.swing.JLabel textCountRoom1;
    private javax.swing.JLabel textMoney;
    private javax.swing.JLabel textReservation;
    // End of variables declaration//GEN-END:variables
}

package proyect_gui;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyect_metodos.MetodoBoleto;
import proyect_metodos.MetodoPasajero;
import proyect_metodos.MetodoRutas;


public class GUI_VentaDeBoletos extends javax.swing.JFrame  {
    
    public MetodoPasajero mp;
    public MetodoRutas mr;
    public MetodoBoleto mb;
    public String [] pasajeroEncontrado = new String [5];
    public String [] rutaEncontrada = new String [7];
    public String [] boleto = new String [9];
    
    public GUI_VentaDeBoletos() throws IOException  {
        initComponents();
        mp = new MetodoPasajero();
        mr = new MetodoRutas();
        mb = new MetodoBoleto();
        habilitarPasajero();
        habilitarRuta();
        txt_venta_descuento.setEnabled(false);
        txt_venta_total.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_venta_busca_cedula = new javax.swing.JTextField();
        txt_venta_apellido = new javax.swing.JTextField();
        txt_venta_edad = new javax.swing.JTextField();
        txt_venta_tipoPasajero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_venta_nombre = new javax.swing.JTextField();
        btn_buscar_pasajero = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txt_ventas_origen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_venta_costo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_venta_fecha = new javax.swing.JTextField();
        txt_venta_hora = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_ventas_destino = new javax.swing.JTextField();
        btn_buscar_ruta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_venta_numboleto = new javax.swing.JTextField();
        txt_venta_descuento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_venta_total = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btn_calcular_ruta = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_ventas_nuevo = new javax.swing.JButton();
        btn_p_guardar = new javax.swing.JButton();
        btn_v_ventas = new javax.swing.JButton();
        btn_p_salir = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_boleto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("DATOS DE PASAJERO :");

        jLabel3.setText("Buscar Cedula:");

        txt_venta_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_venta_apellidoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Pasajero:");

        jLabel2.setText("Apellido Pasajero:");

        jLabel4.setText("Edad Pasajero:");

        jLabel5.setText("Categoria  Pasajero:");

        btn_buscar_pasajero.setText("Buscar");
        btn_buscar_pasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_pasajeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_venta_busca_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txt_venta_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_venta_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_venta_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_buscar_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_venta_tipoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_venta_busca_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_pasajero))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_venta_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_venta_apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_venta_edad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_venta_tipoPasajero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("ORIGEN");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("DATOS DE RUTA :");

        jLabel9.setText("Costo de Ruta");

        jLabel10.setText("Fecha de viaje");

        jLabel11.setText("Hora de viaje");

        jLabel16.setText("DESTINO");

        txt_ventas_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ventas_destinoActionPerformed(evt);
            }
        });

        btn_buscar_ruta.setText("Buscar");
        btn_buscar_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_rutaActionPerformed(evt);
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_venta_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_venta_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(20, 20, 20)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_venta_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(23, 23, 23)))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(108, 108, 108))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_ventas_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(txt_ventas_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ventas_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_ventas_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_ruta))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_venta_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_venta_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_venta_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Numero de boletos");

        jLabel13.setText("Descuento");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("BOLETOS :");

        txt_venta_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_venta_totalActionPerformed(evt);
            }
        });

        jLabel15.setText("Total a Pagar");

        btn_calcular_ruta.setText("Calcular");
        btn_calcular_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcular_rutaActionPerformed(evt);
            }
        });

        jLabel17.setText("Para encontrar una ruta es necesario ingresar la ciudad origen y la ciudad destino");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_venta_numboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txt_venta_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_venta_total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_calcular_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel13)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel15)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_venta_numboleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_venta_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_venta_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calcular_ruta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_ventas_nuevo.setText("Nuevo");
        btn_ventas_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventas_nuevoActionPerformed(evt);
            }
        });

        btn_p_guardar.setText("Guardar");
        btn_p_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_guardarActionPerformed(evt);
            }
        });

        btn_v_ventas.setText("Editar");
        btn_v_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_v_ventasActionPerformed(evt);
            }
        });

        btn_p_salir.setText("Salir");
        btn_p_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_salirActionPerformed(evt);
            }
        });

        jLabel19.setText("Niños <= 12");

        jLabel20.setText("Tercera Edad >=65");

        jLabel18.setText("50 % Descuento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_p_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_v_ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_p_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ventas_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btn_ventas_nuevo)
                .addGap(18, 18, 18)
                .addComponent(btn_p_guardar)
                .addGap(29, 29, 29)
                .addComponent(btn_v_ventas)
                .addGap(27, 27, 27)
                .addComponent(btn_p_salir)
                .addGap(23, 23, 23)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_boleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "CEDULA", "NOMBRE", "RUTA", "FECHA Y HORA", "CANTIDAD", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_boleto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void habilitarPasajero(){
        txt_venta_nombre.setEnabled(false);
        txt_venta_apellido.setEnabled(false); 
        txt_venta_edad.setEnabled(false); 
        txt_venta_tipoPasajero.setEnabled(false);
        txt_venta_nombre.setText("");
        txt_venta_apellido.setText(""); 
        txt_venta_edad.setText(""); 
        txt_venta_tipoPasajero.setText("");
    }
    
    public void habilitarRuta(){
        txt_venta_costo.setEnabled(false);
        txt_venta_fecha.setEnabled(false); 
        txt_venta_hora.setEnabled(false); 
        txt_venta_costo.setText("");
        txt_venta_fecha.setText(""); 
        txt_venta_hora.setText(""); 
    }
    
    private void btn_p_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_salirActionPerformed
        // TODO add your handling code here:
        GUI_Principal b = new GUI_Principal();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_p_salirActionPerformed

    private void btn_ventas_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventas_nuevoActionPerformed
        habilitarPasajero();
        habilitarRuta();
        limpiarCalcular();
    }//GEN-LAST:event_btn_ventas_nuevoActionPerformed

    private void btn_v_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_v_ventasActionPerformed
        // Boton eliminar pasajeros en tabla:
      
    }//GEN-LAST:event_btn_v_ventasActionPerformed

    private void btn_buscar_pasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_pasajeroActionPerformed
        habilitarPasajero();
        try {
            pasajeroEncontrado = mp.ObtenerPasajero(txt_venta_busca_cedula.getText());
        } catch (IOException ex) {
            Logger.getLogger(GUI_VentaDeBoletos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(pasajeroEncontrado[0]!=null){
                txt_venta_nombre.setText(pasajeroEncontrado[1]);
                txt_venta_apellido.setText(pasajeroEncontrado[2]);
                txt_venta_edad.setText(pasajeroEncontrado[4]);
                txt_venta_tipoPasajero.setText(pasajeroEncontrado[3]);
        }else{       
                JOptionPane.showMessageDialog(null, "PASAJERO NO REGISTRADO");
        }
    }//GEN-LAST:event_btn_buscar_pasajeroActionPerformed

    private void btn_p_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_guardarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_p_guardarActionPerformed

    private void txt_venta_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_venta_apellidoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txt_venta_apellidoActionPerformed

    private void btn_buscar_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_rutaActionPerformed
        habilitarRuta();
        try {
            rutaEncontrada = mr.ObtenerRuta(txt_ventas_origen.getText(),txt_ventas_destino.getText());
            System.out.println("Ciudad enviada"+txt_ventas_origen.getText());
        } catch (IOException ex) {
            Logger.getLogger(GUI_VentaDeBoletos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(rutaEncontrada[0]!=null){
                txt_venta_costo.setText(rutaEncontrada[2]);
                txt_venta_fecha.setText(rutaEncontrada[5]);
                txt_venta_hora.setText(rutaEncontrada[6]);
        }else{       
                JOptionPane.showMessageDialog(null, "RUTA NO REGISTRADA");
        }        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btn_buscar_rutaActionPerformed

    private void txt_venta_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_venta_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_venta_totalActionPerformed
    public void limpiarCalcular(){
            txt_venta_descuento.setText("");
            txt_venta_total.setText("");
    }
    private void btn_calcular_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcular_rutaActionPerformed
        limpiarCalcular();
        if(pasajeroEncontrado[0]!=null){
            if(rutaEncontrada[0]!=null){
                int cantidad = Integer.valueOf(txt_venta_numboleto.getText());
                int descuento=0;
                double valor=0;
                
                if(Integer.valueOf(pasajeroEncontrado[4])<13){
                    descuento=2;//descuento niños
                    txt_venta_descuento.setText("NIÑOS");
                }
                if(Integer.valueOf(pasajeroEncontrado[4])>64){
                    descuento=2;//descuento tercera edad
                    txt_venta_descuento.setText("TERCERA EDAD");
                }
                if(descuento==0){
                    txt_venta_descuento.setText("NO APLICA");
                    valor = cantidad * Double.parseDouble(rutaEncontrada[2]);
                }else{
                    valor = cantidad * Double.parseDouble(rutaEncontrada[2])/descuento;
                }
                txt_venta_total.setText(""+valor);
                
            }else
                JOptionPane.showMessageDialog(null, "Primero seleccione una ruta"); 
        }else
           JOptionPane.showMessageDialog(null, "Primero seleccione un pasajero"); 
    }//GEN-LAST:event_btn_calcular_rutaActionPerformed

    private void txt_ventas_destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ventas_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ventas_destinoActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_VentaDeBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_VentaDeBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_VentaDeBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_VentaDeBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI_VentaDeBoletos().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GUI_VentaDeBoletos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_pasajero;
    private javax.swing.JButton btn_buscar_ruta;
    private javax.swing.JButton btn_calcular_ruta;
    private javax.swing.JButton btn_p_guardar;
    private javax.swing.JButton btn_p_salir;
    private javax.swing.JButton btn_v_ventas;
    private javax.swing.JButton btn_ventas_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_boleto;
    private javax.swing.JTextField txt_venta_apellido;
    private javax.swing.JTextField txt_venta_busca_cedula;
    private javax.swing.JTextField txt_venta_costo;
    private javax.swing.JTextField txt_venta_descuento;
    private javax.swing.JTextField txt_venta_edad;
    private javax.swing.JTextField txt_venta_fecha;
    private javax.swing.JTextField txt_venta_hora;
    private javax.swing.JTextField txt_venta_nombre;
    private javax.swing.JTextField txt_venta_numboleto;
    private javax.swing.JTextField txt_venta_tipoPasajero;
    private javax.swing.JTextField txt_venta_total;
    private javax.swing.JTextField txt_ventas_destino;
    private javax.swing.JTextField txt_ventas_origen;
    // End of variables declaration//GEN-END:variables
}

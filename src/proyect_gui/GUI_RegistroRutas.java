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

public class GUI_RegistroRutas extends javax.swing.JFrame {
    File archivo = new File("Rutas.txt");
    String opcionBoton = null;
    int numeroEditar=0;
    int numeroEliminar=0;
    
    
    public GUI_RegistroRutas() throws IOException{
        initComponents();
        HabilitarIngreso(false);
        btn_r_editar.setEnabled(false);
        btn_r_guardar.setEnabled(false);
        btn_r_eliminar.setEnabled(false);
        verificarArchivo();
        asignarEventoMouse();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_rutas = new javax.swing.JTable();
        btn_r_salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_r_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_r_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_r_origen = new javax.swing.JTextField();
        txt_r_destino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_r_fecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_r_hora = new javax.swing.JTextField();
        txt_r_costo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_r_destino_buscar = new javax.swing.JTextField();
        txt_r_origen_buscar = new javax.swing.JTextField();
        btn_r_actualizar = new javax.swing.JButton();
        btn_r_buscar = new javax.swing.JButton();
        btn_r_nuevo = new javax.swing.JButton();
        btn_r_guardar = new javax.swing.JButton();
        btn_r_editar = new javax.swing.JButton();
        btn_r_eliminar = new javax.swing.JButton();
        btn_r_cancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modulo De Rutas");

        table_rutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "ID ", "RUTA", "COSTO RUTA", "ORIGEN", "DESTINO", "FECHA", "HORA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_rutas);

        btn_r_salir.setText("Salir");
        btn_r_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_salirActionPerformed(evt);
            }
        });

        jLabel9.setText("Hora");

        jLabel1.setText("ID");

        jLabel3.setText("Costo Ruta");

        jLabel4.setText("Ruta");

        jLabel5.setText("Origen");

        jLabel2.setText("Destino");

        jLabel10.setText("Fecha");

        jLabel6.setText("DATOS DE LA RUTA:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_r_hora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_r_origen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_r_id, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txt_r_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txt_r_destino))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(txt_r_fecha)
                            .addComponent(jLabel3)
                            .addComponent(txt_r_costo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_r_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_r_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_r_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jLabel7.setText("BUSQUEDA DE LA RUTA:");

        jLabel8.setText("Origen");

        jLabel11.setText("Destino");

        btn_r_actualizar.setText("Actualizar Listado");
        btn_r_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_actualizarActionPerformed(evt);
            }
        });

        btn_r_buscar.setText("Buscar");
        btn_r_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_buscarActionPerformed(evt);
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
                            .addComponent(jLabel8)
                            .addComponent(txt_r_origen_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_r_destino_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btn_r_buscar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_r_actualizar)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(btn_r_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_r_origen_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_r_destino_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_r_buscar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btn_r_nuevo.setText("Nuevo");
        btn_r_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_nuevoActionPerformed(evt);
            }
        });

        btn_r_guardar.setText("Guardar");
        btn_r_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_guardarActionPerformed(evt);
            }
        });

        btn_r_editar.setText("Editar");
        btn_r_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_editarActionPerformed(evt);
            }
        });

        btn_r_eliminar.setText("Eliminar");
        btn_r_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_eliminarActionPerformed(evt);
            }
        });

        btn_r_cancelar.setText("Cancelar");
        btn_r_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_r_cancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Dar doble clic en registro a gestionar, ya sea para editar o eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_r_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(btn_r_editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_r_eliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_r_salir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_r_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_r_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btn_r_nuevo)
                        .addGap(35, 35, 35)
                        .addComponent(btn_r_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_r_editar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_r_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btn_r_cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_r_salir)))
                .addGap(2, 2, 2)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void asignarEventoMouse(){
       table_rutas.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_event){
                JTable tabla = (JTable)Mouse_event.getSource();
                Point point = Mouse_event.getPoint();
                int row = tabla.rowAtPoint(point);
                if(Mouse_event.getClickCount()==2){
                    btn_r_editar.setEnabled(true);
                    btn_r_eliminar.setEnabled(true);
                    btn_r_nuevo.setEnabled(false);
                    
                    numeroEditar=Integer.parseInt(""+tabla.getValueAt(tabla.getSelectedRow(), 0));
                    numeroEliminar=numeroEditar;
                    System.out.println("Editar ="+numeroEditar+" Eliminar "+numeroEliminar);
                    txt_r_id.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 1));
                    txt_r_nombre.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 2));
                    txt_r_costo.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 3));
                    txt_r_origen.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 4));
                    txt_r_destino.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 5));
                    txt_r_fecha.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 6));
                    txt_r_hora.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 7));
                }
            }
        });
    }
    
    public void HabilitarIngreso(boolean b){
        txt_r_id.setEnabled(b);
        txt_r_nombre.setEnabled(b);
        txt_r_costo.setEnabled(b);
        txt_r_origen.setEnabled(b);
        txt_r_destino.setEnabled(b);
        txt_r_fecha.setEnabled(b);
        txt_r_hora.setEnabled(b);
    }

    public void limpiarCajasTexto(){
        txt_r_id.setText("");
        txt_r_nombre.setText("");
        txt_r_costo.setText("");
        txt_r_origen.setText("");
        txt_r_destino.setText("");
        txt_r_fecha.setText("");
        txt_r_hora.setText("");
    }
    
    private void verificarArchivo() throws IOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(!archivo.exists()){
            archivo.createNewFile();
            System.out.println("Archivo TXT creado en el Directorio local del proyecto");
        }
        else
        {
            System.out.println("El archivo ya existe");
            leerArchivo();
        }
    }
    
    private void leerArchivo() throws FileNotFoundException, IOException{
        String linea = null;
        int numeroRegistros=0;
        BufferedReader leerFicheroRuta = new BufferedReader(new FileReader(archivo));
        while ((linea = leerFicheroRuta.readLine()) != null) { 
            numeroRegistros+=1;
        }
        leerFicheroRuta.close();
        if(numeroRegistros==0)
            System.out.println("ARCHIVO RUTA.TXT VACIO");
        else{
            String [][]datos = new String[numeroRegistros][7];
            int posicion=0;
            String line = null;
            BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
            while ((line = leerArchivo.readLine()) != null) {   
                StringTokenizer mistokens = new StringTokenizer(line,"\t");
                datos[posicion][0] = mistokens.nextToken().trim();
                datos[posicion][1] = mistokens.nextToken().trim();
                datos[posicion][2] = mistokens.nextToken().trim();
                datos[posicion][3] = mistokens.nextToken().trim();
                datos[posicion][4] = mistokens.nextToken().trim();
                datos[posicion][5] = mistokens.nextToken().trim();
                datos[posicion][6] = mistokens.nextToken().trim();
                posicion+=1;
            }
            leerArchivo.close();
            DefaultTableModel modelo = (DefaultTableModel) table_rutas.getModel();
            limpiarTabla(modelo);
            for (int i = 0; i < datos.length; i++) {
                String []data = new String[11];
                data[0]=String.valueOf(i+1);
                for (int j = 0; j < datos[i].length; j++) {
                    data[(j+1)]=datos[i][j];
                }
                modelo.addRow(data);
            }            
        }
        btn_r_nuevo.setEnabled(true);
    }
    public void limpiarTabla(DefaultTableModel modelo){   
        for (int i = table_rutas.getRowCount() -1; i >= 0; i--){ 
            modelo.removeRow(i); 
        } 
    }
    
    private void ingresarPersonal() throws FileNotFoundException, UnsupportedEncodingException, IOException{
        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true),"utf-8"));
        escribirArchivo.write(txt_r_id.getText()+"\t"+txt_r_nombre.getText()+"\t"+txt_r_costo.getText()+"\t"+txt_r_origen.getText()+"\t"+txt_r_destino.getText()+"\t"+txt_r_fecha.getText()+"\t"+txt_r_hora.getText()+"\n");
        JOptionPane.showMessageDialog(null, "Datos ruta registrado correctamente");
        escribirArchivo.close();
        leerArchivo();
    }
    
    public void almacenarFicheroUsuario() throws IOException{
        archivo.delete();
        archivo.createNewFile();
        BufferedWriter escribirArchivo = new BufferedWriter
        (new OutputStreamWriter(new FileOutputStream(archivo,true),"utf-8"));
        for (int i = 0; i < table_rutas.getRowCount(); i++) {
            escribirArchivo.write(table_rutas.getValueAt(i, 1)+"\t"+table_rutas.getValueAt(i, 2)
                    +"\t"+table_rutas.getValueAt(i, 3)+"\t"+table_rutas.getValueAt(i, 4)+"\t"
                    +table_rutas.getValueAt(i, 5)+"\t" +table_rutas.getValueAt(i, 6)+"\t"+table_rutas.getValueAt(i, 7)+"\n");
        }
        escribirArchivo.close();
        leerArchivo();
    }
    
    public void efectuarEdicion(){
        for (int i = 0; i < table_rutas.getRowCount(); i++) {
            if(numeroEditar==Integer.parseInt((String)table_rutas.getValueAt(i, 0))){
                table_rutas.setValueAt(numeroEditar, i, 0);
                table_rutas.setValueAt(txt_r_id.getText(), i, 1);
                table_rutas.setValueAt(txt_r_nombre.getText(), i, 2);
                table_rutas.setValueAt(txt_r_costo.getText(), i, 3);
                table_rutas.setValueAt(txt_r_origen.getText(), i, 4);
                table_rutas.setValueAt(txt_r_destino.getText(), i, 5);
                table_rutas.setValueAt(txt_r_fecha.getText(), i, 6);
                table_rutas.setValueAt(txt_r_hora.getText(), i, 7);
                break;
            }
        }
    }
    
    private void btn_r_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_guardarActionPerformed
        if (!(txt_r_id.getText().equals("")||txt_r_nombre.getText().equals("")||txt_r_costo.getText().equals("")||txt_r_origen.getText().equals("")||txt_r_destino.getText().equals("")||txt_r_fecha.getText().equals("")||txt_r_hora.getText().equals(""))) {
            if(opcionBoton.equals("Nuevo"))
            try {
                ingresarPersonal();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            else if (opcionBoton.equals("Editar")) {
                efectuarEdicion();
                try {
                    almacenarFicheroUsuario();
                } catch (IOException ex) {
                    Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "REGISTRO RUTA ACTUALIZADO CORRECTAMENTE");
            }
            HabilitarIngreso(false);
            limpiarCajasTexto();
            btn_r_nuevo.setEnabled(true);
            btn_r_guardar.setEnabled(false);
            btn_r_editar.setEnabled(false);
            btn_r_cancelar.setEnabled(false);
            btn_r_eliminar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON REQUERIDOS");
        }
    }//GEN-LAST:event_btn_r_guardarActionPerformed

    private void btn_r_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_salirActionPerformed
        // TODO add your handling code here:
        GUI_Principal b = new GUI_Principal();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_r_salirActionPerformed

    private void btn_r_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_nuevoActionPerformed
        HabilitarIngreso(true);
        limpiarCajasTexto();
        btn_r_nuevo.setEnabled(false);
        btn_r_guardar.setEnabled(true);
        btn_r_editar.setEnabled(false);
        btn_r_cancelar.setEnabled(true);
        btn_r_eliminar.setEnabled(false);
        txt_r_id.setFocusable(true);
        opcionBoton="Nuevo";       
    }//GEN-LAST:event_btn_r_nuevoActionPerformed

    private void btn_r_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_editarActionPerformed
            opcionBoton = "Editar";
            HabilitarIngreso(true);
            btn_r_nuevo.setEnabled(false);
            btn_r_guardar.setEnabled(true);
            btn_r_editar.setEnabled(false);
            btn_r_cancelar.setEnabled(true);
            btn_r_eliminar.setEnabled(false);      
    }//GEN-LAST:event_btn_r_editarActionPerformed

    private void btn_r_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_eliminarActionPerformed
    int respuesta = JOptionPane.showConfirmDialog(null, "CONFIRME SI DESEA ELIMINAR LA RUTA SELECCIONADA", "ELIMINAR RUTA", JOptionPane.YES_NO_OPTION);
        if(respuesta == JOptionPane.YES_OPTION){
            DefaultTableModel modelo = (DefaultTableModel) table_rutas.getModel();
            for (int i = 0; i < table_rutas.getRowCount(); i++) {
                if(numeroEliminar==Integer.parseInt(String.valueOf(table_rutas.getValueAt(i, 0)))){
                    modelo.removeRow(i);
                }
            }
            JOptionPane.showMessageDialog(null, "SE HA ELIMINADO REGISTRO CORRECTAMENTE");
            btn_r_editar.setEnabled(false);
            btn_r_eliminar.setEnabled(false);

            try {
                almacenarFicheroUsuario();
            } catch (IOException ex) {
                Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("No se ha eliminado nada");
        }       
        
    }//GEN-LAST:event_btn_r_eliminarActionPerformed

    private void btn_r_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_cancelarActionPerformed
        HabilitarIngreso(false);
        limpiarCajasTexto();
        btn_r_nuevo.setEnabled(true);
        btn_r_guardar.setEnabled(false);
        btn_r_editar.setEnabled(false);
        btn_r_cancelar.setEnabled(false);
        btn_r_eliminar.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_r_cancelarActionPerformed

    private void btn_r_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_actualizarActionPerformed
        try {
            leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }              // TODO add your handling code here:
    }//GEN-LAST:event_btn_r_actualizarActionPerformed

    private void btn_r_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_r_buscarActionPerformed
        String buscarOrigen = String.valueOf(txt_r_origen_buscar.getText());
        String buscarDestino = String.valueOf(txt_r_destino_buscar.getText());
        System.out.println("Comprobar ciudad origen: "+buscarOrigen);
        System.out.println("Comprobar ciudad origen: "+buscarDestino);
        try {
            leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        String [][]datos = new String[table_rutas.getRowCount()][8];
        for (int i = 0; i < table_rutas.getRowCount(); i++) {
            for (int j = 0; j < 8; j++) {
                datos[i][j]=String.valueOf(table_rutas.getValueAt(i, j)) ;
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) table_rutas.getModel();
        limpiarTabla(modelo);
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][4].equalsIgnoreCase(buscarOrigen)&&datos[i][5].equalsIgnoreCase(buscarDestino)){
                modelo.addRow(new Object[]{datos[i][0],datos[i][1],datos[i][2],datos[i][3],datos[i][4],datos[i][5],datos[i][6],datos[i][7]});
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_r_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroRutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI_RegistroRutas().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GUI_RegistroRutas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_r_actualizar;
    private javax.swing.JButton btn_r_buscar;
    private javax.swing.JButton btn_r_cancelar;
    private javax.swing.JButton btn_r_editar;
    private javax.swing.JButton btn_r_eliminar;
    private javax.swing.JButton btn_r_guardar;
    private javax.swing.JButton btn_r_nuevo;
    private javax.swing.JButton btn_r_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_rutas;
    private javax.swing.JTextField txt_r_costo;
    private javax.swing.JTextField txt_r_destino;
    private javax.swing.JTextField txt_r_destino_buscar;
    private javax.swing.JTextField txt_r_fecha;
    private javax.swing.JTextField txt_r_hora;
    private javax.swing.JTextField txt_r_id;
    private javax.swing.JTextField txt_r_nombre;
    private javax.swing.JTextField txt_r_origen;
    private javax.swing.JTextField txt_r_origen_buscar;
    // End of variables declaration//GEN-END:variables
}

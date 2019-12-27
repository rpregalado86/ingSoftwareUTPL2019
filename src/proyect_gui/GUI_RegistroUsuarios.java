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

public class GUI_RegistroUsuarios extends javax.swing.JFrame {

    File archivo = new File("Usuario.txt");
    String opcionBoton = null;
    int numeroEditar=0;
    int numeroEliminar=0;
    
    public GUI_RegistroUsuarios() throws IOException{
        initComponents();
        HabilitarIngreso(false);
        btn_u_editar.setEnabled(false);
        btn_u_guardar.setEnabled(false);
        btn_u_eliminar.setEnabled(false);
        verificarArchivo();
        asignarEventoMouse();
    }
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_usuario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_u_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_u_apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_u_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_u_password = new javax.swing.JTextField();
        txt_u_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_u_id_busca = new javax.swing.JTextField();
        btn_u_buscar = new javax.swing.JButton();
        btn_u_actualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_u_nuevo = new javax.swing.JButton();
        btn_u_guardar = new javax.swing.JButton();
        btn_u_editar = new javax.swing.JButton();
        btn_u_eliminar = new javax.swing.JButton();
        btn_u_salir = new javax.swing.JButton();
        btn_u_cancelar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "CEDULA", "NOMBRE", "APELLIDO", "USUARIO", "PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_usuario);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("INGRESO DE USUARIOS:");

        jLabel5.setText("Id Usuario :");

        jLabel1.setText("Nombre :");

        jLabel2.setText("Apellido :");

        jLabel4.setText("Username :");

        jLabel3.setText("Clave :");

        jLabel10.setText("Digite boton \"Nuevo\" para habilitar ingreso de tados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txt_u_user)
                            .addComponent(txt_u_id, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_u_password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_u_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_u_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel10))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_u_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_u_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_u_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_u_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_u_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("BUSQUEDA Y EDITAR DE  USUARIOS:");

        jLabel8.setText("Id Usuario :");

        btn_u_buscar.setText("Buscar");
        btn_u_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_u_buscarActionPerformed(evt);
            }
        });

        btn_u_actualizar.setText("Listado Completo");
        btn_u_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_u_actualizarActionPerformed(evt);
            }
        });

        jLabel9.setText("Ingrese numero de cedula del usuario a buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_u_id_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_u_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_u_actualizar))
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_u_id_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_u_buscar)
                    .addComponent(btn_u_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_u_nuevo.setText("Nuevo");
        btn_u_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_u_nuevoActionPerformed(evt);
            }
        });

        btn_u_guardar.setText("Guardar");
        btn_u_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_u_guardarActionPerformed(evt);
            }
        });

        btn_u_editar.setText("Editar");
        btn_u_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_u_editarActionPerformed(evt);
            }
        });

        btn_u_eliminar.setText("Eliminar");
        btn_u_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_u_eliminarActionPerformed(evt);
            }
        });

        btn_u_salir.setText("Salir");
        btn_u_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_u_salirActionPerformed(evt);
            }
        });

        btn_u_cancelar.setText("Cancelar");
        btn_u_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_u_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_u_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_u_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(btn_u_editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_u_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_u_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_u_cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btn_u_nuevo)
                .addGap(18, 18, 18)
                .addComponent(btn_u_guardar)
                .addGap(18, 18, 18)
                .addComponent(btn_u_editar)
                .addGap(18, 18, 18)
                .addComponent(btn_u_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_u_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_u_salir)
                .addContainerGap())
        );

        jLabel11.setText("Para eliminar o editar un registro de doble clic sobre el registro a gestionar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public void asignarEventoMouse(){
       table_usuario.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_event){
                JTable tabla = (JTable)Mouse_event.getSource();
                Point point = Mouse_event.getPoint();
                int row = tabla.rowAtPoint(point);
                if(Mouse_event.getClickCount()==2){
                    btn_u_editar.setEnabled(true);
                    btn_u_eliminar.setEnabled(true);
                    btn_u_nuevo.setEnabled(false);
                    
                    numeroEditar=Integer.parseInt(""+tabla.getValueAt(tabla.getSelectedRow(), 0));
                    numeroEliminar=numeroEditar;
                    System.out.println("Editar ="+numeroEditar+" Eliminar "+numeroEliminar);
                    txt_u_id.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 1));
                    txt_u_nombre.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 2));
                    txt_u_apellido.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 3));
                    txt_u_user.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 4));
                    txt_u_password.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 5));
                }
            }
        });
    }
    
    public void HabilitarIngreso(boolean b){
        txt_u_id.setEnabled(b);
        txt_u_nombre.setEnabled(b);
        txt_u_apellido.setEnabled(b);
        txt_u_user.setEnabled(b);
        txt_u_password.setEnabled(b);
    }

    public void limpiarCajasTexto(){
        txt_u_id.setText("");
        txt_u_nombre.setText("");
        txt_u_apellido.setText("");
        txt_u_user.setText("");
        txt_u_password.setText("");
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
        BufferedReader leerFicheroUsuario = new BufferedReader(new FileReader(archivo));
        while ((linea = leerFicheroUsuario.readLine()) != null) { 
            numeroRegistros+=1;
        }
        leerFicheroUsuario.close();
        if(numeroRegistros==0)
            System.out.println("ARCHIVO USUARIO.TXT VACIO");
        else{
            String [][]datos = new String[numeroRegistros][5];
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
                posicion+=1;
            }
            leerArchivo.close();
            DefaultTableModel modelo = (DefaultTableModel) table_usuario.getModel();
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
        btn_u_nuevo.setEnabled(true);
    }
    public void limpiarTabla(DefaultTableModel modelo){   
        for (int i = table_usuario.getRowCount() -1; i >= 0; i--){ 
            modelo.removeRow(i); 
        } 
    }
    
    private void ingresarPersonal() throws FileNotFoundException, UnsupportedEncodingException, IOException{
        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true),"utf-8"));
        escribirArchivo.write(txt_u_id.getText()+"\t"+txt_u_nombre.getText()+"\t"+txt_u_apellido.getText()+"\t"+txt_u_user.getText()+"\t"+txt_u_password.getText()+"\n");
        JOptionPane.showMessageDialog(null, "Datos usuario registrado correctamente");
        escribirArchivo.close();
        leerArchivo();
    }
    
    public void almacenarFicheroUsuario() throws IOException{
        archivo.delete();
        archivo.createNewFile();
        BufferedWriter escribirArchivo = new BufferedWriter
        (new OutputStreamWriter(new FileOutputStream(archivo,true),"utf-8"));
        for (int i = 0; i < table_usuario.getRowCount(); i++) {
            escribirArchivo.write(table_usuario.getValueAt(i, 1)+"\t"+table_usuario.getValueAt(i, 2)
                    +"\t"+table_usuario.getValueAt(i, 3)+"\t"+table_usuario.getValueAt(i, 4)+"\t"
                    +table_usuario.getValueAt(i, 5)+"\n");
        }
        escribirArchivo.close();
        leerArchivo();
    }
    
    public void efectuarEdicion(){
        for (int i = 0; i < table_usuario.getRowCount(); i++) {
            if(numeroEditar==Integer.parseInt((String)table_usuario.getValueAt(i, 0))){
                table_usuario.setValueAt(numeroEditar, i, 0);
                table_usuario.setValueAt(txt_u_id.getText(), i, 1);
                table_usuario.setValueAt(txt_u_nombre.getText(), i, 2);
                table_usuario.setValueAt(txt_u_apellido.getText(), i, 3);
                table_usuario.setValueAt(txt_u_user.getText(), i, 4);
                table_usuario.setValueAt(txt_u_password.getText(), i, 5);
                break;
            }
        }
    }
    
    private void btn_u_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_u_buscarActionPerformed
        String buscar = String.valueOf(txt_u_id_busca.getText());
        System.out.println("Comprobar cedula a buscar es: "+buscar);
        try {
            leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        String [][]datos = new String[table_usuario.getRowCount()][6];
        for (int i = 0; i < table_usuario.getRowCount(); i++) {
            for (int j = 0; j < 6; j++) {
                datos[i][j]=String.valueOf(table_usuario.getValueAt(i, j)) ;
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) table_usuario.getModel();
        limpiarTabla(modelo);
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][1].equals(buscar)){
                modelo.addRow(new Object[]{datos[i][0],datos[i][1],datos[i][2],datos[i][3],datos[i][4],datos[i][5]});
            }
        }
    }//GEN-LAST:event_btn_u_buscarActionPerformed

    private void btn_u_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_u_actualizarActionPerformed
        try {
            leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btn_u_actualizarActionPerformed

    private void btn_u_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_u_cancelarActionPerformed
        HabilitarIngreso(false);
        limpiarCajasTexto();
        btn_u_nuevo.setEnabled(true);
        btn_u_guardar.setEnabled(false);
        btn_u_editar.setEnabled(false);
        btn_u_cancelar.setEnabled(false);
        btn_u_eliminar.setEnabled(false);
    }//GEN-LAST:event_btn_u_cancelarActionPerformed

    private void btn_u_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_u_salirActionPerformed

        GUI_Principal b = new GUI_Principal();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_u_salirActionPerformed

    private void btn_u_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_u_eliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "CONFIRME SI DESEA ELIMINAR EL USUARIO SELECCIONADO", "ELIMINAR USUARIO", JOptionPane.YES_NO_OPTION);
        if(respuesta == JOptionPane.YES_OPTION){
            DefaultTableModel modelo = (DefaultTableModel) table_usuario.getModel();
            for (int i = 0; i < table_usuario.getRowCount(); i++) {
                if(numeroEliminar==Integer.parseInt(String.valueOf(table_usuario.getValueAt(i, 0)))){
                    modelo.removeRow(i);
                }
            }
            JOptionPane.showMessageDialog(null, "SE HA ELIMINADO REGISTRO CORRECTAMENTE");
            btn_u_editar.setEnabled(false);
            btn_u_eliminar.setEnabled(false);

            try {
                almacenarFicheroUsuario();
            } catch (IOException ex) {
                Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("No se ha eliminado nada");
        }
    }//GEN-LAST:event_btn_u_eliminarActionPerformed

    private void btn_u_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_u_editarActionPerformed
            opcionBoton = "Editar";
            HabilitarIngreso(true);
            btn_u_nuevo.setEnabled(false);
            btn_u_guardar.setEnabled(true);
            btn_u_editar.setEnabled(false);
            btn_u_cancelar.setEnabled(true);
            btn_u_eliminar.setEnabled(false);
    }//GEN-LAST:event_btn_u_editarActionPerformed

    private void btn_u_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_u_guardarActionPerformed
        if (!(txt_u_id.getText().equals("")||txt_u_nombre.getText().equals("")||txt_u_apellido.getText().equals("")||txt_u_user.getText().equals("")||txt_u_password.getText().equals(""))) {
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
                JOptionPane.showMessageDialog(null, "REGISTRO USUARIO ACTUALIZADO CORRECTAMENTE");
            }
            HabilitarIngreso(false);
            limpiarCajasTexto();
            btn_u_nuevo.setEnabled(true);
            btn_u_guardar.setEnabled(false);
            btn_u_editar.setEnabled(false);
            btn_u_cancelar.setEnabled(false);
            btn_u_eliminar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON REQUERIDOS");
        }
    }//GEN-LAST:event_btn_u_guardarActionPerformed

    private void btn_u_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_u_nuevoActionPerformed
        HabilitarIngreso(true);
        limpiarCajasTexto();
        btn_u_nuevo.setEnabled(false);
        btn_u_guardar.setEnabled(true);
        btn_u_editar.setEnabled(false);
        btn_u_cancelar.setEnabled(true);
        btn_u_eliminar.setEnabled(false);
        txt_u_id.setFocusable(true);
        opcionBoton="Nuevo";
    }//GEN-LAST:event_btn_u_nuevoActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI_RegistroUsuarios().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_u_actualizar;
    private javax.swing.JButton btn_u_buscar;
    private javax.swing.JButton btn_u_cancelar;
    private javax.swing.JButton btn_u_editar;
    private javax.swing.JButton btn_u_eliminar;
    private javax.swing.JButton btn_u_guardar;
    private javax.swing.JButton btn_u_nuevo;
    private javax.swing.JButton btn_u_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_usuario;
    private javax.swing.JTextField txt_u_apellido;
    private javax.swing.JTextField txt_u_id;
    private javax.swing.JTextField txt_u_id_busca;
    private javax.swing.JTextField txt_u_nombre;
    private javax.swing.JTextField txt_u_password;
    private javax.swing.JTextField txt_u_user;
    // End of variables declaration//GEN-END:variables
}

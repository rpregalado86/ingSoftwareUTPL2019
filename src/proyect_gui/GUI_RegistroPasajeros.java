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

public class GUI_RegistroPasajeros extends javax.swing.JFrame {

    File archivo = new File("Pasajero.txt");
    String opcionBoton = null;
    int numeroEditar=0;
    int numeroEliminar=0;
    
    public GUI_RegistroPasajeros() throws IOException{
        initComponents();
        HabilitarIngreso(false);
        btn_p_editar.setEnabled(false);
        btn_p_guardar.setEnabled(false);
        btn_p_eliminar.setEnabled(false);
        verificarArchivo();
        asignarEventoMouse();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_p_nombre = new javax.swing.JTextField();
        txt_p_apellido = new javax.swing.JTextField();
        txt_p_cedula = new javax.swing.JTextField();
        txt_p_edad = new javax.swing.JTextField();
        txt_p_pasajero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pasajero = new javax.swing.JTable();
        btn_p_guardar = new javax.swing.JButton();
        btn_p_salir = new javax.swing.JButton();
        btn_p_nuevo = new javax.swing.JButton();
        btn_p_editar = new javax.swing.JButton();
        btn_p_cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_p_busca = new javax.swing.JTextField();
        btn_p_buscar = new javax.swing.JButton();
        btn_p_actualizar = new javax.swing.JButton();
        btn_p_eliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido");

        jLabel3.setText("Cedula");

        jLabel4.setText("Edad:");

        jLabel5.setText("Tipo Pasajero");

        table_pasajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "CEDULA", "NOMBRE", "APELLIDO", "TIPO", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_pasajero);

        btn_p_guardar.setText("Guardar");
        btn_p_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_guardarActionPerformed(evt);
            }
        });

        btn_p_salir.setText("Salir");
        btn_p_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_salirActionPerformed(evt);
            }
        });

        btn_p_nuevo.setText("Nuevo");
        btn_p_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_nuevoActionPerformed(evt);
            }
        });

        btn_p_editar.setText("Editar");
        btn_p_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_editarActionPerformed(evt);
            }
        });

        btn_p_cancelar.setText("Cancelar");
        btn_p_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_cancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("DATOS DEL PASAJERO:");

        jLabel7.setText("Cedula a Buscar");

        btn_p_buscar.setText("Buscar");
        btn_p_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_buscarActionPerformed(evt);
            }
        });

        btn_p_actualizar.setText("Actualizar Listado");
        btn_p_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_actualizarActionPerformed(evt);
            }
        });

        btn_p_eliminar.setText("Eliminar");
        btn_p_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_eliminarActionPerformed(evt);
            }
        });

        jLabel8.setText("Dar doble clic para selecionar registro ya sea para editar o eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(btn_p_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_p_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_p_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_p_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(85, 85, 85)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_p_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_p_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(txt_p_busca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(btn_p_buscar)
                                        .addGap(22, 22, 22)
                                        .addComponent(btn_p_actualizar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_p_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_p_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_p_editar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_p_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(btn_p_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txt_p_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_p_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_p_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_p_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_p_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_p_guardar)
                    .addComponent(btn_p_salir)
                    .addComponent(btn_p_nuevo)
                    .addComponent(btn_p_editar)
                    .addComponent(btn_p_cancelar))
                .addGap(13, 13, 13)
                .addComponent(btn_p_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_p_busca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_p_buscar)
                    .addComponent(btn_p_actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void asignarEventoMouse(){
       table_pasajero.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_event){
                JTable tabla = (JTable)Mouse_event.getSource();
                Point point = Mouse_event.getPoint();
                int row = tabla.rowAtPoint(point);
                if(Mouse_event.getClickCount()==2){
                    btn_p_editar.setEnabled(true);
                    btn_p_eliminar.setEnabled(true);
                    btn_p_nuevo.setEnabled(false);
                    
                    numeroEditar=Integer.parseInt(""+tabla.getValueAt(tabla.getSelectedRow(), 0));
                    numeroEliminar=numeroEditar;
                    System.out.println("Editar ="+numeroEditar+" Eliminar "+numeroEliminar);
                    txt_p_cedula.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 1));
                    txt_p_nombre.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 2));
                    txt_p_apellido.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 3));
                    txt_p_pasajero.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 4));
                    txt_p_edad.setText(""+tabla.getValueAt(tabla.getSelectedRow(), 5));
                }
            }
        });
    }
    
    public void HabilitarIngreso(boolean b){
        txt_p_cedula.setEnabled(b);
        txt_p_nombre.setEnabled(b);
        txt_p_apellido.setEnabled(b);
        txt_p_pasajero.setEnabled(b);
        txt_p_edad.setEnabled(b);
    }

    public void limpiarCajasTexto(){
        txt_p_cedula.setText("");
        txt_p_nombre.setText("");
        txt_p_apellido.setText("");
        txt_p_pasajero.setText("");
        txt_p_edad.setText("");
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
        BufferedReader leerFicheroPasajero = new BufferedReader(new FileReader(archivo));
        while ((linea = leerFicheroPasajero.readLine()) != null) { 
            numeroRegistros+=1;
        }
        leerFicheroPasajero.close();
        if(numeroRegistros==0)
            System.out.println("ARCHIVO PASAJERO.TXT VACIO");
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
            DefaultTableModel modelo = (DefaultTableModel) table_pasajero.getModel();
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
        btn_p_nuevo.setEnabled(true);
    }
    public void limpiarTabla(DefaultTableModel modelo){   
        for (int i = table_pasajero.getRowCount() -1; i >= 0; i--){ 
            modelo.removeRow(i); 
        } 
    }
    
    private void ingresarPersonal() throws FileNotFoundException, UnsupportedEncodingException, IOException{
        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo,true),"utf-8"));
        escribirArchivo.write(txt_p_cedula.getText()+"\t"+txt_p_nombre.getText()+"\t"+txt_p_apellido.getText()+"\t"+txt_p_pasajero.getText()+"\t"+txt_p_edad.getText()+"\n");
        JOptionPane.showMessageDialog(null, "Datos usuario registrado correctamente");
        escribirArchivo.close();
        leerArchivo();
    }
    
    public void almacenarFicheroUsuario() throws IOException{
        archivo.delete();
        archivo.createNewFile();
        BufferedWriter escribirArchivo = new BufferedWriter
        (new OutputStreamWriter(new FileOutputStream(archivo,true),"utf-8"));
        for (int i = 0; i < table_pasajero.getRowCount(); i++) {
            escribirArchivo.write(table_pasajero.getValueAt(i, 1)+"\t"+table_pasajero.getValueAt(i, 2)
                    +"\t"+table_pasajero.getValueAt(i, 3)+"\t"+table_pasajero.getValueAt(i, 4)+"\t"
                    +table_pasajero.getValueAt(i, 5)+"\n");
        }
        escribirArchivo.close();
        leerArchivo();
    }
    
    public void efectuarEdicion(){
        for (int i = 0; i < table_pasajero.getRowCount(); i++) {
            if(numeroEditar==Integer.parseInt((String)table_pasajero.getValueAt(i, 0))){
                table_pasajero.setValueAt(numeroEditar, i, 0);
                table_pasajero.setValueAt(txt_p_cedula.getText(), i, 1);
                table_pasajero.setValueAt(txt_p_nombre.getText(), i, 2);
                table_pasajero.setValueAt(txt_p_apellido.getText(), i, 3);
                table_pasajero.setValueAt(txt_p_pasajero.getText(), i, 4);
                table_pasajero.setValueAt(txt_p_edad.getText(), i, 5);
                break;
            }
        }
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_RegistroPasajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
     
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new GUI_RegistroPasajeros().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(GUI_RegistroPasajeros.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    private void btn_p_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_guardarActionPerformed
         if (!(txt_p_cedula.getText().equals("")||txt_p_nombre.getText().equals("")||txt_p_apellido.getText().equals("")||txt_p_pasajero.getText().equals("")||txt_p_edad.getText().equals(""))) {
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
            btn_p_nuevo.setEnabled(true);
            btn_p_guardar.setEnabled(false);
            btn_p_editar.setEnabled(false);
            btn_p_cancelar.setEnabled(false);
            btn_p_eliminar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON REQUERIDOS");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_p_guardarActionPerformed

    private void btn_p_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_salirActionPerformed
        // TODO add your handling code here:
        GUI_Principal b = new GUI_Principal();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_p_salirActionPerformed

    private void btn_p_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_editarActionPerformed
            opcionBoton = "Editar";
            HabilitarIngreso(true);
            btn_p_nuevo.setEnabled(false);
            btn_p_guardar.setEnabled(true);
            btn_p_editar.setEnabled(false);
            btn_p_cancelar.setEnabled(true);
            btn_p_eliminar.setEnabled(false);              // Boton eliminar pasajeros en tabla:
    }//GEN-LAST:event_btn_p_editarActionPerformed
   
    private void btn_p_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_nuevoActionPerformed
        HabilitarIngreso(true);
        limpiarCajasTexto();
        btn_p_nuevo.setEnabled(false);
        btn_p_guardar.setEnabled(true);
        btn_p_editar.setEnabled(false);
        btn_p_cancelar.setEnabled(true);
        btn_p_eliminar.setEnabled(false);
        txt_p_cedula.setFocusable(true);
        opcionBoton="Nuevo";       
    }//GEN-LAST:event_btn_p_nuevoActionPerformed

    private void btn_p_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_cancelarActionPerformed
        HabilitarIngreso(false);
        limpiarCajasTexto();
        btn_p_nuevo.setEnabled(true);
        btn_p_guardar.setEnabled(false);
        btn_p_editar.setEnabled(false);
        btn_p_cancelar.setEnabled(false);
        btn_p_eliminar.setEnabled(false);        // Carga los datos del archivo de texto con la base de datos de pasajeros:
        
    }//GEN-LAST:event_btn_p_cancelarActionPerformed

    private void btn_p_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_buscarActionPerformed
        String buscar = String.valueOf(txt_p_busca.getText());
        System.out.println("Comprobar cedula a buscar es: "+buscar);
        try {
            leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        String [][]datos = new String[table_pasajero.getRowCount()][6];
        for (int i = 0; i < table_pasajero.getRowCount(); i++) {
            for (int j = 0; j < 6; j++) {
                datos[i][j]=String.valueOf(table_pasajero.getValueAt(i, j)) ;
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) table_pasajero.getModel();
        limpiarTabla(modelo);
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][1].equals(buscar)){
                modelo.addRow(new Object[]{datos[i][0],datos[i][1],datos[i][2],datos[i][3],datos[i][4],datos[i][5]});
            }
        }            
    }//GEN-LAST:event_btn_p_buscarActionPerformed

    private void btn_p_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_actualizarActionPerformed
        try {
            leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(GUI_RegistroPasajeros.class.getName()).log(Level.SEVERE, null, ex);
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_p_actualizarActionPerformed

    private void btn_p_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_eliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "CONFIRME SI DESEA ELIMINAR EL PASAJERO SELECCIONADO", "ELIMINAR PASAJERO", JOptionPane.YES_NO_OPTION);
        if(respuesta == JOptionPane.YES_OPTION){
            DefaultTableModel modelo = (DefaultTableModel) table_pasajero.getModel();
            for (int i = 0; i < table_pasajero.getRowCount(); i++) {
                if(numeroEliminar==Integer.parseInt(String.valueOf(table_pasajero.getValueAt(i, 0)))){
                    modelo.removeRow(i);
                }
            }
            JOptionPane.showMessageDialog(null, "SE HA ELIMINADO REGISTRO CORRECTAMENTE");
            btn_p_editar.setEnabled(false);
            btn_p_eliminar.setEnabled(false);

            try {
                almacenarFicheroUsuario();
            } catch (IOException ex) {
                Logger.getLogger(GUI_RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("No se ha eliminado nada");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_p_eliminarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_p_actualizar;
    private javax.swing.JButton btn_p_buscar;
    private javax.swing.JButton btn_p_cancelar;
    private javax.swing.JButton btn_p_editar;
    private javax.swing.JButton btn_p_eliminar;
    private javax.swing.JButton btn_p_guardar;
    private javax.swing.JButton btn_p_nuevo;
    private javax.swing.JButton btn_p_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_pasajero;
    private javax.swing.JTextField txt_p_apellido;
    private javax.swing.JTextField txt_p_busca;
    private javax.swing.JTextField txt_p_cedula;
    private javax.swing.JTextField txt_p_edad;
    private javax.swing.JTextField txt_p_nombre;
    private javax.swing.JTextField txt_p_pasajero;
    // End of variables declaration//GEN-END:variables

    
}

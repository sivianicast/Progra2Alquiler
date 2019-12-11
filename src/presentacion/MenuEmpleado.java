/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import entidades.Empleado;
import entidades.EmpleadoAdmin;
import entidades.EmpleadoVentas;
import entidades.Seri;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author siviany
 */
public class MenuEmpleado extends javax.swing.JFrame {

    public static DefaultTableModel tabla = new DefaultTableModel();
    private boolean empleado;

    /**
     * Creates new form MenuEmpleado
     */
    public MenuEmpleado() {
        initComponents();
        setLocationRelativeTo(null);
        cargarTitulosColumas();
        cargarDatos();
        cargarDatosVentas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        horario = new javax.swing.JTextField();
        salario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contraseña = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        nuevoEmpleado = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        numeroReportes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        numeroVentas = new javax.swing.JTextField();
        volver = new javax.swing.JButton();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jScrollPane1.setViewportView(jScrollPane2);

        jLabel1.setText("Tipo de empleado");

        jLabel2.setText("Cedula");

        jLabel4.setText("Horario ");

        jLabel5.setText("Salario");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Administrador", "Ventas" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre");

        jLabel8.setText("contraseña");

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        nuevoEmpleado.setText("Nuevo Empleado");
        nuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoEmpleadoActionPerformed(evt);
            }
        });

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel9.setText("Numero reportes");

        numeroReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroReportesActionPerformed(evt);
            }
        });

        jLabel11.setText("Numero de ventas");

        volver.setText("volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6))
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7))))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(horario)
                                    .addComponent(nombre)
                                    .addComponent(cedula)
                                    .addComponent(jComboBox1, 0, 151, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(limpiar)
                                .addGap(18, 18, 18)
                                .addComponent(nuevoEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(eliminar)
                                .addGap(30, 30, 30)
                                .addComponent(modificar)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numeroReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(salario)
                                    .addComponent(contraseña)
                                    .addComponent(numeroVentas)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mostrar)
                                .addGap(18, 18, 18)
                                .addComponent(volver)))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(numeroReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(numeroVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(49, 49, 49)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiar)
                    .addComponent(nuevoEmpleado)
                    .addComponent(eliminar)
                    .addComponent(modificar)
                    .addComponent(mostrar)
                    .addComponent(volver))
                .addGap(79, 79, 79))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().equals("Administrador")) {
            empleado = true;
            this.numeroVentas.setEnabled(false);
            this.numeroReportes.setEnabled(true);
        } else {
            empleado = false;
            this.numeroReportes.setEnabled(false);
            this.numeroVentas.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void numeroReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroReportesActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        if (empleado) {
            Empleado admin = new EmpleadoAdmin();
            for (int i = 0; i < ((EmpleadoAdmin) admin).getListaEmpleadosAdmin().size(); i++) {
                if ((((EmpleadoAdmin) admin).getListaEmpleadosAdmin().get(i).getCedula() == Integer.parseInt(this.cedula.getText()))) {
                    nombre.setText(((EmpleadoAdmin) admin).getListaEmpleadosAdmin().get(i).getNombre());
                    horario.setText(((EmpleadoAdmin) admin).getListaEmpleadosAdmin().get(i).getHorario());
                    salario.setText(String.valueOf(((EmpleadoAdmin) admin).getListaEmpleadosAdmin().get(i).getSalario()));
                    contraseña.setText(String.valueOf(((EmpleadoAdmin) admin).getListaEmpleadosAdmin().get(i).getContraseña()));
                    numeroReportes.setText(String.valueOf(((EmpleadoAdmin) admin).getListaEmpleadosAdmin().get(i).getContraseña()));
                } else {
                    JOptionPane.showMessageDialog(null, "La Cedula indicada no existe");
                }
            }

        } else {
            EmpleadoVentas ventas = new EmpleadoVentas();
            for (int i = 0; i < ventas.getListaEmpleadosVentas().size(); i++) {
                if (ventas.getListaEmpleadosVentas().get(i).getCedula() == Integer.parseInt(this.cedula.getText())) {
                    nombre.setText(ventas.getListaEmpleadosVentas().get(i).getNombre());
                    horario.setText(ventas.getListaEmpleadosVentas().get(i).getHorario());
                    salario.setText(String.valueOf(ventas.getListaEmpleadosVentas().get(i).getSalario()));
                    contraseña.setText(String.valueOf(ventas.getListaEmpleadosVentas().get(i).getContraseña()));
                    numeroVentas.setText(String.valueOf(ventas.getListaEmpleadosVentas().get(i).getContraseña()));
                }
            }
        }
        tabla.setColumnCount(0); //para limpiar los datos de la tabla columnas
        tabla.setRowCount(0); //para limpiar los datos de la tabla filas
        cargarTitulosColumas();
        cargarDatos();
        cargarDatosVentas();
    }//GEN-LAST:event_mostrarActionPerformed

    private void nuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoEmpleadoActionPerformed
        if (empleado) {
            EmpleadoAdmin admin = new EmpleadoAdmin();
            admin.setCedula(Integer.parseInt(this.cedula.getText()));
            admin.setNombre(this.nombre.getText());
            admin.setHorario(this.horario.getText());
            admin.setSalario(Double.parseDouble(this.salario.getText()));
            admin.setContraseña(this.contraseña.getText());
            admin.setNumeroReportes(Integer.parseInt(this.numeroReportes.getText()));
            admin.setTipoEmpleado((String) this.jComboBox1.getSelectedItem());
            admin.agregarDatosLista(admin);
        } else {
            EmpleadoVentas ventas = new EmpleadoVentas();
            ventas.setCedula(Integer.parseInt(this.cedula.getText()));
            ventas.setNombre(this.nombre.getText());
            ventas.setHorario(this.horario.getText());
            ventas.setSalario(Double.parseDouble(this.salario.getText()));
            ventas.setContraseña(this.contraseña.getText());
            ventas.setNumeroVentas(Integer.parseInt(this.numeroVentas.getText()));
            ventas.setTipoEmpleado((String) this.jComboBox1.getSelectedItem());
            ventas.agregarDatosLista(ventas);
        }
        tabla.setColumnCount(0); //para limpiar los datos de la tabla columnas
        tabla.setRowCount(0); //para limpiar los datos de la tabla filas
        cargarTitulosColumas();
        cargarDatos();
        cargarDatosVentas();
    }//GEN-LAST:event_nuevoEmpleadoActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        try {
            boolean modificar = true;
            if (empleado) {
                EmpleadoAdmin admin = new EmpleadoAdmin();
                for (int i = 0; i < admin.getListaEmpleadosAdmin().size(); i++) {
                    if (admin.getListaEmpleadosAdmin().get(i).getCedula() == Integer.parseInt(this.cedula.getText())) {
                        ArrayList<String> lista = new ArrayList<>();
                        lista.add((String) this.jComboBox1.getSelectedItem());
                        lista.add(this.cedula.getText());
                        lista.add(this.nombre.getText());
                        lista.add(this.horario.getText());
                        lista.add(this.salario.getText());
                        lista.add(this.contraseña.getText());
                        lista.add(this.numeroReportes.getText());
                        admin.modificarDatosLista(lista);
                        modificar = false;
                    }
                }
            } else {
                EmpleadoVentas ventas = new EmpleadoVentas();
                for (int i = 0; i < ventas.getListaEmpleadosVentas().size(); i++) {
                    if (ventas.getListaEmpleadosVentas().get(i).getCedula() == Integer.parseInt(this.cedula.getText())) {
                        ArrayList<String> lista = new ArrayList<>();
                        lista.add((String) this.jComboBox1.getSelectedItem());
                        lista.add(this.cedula.getText());
                        lista.add(this.nombre.getText());
                        lista.add(this.horario.getText());
                        lista.add(this.salario.getText());
                        lista.add(this.contraseña.getText());
                        lista.add(this.numeroVentas.getText());
                        ventas.modificarDatosLista(lista);
                        modificar = false;
                    }
                }
            }
            if (modificar) {
                JOptionPane.showMessageDialog(null, "La id no existe");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Datos vacios");
        }
        tabla.setColumnCount(0); //para limpiar los datos de la tabla columnas
        tabla.setRowCount(0); //para limpiar los datos de la tabla filas
        cargarTitulosColumas();
        cargarDatos();
        cargarDatosVentas();
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        try {
            boolean elimina = true;
            if (empleado) {
                EmpleadoAdmin admin = new EmpleadoAdmin();
                admin.eliminarDatosLista(Integer.parseInt(this.cedula.getText()));
            } else {
                EmpleadoVentas ventas = new EmpleadoVentas();
                ventas.eliminarDatosLista(Integer.parseInt(this.cedula.getText()));
            }
            tabla.setColumnCount(0); //para limpiar los datos de la tabla columnas
            tabla.setRowCount(0); //para limpiar los datos de la tabla filas
            cargarTitulosColumas();
            cargarDatos();
            cargarDatosVentas();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Id vacia");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        EmpleadoAdmin admin = new EmpleadoAdmin();
        EmpleadoVentas ventas = new EmpleadoVentas();
        Seri x = new Seri();
        x.agregarTxt(admin.getListaEmpleadosAdmin(), "administradores.txt");
        x.agregarTxt(ventas.getListaEmpleadosVentas(), "vendedores.txt");
        tabla.setColumnCount(0); //para limpiar los datos de la tabla columnas
        tabla.setRowCount(0); //para limpiar los datos de la tabla filas
        Principal principal = new Principal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField contraseña;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField horario;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificar;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevoEmpleado;
    private javax.swing.JTextField numeroReportes;
    private javax.swing.JTextField numeroVentas;
    private javax.swing.JTextField salario;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
     public void cargarTitulosColumas() {
        tabla.addColumn("Tipo_Empleado");
        tabla.addColumn("Cedula");
        tabla.addColumn("Nombre");
        tabla.addColumn("Horario");
        tabla.addColumn("Salario");
        tabla.addColumn("Contraseña");
        tabla.addColumn("Reportes");
        tabla.addColumn("Ventas");
        this.jTable1.setModel(tabla);
    }

    public void cargarDatos() {
        EmpleadoAdmin admin = new EmpleadoAdmin();
        for (int i = 0; i < admin.getListaEmpleadosAdmin().size(); i++) {
            String datos[] = new String[7];
            datos[0] = admin.getListaEmpleadosAdmin().get(i).getTipoEmpleado();
            datos[1] = Integer.toString(admin.getListaEmpleadosAdmin().get(i).getCedula());
            datos[2] = (admin.getListaEmpleadosAdmin().get(i).getNombre());
            datos[3] = (admin.getListaEmpleadosAdmin().get(i).getHorario());
            datos[4] = String.valueOf(admin.getListaEmpleadosAdmin().get(i).getSalario());
            datos[5] = (admin.getListaEmpleadosAdmin().get(i).getContraseña());
            datos[6] = Integer.toString(admin.getListaEmpleadosAdmin().get(i).getNumeroReportes());
            tabla.addRow(datos);
        }
    }

    public void cargarDatosVentas() {
        EmpleadoVentas ventas = new EmpleadoVentas();
        for (int i = 0; i < ventas.getListaEmpleadosVentas().size(); i++) {
            String datos[] = new String[8];
            datos[0] = ventas.getListaEmpleadosVentas().get(i).getTipoEmpleado();
            datos[1] = Integer.toString(ventas.getListaEmpleadosVentas().get(i).getCedula());
            datos[2] = (ventas.getListaEmpleadosVentas().get(i).getNombre());
            datos[3] = (ventas.getListaEmpleadosVentas().get(i).getHorario());
            datos[4] = String.valueOf(ventas.getListaEmpleadosVentas().get(i).getSalario());
            datos[5] = (ventas.getListaEmpleadosVentas().get(i).getContraseña());
            datos[6] = "";
            datos[7] = Integer.toString(ventas.getListaEmpleadosVentas().get(i).getNumeroVentas());
            tabla.addRow(datos);
        }
    }

    public void limpiar() {
        this.jComboBox1.setSelectedIndex(0);
        this.cedula.setText(null);
        this.nombre.setText(null);
        this.horario.setText(null);
        this.salario.setText(null);
        this.contraseña.setText(null);
        this.numeroReportes.setText(null);
        this.numeroVentas.setText(null);
    }
}

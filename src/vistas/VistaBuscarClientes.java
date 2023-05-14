/**
 * @author Grupo 11
 */
package vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.Cliente;

public class VistaBuscarClientes extends javax.swing.JInternalFrame {

    public VistaBuscarClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_ciudad = new javax.swing.JLabel();
        label_titulo = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        label_icono = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label_subtitulo1 = new javax.swing.JLabel();
        tf_buscarClientes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_BuscarXCiudad = new javax.swing.JTable();

        setBackground(new java.awt.Color(176, 218, 255));

        label_ciudad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_ciudad.setText("Ciudad:");

        label_titulo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        label_titulo.setText("Buscar Clientes");

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        label_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vistas/buscar.png"))); // NOI18N

        label_subtitulo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_subtitulo1.setText("Buscar clientes por ciudad");

        jtable_BuscarXCiudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "APELLIDO", "NOMBRE", "CIUDAD", "DIRECCION", "TELEFONO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable_BuscarXCiudad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_subtitulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label_icono))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_ciudad)
                                .addGap(68, 68, 68)
                                .addComponent(tf_buscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(576, 576, 576)
                                .addComponent(btn_cerrar)))))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(label_icono))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(label_titulo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_subtitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_ciudad)
                    .addComponent(btn_buscar)
                    .addComponent(tf_buscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_cerrar)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String ciudad = tf_buscarClientes.getText();
        int dni;
        String nombre, lastName, city, direccion, telefono;
        DefaultTableModel modeloDefault = new DefaultTableModel(new String[]{"DNI", "APELLIDO", "NOMBRE", "CIUDAD",
            "DIRECCION", "TELEFONO"}, Menu.miDirectorio.getRegistros());

        DefaultTableModel tabla = (DefaultTableModel) jtable_BuscarXCiudad.getModel();
        
        if (!ciudad.isEmpty()) {
            ArrayList<Cliente> arrayClientes = (Menu.miDirectorio.buscarClientes(ciudad));
          
            for (int j = 0; j < arrayClientes.size(); j++) {
                dni = arrayClientes.get(j).getDni();
                nombre = arrayClientes.get(j).getNombre();
                lastName = arrayClientes.get(j).getApellido();
                city = arrayClientes.get(j).getCiudad();
                direccion = arrayClientes.get(j).getDireccion();
                telefono = arrayClientes.get(j).getTelefono();
                tabla.addRow(new Object[]{dni, lastName, nombre, city, direccion, telefono}); //muestra
                
            }
           
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar una ciudad para realizar la busqueda.");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtable_BuscarXCiudad;
    private javax.swing.JLabel label_ciudad;
    private javax.swing.JLabel label_icono;
    private javax.swing.JLabel label_subtitulo1;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JTextField tf_buscarClientes;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTP5.vistas;

import LabTP5.entidades.Producto;
import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Consultas extends javax.swing.JInternalFrame {
// ArrayList de productos
    private ArrayList<Producto> productos;
    private DefaultTableModel modelo = new DefaultTableModel();


    public Consultas(ArrayList<Producto> productos) {
        initComponents();
        this.productos = productos;
        armarCabecera();
        
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbBuscarPorCodigo = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Consulta por codigo");

        jLabel2.setText("Codigo");

        jtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCodigoFocusLost(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jbBuscarPorCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        jbBuscarPorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPorCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jbBuscarPorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(106, 106, 106))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbBuscarPorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCodigoFocusLost

        borrarFilasTabla();
        if (validaEntero(jtCodigo.getText())){
            String codigoTexto = jtCodigo.getText(); // Obtener el texto del JTextField
            int codigoABuscar = Integer.parseInt(codigoTexto); // Convertir el texto a un número entero
            System.out.println("aqui estoy");
            for (Producto prod : productos) {

                if (prod.getCodigo() == codigoABuscar) {

                    Vector renglon = new Vector<>();
                    renglon.add(prod.getCodigo());
                    renglon.add(prod.getDescripcion());
                    renglon.add(prod.getPrecio());
                    renglon.add(prod.getCategoria());
                    modelo.addRow(renglon);

                }
            }
        }
    }//GEN-LAST:event_jtCodigoFocusLost

    private void jbBuscarPorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPorCodigoActionPerformed
        // Obtener el código ingresado en el campo de texto
    String codigoTexto = jtCodigo.getText();
    
    // Verificar si el código ingresado es un número entero válido
    if (validaEntero(codigoTexto)) {
        int codigoABuscar = Integer.parseInt(codigoTexto); // Convertir el texto a un número entero
        
        // Borrar las filas existentes en la tabla
        borrarFilasTabla();

        boolean productoEncontrado = false;
        // Recorrer la lista de productos para buscar el que tenga el código ingresado
        for (Producto prod : productos) {
            if (prod.getCodigo() == codigoABuscar) {
                Vector renglon = new Vector<>();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getCategoria());
                modelo.addRow(renglon); // Agregar el producto encontrado a la tabla
                productoEncontrado = true;
                break; // Terminar el bucle ya que se encontró el producto
            }
        }
        
        // Si no se encontró ningún producto con el código ingresado, mostrar un mensaje
        if (!productoEncontrado) {
            JOptionPane.showMessageDialog(this, "Producto no encontrado");
        }
    }
    }//GEN-LAST:event_jbBuscarPorCodigoActionPerformed
 private boolean validaEntero(String texto) {
    if (!texto.matches("^\\d+$")) {
        JOptionPane.showMessageDialog(this, "Deberás ingresar un número válido.");
        return false;
    }
    return true;
}


    private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoría");
        jtTabla.setModel(modelo);

    }

    public void borrarFilasTabla() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarPorCodigo;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}

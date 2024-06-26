/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTP5.vistas;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import LabTP5.entidades.Producto;
import java.util.Vector;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class AltaProductos extends javax.swing.JInternalFrame {

    private ArrayList<Producto> productos;
    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form AltaProductos
     */
    public AltaProductos(ArrayList<Producto> productos) {
        initComponents();
        this.productos = productos;
        armarCabecera();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcCategorias = new javax.swing.JComboBox<>();
        jbGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("De Todo SA: Productos");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Gestión de Productos");

        jLabel2.setText("Código:");

        jtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCodigoFocusLost(evt);
            }
        });

        jLabel3.setText("Descripción:");

        jLabel4.setText("Precio:");

        jtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPrecioFocusLost(evt);
            }
        });

        jLabel5.setText("Stock:");

        jtStock.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtStockFocusLost(evt);
            }
        });

        jLabel6.setText("Cateogria:");

        jcCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria", "Electronica", "Ropa", "Alimentos" }));

        jbGuardar.setText("Agregar Producto");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(jbGuardar)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int codigo;
        String descripcion;
        double precio;
        int stock;
        String categoria;
        //Evaluo
        if (jtCodigo.getText().isEmpty() || jtDescripcion.getText().isEmpty()
                || jtPrecio.getText().isEmpty() || jtStock.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Hay campos sin completar");
            return;
        }

        codigo = Integer.parseInt(jtCodigo.getText());
        descripcion = jtDescripcion.getText();
        precio = Double.parseDouble(jtPrecio.getText());
        stock = Integer.parseInt(jtStock.getText());
        categoria = (String) jcCategorias.getSelectedItem();

        Producto prod = new Producto(codigo, descripcion, precio, stock, categoria);
        productos.add(prod);
       
        Vector renglon = new Vector<>();
        renglon.add(codigo);
        renglon.add(descripcion);
        renglon.add(precio);
        renglon.add(stock);
        renglon.add(categoria);
        modelo.addRow(renglon);
        System.out.println(renglon);
        JOptionPane.showMessageDialog(this, "Producto Guardado");


    }//GEN-LAST:event_jbGuardarActionPerformed
    private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Categoria");
        jtTabla.setModel(modelo);

    }

    public void borrarFilasTabla() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    private void jtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCodigoFocusLost
        // TODO add your handling code here:
        Pattern p = Pattern.compile("\\d{1,4}");
        Matcher m = p.matcher(jtCodigo.getText());
        if (!m.matches()) {
            JOptionPane.showMessageDialog(this, "Ustede debe ingresar un nro en el campo Código");
            jtCodigo.requestFocus();
            return;
        }
    }//GEN-LAST:event_jtCodigoFocusLost

    private void jtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPrecioFocusLost
        // TODO add your handling code here:
        Pattern p = Pattern.compile("^[+]?[0-9]*\\.?[0-9]+(?:[eE][-+]?[0-9]+)?$");
        Matcher m = p.matcher(jtPrecio.getText());
        if (!m.matches()) {
            JOptionPane.showMessageDialog(this, "Ustede debe ingresar un nro en el campo Precio");
            jtPrecio.requestFocus();
            return;
        }
    }//GEN-LAST:event_jtPrecioFocusLost

    private void jtStockFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtStockFocusLost
        // TODO add your handling code here:

        Pattern p = Pattern.compile("\\d{1,4}");
        Matcher m = p.matcher(jtStock.getText());
        if (!m.matches()) {
            JOptionPane.showMessageDialog(this, "Ustede debe ingresar un nro en el campo Stock");
            jtStock.requestFocus();
            return;
        }
    }//GEN-LAST:event_jtStockFocusLost
private void jtDescripcionFocusLost(java.awt.event.FocusEvent evt) {                                   
    // Validación para la descripción
    if (!jtDescripcion.getText().matches("^[a-zA-Z0-9\\s]+$")) {
        JOptionPane.showMessageDialog(this, "Debe ingresar una descripción válida.");
        jtDescripcion.requestFocus();
    }
}  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JComboBox<String> jcCategorias;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables


}

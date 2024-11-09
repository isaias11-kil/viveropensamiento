/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.viveropensamiento;

import com.mycompany.viveropensamiento.conexionbd;
import combox.combobox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.detalleventa;

/**
 *
 * @author lopis
 */
public class factura extends javax.swing.JFrame {
    
    //modelo de datos 
    private DefaultTableModel modelodatosproductos;
    
    //declaral una lista para el detalle de venta de los productos
    ArrayList<detalleventa>listaProductos = new ArrayList<>();
    private detalleventa producto;
    
    private String idproducto ;
     private String nombre = "";
    private int cantidadproductoBBDD = 0;
     private double preciounitario = 0.0;
    
    
    private int cantidad = 0;
    private double subtotal = 0.0;
    private double totalpagar= 0.0;
    
    private int auxidDetalle = 1;//id del detalle de venta
    

   combobox rs= new combobox();
    public factura() {
        
        initComponents();
         this.setLocationRelativeTo(this);
        rs.rellenarcombo("producto", "nombreProducto", jComboBox1);
        this.inicializartablaproducto();
    }
    
    //metodo para inicializar la tabla de los productos
    private void inicializartablaproducto(){
        modelodatosproductos = new DefaultTableModel();
        modelodatosproductos.addColumn("N");
        modelodatosproductos.addColumn("Descriccion");
        modelodatosproductos.addColumn("Cantidad");
        modelodatosproductos.addColumn("Pecio unitario");
        modelodatosproductos.addColumn("Subtotal");
        modelodatosproductos.addColumn("Total a pagar");
        modelodatosproductos.addColumn("Accion");
        //agregar datos del modelo a la tabla
        this.jTabla.setModel(modelodatosproductos);
    }
    
    //metodo para prensentar informacion de la tabla 
    private void listatablaproducto(){
        this.modelodatosproductos.setRowCount(listaProductos.size());
        for(int i = 0; i< listaProductos.size(); i++){
            this.modelodatosproductos.setValueAt(i + 1,i,0);
                        this.modelodatosproductos.setValueAt(listaProductos.get(i).getIdproducto(),i,1);
                        this.modelodatosproductos.setValueAt(listaProductos.get(i).getCantidad(),i,2);
                        this.modelodatosproductos.setValueAt(listaProductos.get(i).getPreciounitario(),i,3);
                        this.modelodatosproductos.setValueAt(listaProductos.get(i).getSubtotal(),i,4);
                        this.modelodatosproductos.setValueAt(listaProductos.get(i).getTotalpagar(),i,5);
                        this.modelodatosproductos.setValueAt("eliminar",i,6);
        }
        //añadir al jtable
        jTabla.setModel(modelodatosproductos);
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtcantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIVERO PENSAMIENTO");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Peoducto");

        jLabel5.setText("Cantidad");

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "descrición", "precio", "cantidad", "total"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jLabel2.setText("Direccion:");

        jLabel1.setText("Nombre cliente:");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha:");

        jLabel6.setBackground(new java.awt.Color(153, 255, 153));
        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 204, 0));
        jLabel6.setText("VIVERO PENSAMIENTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(122, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String combo = this.jComboBox1.getSelectedItem().toString();
        //validar que seleccione un producto
        if (combo.equalsIgnoreCase("seleccione:")){
            JOptionPane.showMessageDialog(null,"Seleccione un producto");
        }else{
            //validar que ingrese una cantidad
            if(!jtcantidad.getText().isEmpty()){
                //validar que el usuario no ingrese caracteres no numericos 
                boolean validacion = validar(jtcantidad.getText());
                if(validacion==true){
                    //validar que la cantida mayor a 0
                    if(Integer.parseInt(jtcantidad.getText())>0){
                        cantidad = Integer.parseInt(jtcantidad.getText());
                        //ejecutar metodo para obtener datos del producto
                        this.DatosDelProducto();
                        //validar la cantidad de productos seleccionados no sea mayor al stock de la base de datos
                        if (cantidad <= cantidadproductoBBDD){
                            subtotal= preciounitario * cantidad;
                            totalpagar = subtotal;
                            
                            //redondear decimales
                            subtotal = (double) Math.round(subtotal*100)/100;
                            
                            //se crea un nuevo producto
                            producto = new detalleventa(auxidDetalle,1,idproducto,nombre,Integer.parseInt(jtcantidad.getText()),preciounitario,subtotal,totalpagar,1);
                            
                            //añadir a la lista 
                            listaProductos.add(producto);
                            JOptionPane.showMessageDialog(null,"producto agregado");
                            auxidDetalle++;
                            jtcantidad.setText("");
                            //volver a cargar combo productos
                           //this.combobox.rellenarcombo();
                        }else{
                            JOptionPane.showMessageDialog(null,"la cantidad supera el stock");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"la cantidad  no puede ser cero, ni getivo");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"el la cantidad no se admiten caracteres no numericos");
                }
                
            }else{
                JOptionPane.showMessageDialog(null,"Igrese la cantidad del producto");
            }
            this.listatablaproducto();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jtcantidad;
    // End of variables declaration//GEN-END:variables

//metodo para validar que el usuario no ingrese caracteres no numericos
    private boolean validar(String valor){
        try{
            int num = Integer.parseInt(valor);
            return true;
            
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    //metodo para mostrar los datos del producto seleccionado
    private void DatosDelProducto(){
        
      
        
        try {
            String sql = "SELECT * FROM producto WHERE nombreProducto = '" + this.jComboBox1.getSelectedItem()+ "'";
            Connection con = conexionbd.conectar();
            Statement st;
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                idproducto = rs.getString("nombreProducto");
               // nombre = rs.getString("nombre");
                cantidadproductoBBDD = rs.getInt("cantidadProducto");
                preciounitario = rs.getDouble("precioUnitario");
                 
                
            }
            
        }catch(SQLException e){
            System.out.println("error al obtener datos dek producto, " + e);
        }
        
    }
}

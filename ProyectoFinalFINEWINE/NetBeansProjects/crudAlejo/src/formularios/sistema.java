/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import conexionSQL.conexionSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Alejandro Diaz Ortiz
 */
public class sistema extends javax.swing.JFrame {
    conexionSQL cc=new conexionSQL();
    Connection con=cc.conexion();
    /**
     * Creates new form sistema
     */
    public sistema() {
        initComponents();
        mostrarDatos("");
        
    }
    public void limpiarCajas(){
        cbTipodocumento.setSelectedItem(null);
        txtDocumento.setText(null);
        txtNombre.setText(null);
        cbDireccion.setText(null);
        txtCelular.setText(null);
    }
   public void mostrarDatos(String valor){
       DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("TIPO");
        modelo.addColumn("DOCUMENTO");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        tabla.setModel(modelo);
        String sql="SELECT * FROM cliente WHERE CONCAT (nombre,' ',direccion) LIKE '%"+valor+"%'";
       String[] registros=new String[7];
       Statement st;
      try{
            
            st=(Statement) con.createStatement();
                    
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                registros[0]=rs.getString(1);
                registros[1]=rs.getString(2);
                registros[2]=rs.getString(3);
                registros[3]=rs.getString(4);
                registros[4]=rs.getString(5);
            
                modelo.addRow(registros);
            }
            
            tabla.setModel(modelo);
            
        }catch (SQLException e){
            System.err.println("Error en el llenado de la tabla");
            JOptionPane.showMessageDialog(null,"Error en el llenado de la tabla");
        }
    }
   public void actualizarDatos(){
       try {
           String SQL="update cliente set tipo_doc=?,documento=?,nombre=?,direccion=?,celular=? where documento=?";
           
           int filaSeleccionada=tabla.getSelectedRow();
           String ref=(String)tabla.getValueAt(filaSeleccionada, 1);
           
           java.sql.PreparedStatement pst=con.prepareStatement(SQL);
           int seleccionado=cbTipodocumento.getSelectedIndex();
           pst.setString(1, cbTipodocumento.getItemAt(seleccionado));
           
           pst.setDouble(2, Double.parseDouble(txtDocumento.getText()));
           pst.setString(3, txtNombre.getText());
           
           pst.setString(4, cbDireccion.getText());
           pst.setDouble(5, Double.parseDouble(txtCelular.getText()));
           pst.setString(6, ref);
           pst.execute();
           JOptionPane.showMessageDialog(null,"Datos actualizados correctamente");
           
           
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error de actualizacion"+e.getMessage());
       }
   }
   public void eliminarRegistro(){
       int filaSeleccionada=tabla.getSelectedRow();
       Statement st;
       try {
           String SQL="delete from cliente where documento="+tabla.getValueAt(filaSeleccionada, 1);
           st=(Statement) con.createStatement();
           int n=st.executeUpdate(SQL);
           if(n>=0){
               JOptionPane.showMessageDialog(null, "Registro eliminado");
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error al eliminar registro"+e.getMessage());
       }
   }
   public void filtrarDatos(String valor){
       DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("TIPO");
        modelo.addColumn("DOCUMENTO");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");
        tabla.setModel(modelo);
       
       String SQL="SELECT * FROM cliente WHERE CONCAT (nombre,' ',direccion) LIKE '%"+valor+"%'";
       String[] registros=new String[7];
       Statement st;
       try {
           st=(Statement) con.createStatement();
           ResultSet rs=st.executeQuery(SQL);
           
           while (rs.next()){
               registros[0]=rs.getString(1);
               registros[1]=rs.getString(2);
               registros[2]=rs.getString(3);
               registros[3]=rs.getString(4);
               registros[4]=rs.getString(5);
               modelo.addRow(registros);
           }
           tabla.setModel(modelo);
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error de registro"+e.getMessage());
       }
   }
    

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cbDireccion = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        cbTipodocumento = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setText("Tipo de documento");

        jLabel2.setText("Documento");

        jLabel3.setText("Nombre");

        jLabel4.setText("Direccion");

        jLabel5.setText("Celular");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cbTipodocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "CE", "TI", " " }));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDocumento)
                            .addComponent(txtNombre)
                            .addComponent(cbDireccion)
                            .addComponent(txtCelular)
                            .addComponent(cbTipodocumento, 0, 110, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbTipodocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jLabel6.setText("Buscar :");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TIPO", "DOCUMENTO", "NOMBRES", "DIRECCION", "TELEFONO"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    actualizarDatos();
    limpiarCajas();
    mostrarDatos("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    insertarDatos(); 
    limpiarCajas();
    mostrarDatos("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     limpiarCajas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
    int filaSeleccionada=tabla.rowAtPoint(evt.getPoint());
    cbTipodocumento.setSelectedItem(tabla.getValueAt(filaSeleccionada,0));
    txtDocumento.setText(tabla.getValueAt(filaSeleccionada,1).toString());
    txtNombre.setText(tabla.getValueAt(filaSeleccionada,2).toString());
    cbDireccion.setText(tabla.getValueAt(filaSeleccionada,3).toString());
    txtCelular.setText(tabla.getValueAt(filaSeleccionada,4).toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    eliminarRegistro();
    mostrarDatos("");
    limpiarCajas();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
    filtrarDatos(txtBuscar.getText());
    mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased
    public void insertarDatos(){
        try{
            String SQL="INSERT INTO cliente (tipo_doc,documento,nombre,direccion,celular) VALUES (?,?,?,?,?)";
            java.sql.PreparedStatement pst=con.prepareStatement(SQL);
            int seleccionado=cbTipodocumento.getSelectedIndex();
            pst.setString(1, cbTipodocumento.getItemAt(seleccionado));
            
            pst.setDouble(2, Double.parseDouble(txtDocumento.getText()));
            pst.setString(3, txtNombre.getText());
            
            pst.setString(4, cbDireccion.getText());
            pst.setDouble(5, Double.parseDouble(txtCelular.getText()));
            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Datos registrados correctamente");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error de registro"+e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cbDireccion;
    private javax.swing.JComboBox<String> cbTipodocumento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

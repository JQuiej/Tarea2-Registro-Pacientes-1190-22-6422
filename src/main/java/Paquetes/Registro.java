/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquetes;

import BD.conexion;
import Datos.datosPacientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Quiej
 */
public class Registro extends javax.swing.JFrame {

    datosPacientes datosPacientes;
    public Registro() {
        initComponents();
        datosPacientes = new datosPacientes();
        //inicializando conexion en la base de datos
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        dpi = new javax.swing.JTextField();
        apellidoP = new javax.swing.JTextField();
        apellidoM = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        verPacientes = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        anio = new javax.swing.JComboBox<>();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NOMBRES:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, 40));

        jLabel3.setText("APELLIDO MATERNO: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 40));

        jLabel4.setText("APELLIDO PATERNO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, 40));

        jLabel5.setText("No. DPI:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel6.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, 40));

        jLabel7.setText("GENERO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, 40));

        jLabel8.setText("DIRECION:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, 40));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 220, 30));

        dpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dpiActionPerformed(evt);
            }
        });
        getContentPane().add(dpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 220, 30));
        getContentPane().add(apellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 220, 30));
        getContentPane().add(apellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 220, 30));
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 220, 30));
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 220, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE PACIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        verPacientes.setText("VER PACIENTES");
        verPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(verPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 130, 30));

        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 100, 30));

        anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929",
            "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939",
            "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949",
            "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959",
            "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
            "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979",
            "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
            "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
            "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
            "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
            "2020", "2021", "2022", "2023", "2024" }));
getContentPane().add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, 30));

dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
    "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
    "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
    "31" }));
    getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, 30));

    mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, 30));

jLabel9.setText("EDAD:");
getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, 40));
getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 220, 30));

setSize(new java.awt.Dimension(845, 549));
setLocationRelativeTo(null);
}// </editor-fold>//GEN-END:initComponents

    private void dpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dpiActionPerformed

    private void verPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPacientesActionPerformed
        new verPacientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_verPacientesActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        datosPacientes.setDpi(Double.parseDouble(dpi.getText()));
        datosPacientes.setNombre(nombre.getText());
        datosPacientes.setApellidos(apellidoP.getText()+ " " + apellidoM.getText());
        datosPacientes.setFechaN(dia.getSelectedItem()+ "/" + mes.getSelectedItem()
        + "/" + anio.getSelectedItem());
        datosPacientes.setEdad(edad.getText());
        datosPacientes.setGenero(genero.getText());
        datosPacientes.setDireccion(direccion.getText());
        
        conexion conexion = new conexion();
        Connection CONEXION = conexion.connectarmysql();
        
                    try {
            String SQL = "INSERT INTO pacientes (dpi, nombre, apellidos, nacimiento, edad, genero, direccion)"
            +"VALUES (?, ?, ?, ?, ?, ?, ?)"
            +"ON DUPLICATE KEY UPDATE "
            +"dpi = VALUES(dpi)," 
            +" nombre = VALUES(nombre), "
            +"apellidos = VALUES(apellidos), "
            +"nacimiento = VALUES(nacimiento)," 
            +" edad = VALUES(edad), "
            +" genero = VALUES(genero), "
            +" direccion = VALUES(direccion);";
           
                     PreparedStatement statement = CONEXION.prepareStatement(SQL);
    
                       // Setea los valores de los parámetros
                        statement.setDouble(1, datosPacientes.getDpi());
                        statement.setString(2, datosPacientes.getNombre());
                        statement.setString(3, datosPacientes.getApellidos());
                        statement.setString(4, datosPacientes.getFechaN());
                        statement.setString(5, datosPacientes.getEdad());
                        statement.setString(6, datosPacientes.getGenero());
                        statement.setString(7, datosPacientes.getDireccion());
                        
                        // Parámetros para la cláusula WHERE NOT EXISTS
                        statement.setDouble(1, datosPacientes.getDpi());
                        statement.setString(2, datosPacientes.getNombre());
                        statement.setString(3, datosPacientes.getApellidos());
                        statement.setString(4, datosPacientes.getFechaN());
                        statement.setString(5, datosPacientes.getEdad());
                        statement.setString(6, datosPacientes.getGenero());
                        statement.setString(7, datosPacientes.getDireccion());

                int filasInsertadas = statement.executeUpdate(); // Ejecuta el INSERT condicional
    
                     if (filasInsertadas > 0) {
                         System.out.println("Insertado: " + filasInsertadas);
                         lanzarMensaje("Datos guardados con éxito");
                   } else {
                          System.out.println("Los datos ya existen en la base de datos, no se insertaron.");
                          lanzarMensaje("Los datos ya existen en la base de datos, no se insertaron.");
                      }
    
                     CONEXION.close();
                     CONEXION = null;
                     conexion = null;
              } catch (SQLException ex) {
                   Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                  lanzarMensaje("Error al Ingresar datos del Paciente: " + ex.getMessage());
            }
           
    }//GEN-LAST:event_guardarActionPerformed

    private void lanzarMensaje(String pMensaje) {
        JOptionPane.showMessageDialog(null, pMensaje);
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anio;
    private javax.swing.JTextField apellidoM;
    private javax.swing.JTextField apellidoP;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField dpi;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField genero;
    private javax.swing.JButton guardar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton verPacientes;
    // End of variables declaration//GEN-END:variables
}

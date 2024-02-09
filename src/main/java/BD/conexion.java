/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Quiej
 */
public class conexion {
    
    String usu = "root";
    String pass = "admin";
    
    String Co = "jdbc:mysql://localhost:3306/registro";
    
        public Connection connectarmysql() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(Co, usu, pass);
            System.out.println("Conexion Satisfactoria.");
            
        } catch (Exception e) {
            System.out.println("Conexion Fallida.");
            System.out.println(e.getMessage());
        }
        return conn;
    } 
}

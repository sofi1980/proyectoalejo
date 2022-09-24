/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

/**
 *
 * @author Alejandro Diaz Ortiz
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class conexionSQL {
    
    java.sql.Connection cn;
    
    public java.sql.Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    cn=DriverManager.getConnection("jdbc:mysql://localhost/bd1","root","");
                    System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
    
    
}

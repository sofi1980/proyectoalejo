/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Alejandro Diaz Ortiz
 */
public class Conectar {
    
    Connection cn;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
                    cn=DriverManager.getConnection("jdbc:mysql://localhost/bd","root","");
                    System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
    
    
}

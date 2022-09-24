/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase1;


import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Principal {
        public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        Clase1 op= new Clase1();
        int res=op.factorial(numero);
        op.mostrarDatos(res);
        }
        
}

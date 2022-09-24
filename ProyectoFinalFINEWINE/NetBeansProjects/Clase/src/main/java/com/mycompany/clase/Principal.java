/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Principal {
        public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor uno: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor dos: "));
        
        Clase op= new Clase();
        int suma=op.sumar(n1,n2);
        int resta=op.restar(n1,n2);
        int multi=op.multiplicar(n1,n2);
        int divi=op.dividir(n1,n2);
        int resi=op.dividir(n1,n2);
        op.mostrarDatos(suma,resta,multi,divi,resi);
}
}
             

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clase1;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class Clase1 {


   public static int factorial (int numero){
        int res=numero;
        for(int cont=(numero-1);cont>0;cont--){
            res=res*cont;
        }
        return res;
    }
   public void mostrarDatos(int res){
        System.out.println("El factorial es: "+ res);
   }
}


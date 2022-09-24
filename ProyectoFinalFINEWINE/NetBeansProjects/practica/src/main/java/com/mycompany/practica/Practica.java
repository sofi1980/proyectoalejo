/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica;

/**
 *
 * @author SENA
 */
public class Practica {

    public static void main(String[] args) {
        int [] datos= new int [60];
        int suma=0;
        double div;
        for(int i=0; i<datos.length; i++){
            
            datos[i]=i+1;
            suma+=datos[i];
        System.out.println(datos[i]);   
        }
        div=suma/60; 
        
         System.out.println(suma);
         System.out.println(div);
         
    }
}

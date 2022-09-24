/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto;

/**
 *
 * @author SENA
 */
public class Proyecto {
    public int sumar(int numero1, int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    public int restar(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    public int multiplicar(int numero1, int numero2){
        int multi=numero1*numero2;
        return multi;
    }
    public int dividir(int numero1, int numero2){
        int divi=numero1/numero2;
        return divi;
    }
    public void mostrarDatos(int suma, int resta, int divi, int multi){
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es "+ resta);
        System.out.println("La multiplicacion es: "+ multi);
        System.out.println("La division es: "+ divi);
    }
}

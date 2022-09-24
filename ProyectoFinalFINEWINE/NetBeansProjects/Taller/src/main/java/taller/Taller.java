/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package taller;

import java.util.ArrayList;
import java.util.Scanner;

/** 01/08/2022
 *
 * @author Alejandro Diaz y Juan Bonilla
 */
public class Taller {

    public static void main(String[] args) {
        ArrayList<Integer> pares= new ArrayList<>(); //se crea una lista con arreglo array 
        ArrayList<Integer> impares= new ArrayList<>(); //Integer el tipo de dato
        int li, num;
        li= 12;//cantidad de numeros a digitar
        Scanner entrada=new Scanner(System.in);
        for(int i=1; i<=li; i++){//ciclo for para que tome los 12 datos de uno en uno
            System.out.println("Ingrese un numero: "+i);
            num= entrada.nextInt();
            if (num%2==0){
                pares.add(num);//la lista de numeros pares se agrega a num . num lista principal
             // add es un metodo para agregar datos
            }else{//si el residuo es diferente a cero es un numero impar
                impares.add(num);
            }
        }
        System.out.println("Los numeros pares son: ");
        for (Integer n: pares){System.out.println(n);}//ciclo ForEach declara una variable que es del mismo tipo que del array
        System.out.println("Los numeros impares son: ");
        for(Integer n: impares){System.out.println(n);}
    }

    }

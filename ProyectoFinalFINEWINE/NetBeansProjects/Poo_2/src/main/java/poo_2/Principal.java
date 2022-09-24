/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alejandro Diaz Ortiz
 */
public class Principal {
   static ArrayList<Poligono>poligono=new ArrayList<Poligono>();
    static Scanner entrada=new Scanner(System.in);
    public static void llenarPoligono(String[] args) {
       int opcion;
       char respuesta;
       do{
        do{
           System.out.println("Digite el poligono que sea");
           System.out.println("1. Triangulo");
           System.out.println("2. Rectangulo");
           System.out.println("opcion");
           opcion=entrada.nextInt();
       }while(opcion<1 || opcion>2 );
        switch (opcion){
            case 1:
                break;
            case 2:
                break;
                  
        }
           System.out.println("Desee llenar otro poligono (s/n)");
           respuesta=entrada.next().charAt(0);
           System.out.println("");
       }while (respuesta=='S' || respuesta=='s');
       do{
           do{
               System.out.println("Digite el poligono que sea: ");
               System.out.println("1. Triangulo");
               System.out.println("2. Rectangulo");
               System.out.println("opcion");
               opcion=entrada.nextInt();
           }while(opcion<1 || opcion>2 );
       }while();
       }
    public static void llenarTriangulo(String[] args) {
        double lado1, lado2, lado3;
        System.out.println("Digite el lado 1: ");
        lado1=entrada.nextDouble();
        System.out.println("Digite el lado 2:");
        lado2=entrada.nextDouble();
        System.out.println("Digite el lado 3: ");
        lado3=entrada.nextDouble();
        static A
    }
    }


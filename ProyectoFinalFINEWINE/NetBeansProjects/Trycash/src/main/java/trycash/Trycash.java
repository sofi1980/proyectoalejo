/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package trycash;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Trycash {

    public static void main(String[] args) {
      try {
        String nombre,apellido;
        Scanner entrada= new Scanner(System.in);
          System.out.println("Digite su nombre: ");
          nombre=entrada.nextLine();
          System.out.println("Digite su apellido");
          apellido=entrada.nextLine();
          System.out.println("Su nombre es: "+nombre+ " " +apellido);
      }
      catch (Exception e){
          System.out.println("Error digite letras"+e);
      }finally{
            System.out.println("Correcto");
    } 
}
}

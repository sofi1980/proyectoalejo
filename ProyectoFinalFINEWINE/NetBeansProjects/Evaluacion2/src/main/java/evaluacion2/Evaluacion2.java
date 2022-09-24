/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package evaluacion2;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Evaluacion2 {

    public static void main(String[] args) {
        try{
            int opcion;
            Scanner entrada= new Scanner(System.in);
            System.out.println("Escoja una opcion: 1. Private 2. Protected 3. Public 4. Salir");
            opcion= entrada.nextInt();
            do{
                if(opcion==1){
                    System.out.println("Hace que los metodos o variables declarados en una clase solo puedan ser utilizados dentro de ella misma, no a otras clases.");
                    break;
                }if(opcion==2){
                    System.out.println("Hace que los metodos o variables declarados en una clase solo pueden ser accedidos por la subclase.");
                    break;
                }if(opcion==3){
                    System.out.println("Hace que los metodos o variables declarados puedan ser utilizados por todos si estan conectadas las clases.");
                    break;
                }else{
                    System.out.println("No es la opcion correcta");
                break;
                }
            }while(opcion==4);
            System.out.println("Salio con exito");
            
            
            
        }catch(Exception e){
          System.out.println("Error digite una opcion correcta"+e);
      }finally{
            System.out.println("Correcto");
            
        }
        }
    }


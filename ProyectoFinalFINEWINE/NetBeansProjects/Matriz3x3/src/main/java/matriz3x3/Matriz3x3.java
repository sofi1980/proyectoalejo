/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package matriz3x3;

/**
 *
 * @author SENA
 */
public class Matriz3x3 {

    public static void main(String[] args) {
        String posiciones [] []=new String [3] [3];
        posiciones [0] [0] = "Alejandro";
        posiciones [0] [1] = "Alvaro";
        posiciones [1] [0] = "Cristian";
        posiciones [1] [1] = "Mauricio";
        posiciones [1] [2] = "Juan";
        posiciones [2] [1] = "Laura";
        
        System.out.print("["+posiciones [0] [0]+"]");
        System.out.print("["+posiciones [0] [1]+"]");
        System.out.println("["+posiciones [1] [0]+"]");
        System.out.print("["+posiciones [1] [1]+"]");
        System.out.print("["+posiciones [1] [2]+"]");
        System.out.print("["+posiciones [2] [1]+"]");
        
    }
}

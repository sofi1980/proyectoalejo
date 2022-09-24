/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaluacionAlejo;

/**
 *
 * @author Alejandro Diaz Ortiz 
 * Fecha 10/08/2022
 */
public class Principal {
    public static void main(String[] args) {
        Leon ln= new Leon("Africano","Amarillo","S",15);//se contruye el objeto de la primera clase hija y se colocan los datos 
        ln.mostrarDatos();//se llama el metodo
        Tigre tr=new Tigre("Indonesia","Naranja con lineas blancas","S",11);//se crea el objeto de la segunda clase hija y se colocan los datos
        tr.mostrarDatos();//se llama el metodo 
    }
}

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
public class Leon extends Animal{//se conecta la clase Leon con la super clase animal
    private String raza;

    public Leon(String raza, String color, String mamifero, int edad) {//se crea el metodo constructor con la super clase
        super(color, mamifero, edad);
        this.raza = raza;
    }

    public String getRaza() {//get and set
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void mostrarDatos(){//se crea el metodo para mostrar datos
        System.out.println("\nLa raza del animal es = " + raza+"\nEl color del animal es = "+color+"\nEs mamifero (s/n)= "+mamifero+"\nLa edad del animal es = "+edad);
    }
}

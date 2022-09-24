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
public class Animal {
    String color; //se crean los atributos en comun
    String mamifero;
    int edad;

    public Animal(String color, String mamifero, int edad) {// metodo constructor
        this.color = color;
        this.mamifero = mamifero;
        this.edad = edad;
    }

    public String getColor() {//get and set
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMamifero() {
        return mamifero;
    }

    public void setMamifero(String mamifero) {
        this.mamifero = mamifero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}

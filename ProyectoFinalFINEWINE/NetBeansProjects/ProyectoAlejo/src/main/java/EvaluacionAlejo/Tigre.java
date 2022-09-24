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
public class Tigre extends Animal{
    private String region;

    public Tigre(String region, String color, String mamifero, int edad) {//se crea el metodo constructor con la super clase
        super(color, mamifero, edad);
        this.region = region;
    }

    public String getRegion() {//get and set
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public void mostrarDatos(){//metodo para mostrar los datos
        System.out.println("\nLa region del animal es = " + region+"\nEl color del animal es = "+color+"\nEs mamifero (s/n)= "+mamifero+"\nLa edad del animal es = "+edad);
    }
}

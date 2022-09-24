/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_2;

/**
 *
 * @author Alejandro Diaz Ortiz
 */
public class Rectangulo extends Poligono {
    private double lado1,lado2;
    public Rectangulo (double lado1,double lado2){
     super(2);       
     this.lado1=lado1;
     this.lado2=lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
    public String toString(){
        return "Rectangulo{"+super.toString()+"lado1="+lado1+",lado2"+lado2+"}";
    }
    public double area(){
        return lado1*lado2;
    }
}

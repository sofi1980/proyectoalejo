/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_2;

/**
 *
 * @author Alejandro Diaz Ortiz
 */
public abstract class Poligono {
    protected int nrolados;
    public Poligono(int nrolados){
        this.nrolados=nrolados;
    }
    public int getNrolados(){
        return nrolados;
    }
    public String toString(){
        return "Poligono{"+"nrolados="+nrolados+"}";
    }
    public abstract double area();
       
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oportunidadherencia;

/**
 *
 * @author SENA
 */
public class Producto extends Cliente {
    
    public String nombrepro;
    public double valorpro;

    public Producto(String nombrepro, double valorpro,String nombre) {
        super(nombre);
        this.nombrepro = nombrepro;
        this.valorpro = valorpro;
    }

    public String getNombrepro() {
        return nombrepro;
    }
     public double getValorpro() {
        return valorpro;
    }

    public void setNombrepro(String nombrepro) {
        this.nombrepro = nombrepro;
    }

    public void setValorpro(double valorpro) {
        this.valorpro = valorpro;
    }
    
    int descuento;
    
    public void mostrarDatos(){
        
       if (valorpro > 50000 ){
            valorpro=valorpro-(valorpro*0.10);
        }
        else if (valorpro > 50000){
            valorpro=valorpro-(valorpro*0.5);
        }
        System.out.println("El nombre del cliente es: "+nombre);
        System.out.println("El nombre del producto es: "+nombrepro);
        System.out.println("El valor del producto neto es: 60000");
        System.out.println("El valor del producto es: "+valorpro);
        //System.out.println("El valor a pagar es: "+descuento);
        
    }
}

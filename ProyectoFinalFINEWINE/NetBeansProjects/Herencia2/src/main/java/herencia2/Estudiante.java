/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

/**
 *
 * @author SENA
 */
public class Estudiante extends Persona{
    private final int codigoEstudiante;
    private final double notaFinal;

    public Estudiante(int codigoEstudiante, double notaFinal, String nombres, String apellidos, int edad) {
        super(nombres, apellidos, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
     public void mostrarDatos(){
        System.out.println("El nombre del estudiante es: "+ getNombres() + "\nApellidos: "+ getApellidos() + "\nSu edad: "+ getEdad()+"\ncodigo de estudiante:"+codigoEstudiante+"\nSu nota final es: "+notaFinal);
        
    }
   
    
    
    
    
}

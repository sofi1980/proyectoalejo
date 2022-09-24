/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia1;

/**
 *
 * @author SENA
 */
//Código de la clase Persona ejemplo aprenderaprogramar.com

public class Persona {

    private String nombre;

    private String apellidos;

    private int edad;

    //Constructor

    public Persona (String nombre, String apellidos, int edad) {

        this.nombre = nombre;

        this.apellidos = apellidos;

        this.edad = edad;                   }

    //Métodos

    public String getNombre () { return nombre;  }

    public String getApellidos () { return apellidos;  }

    public int getEdad () { return edad;   }

} //Cierre de la clase

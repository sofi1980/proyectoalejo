
package poligonos;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner (System.in);
    
    public static void main(String[] args) {
        llenarPoligono();
        mostrarResultados();
    }
    
    public static void llenarPoligono(){
        int opcion;
        char respuesta;//es para q lea un solo caracter en este caso la S o N
        do{
            do{//general
                System.out.println("------Digite el pologono que sea-------");
                System.out.println("------------1. Triangulo---------------");
                System.out.println("------------2.Rectangulo---------------");
                System.out.println("Elige estas opciones.");
                opcion=entrada.nextInt();
            }while(opcion <1 || opcion > 2);//aca verificara cual numero digito y lo valida en el switch
            
            switch (opcion){
                case 1: llenarTriangulo();//llena o abre la clase triangulo
                    break;
                case 2: llenarRectangulo();//llena o abre la clase Rectangulo
                    break;
            }
            System.out.println("Desea llenar o realizar otro poligono (si/no)");
            respuesta = entrada.next().charAt(0);//char la posicion 0
            System.out.println("");
        }while(respuesta=='S' || respuesta=='s');
    }
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        
        System.out.println("Digite lado 1: ");
        lado1=entrada.nextDouble();
        System.out.println("Digite lado 2: ");
        lado2=entrada.nextDouble();
        System.out.println("Digite lado 3: ");
        lado3=entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        //guardamos el triangulo dentro de nuestro arreglo
        poligono.add(triangulo);
    }
    
    public static void llenarRectangulo(){
        double lado1, lado2;
        
        System.out.println("Digite lado 1: ");
        lado1=entrada.nextDouble();
        System.out.println("digite lado 2: ");
        lado2=entrada.nextDouble();
        
        Rectangulo rectangulo = new Rectangulo ( lado1, lado2);
        
        poligono.add(rectangulo);
    }
    
    public static void mostrarResultados(){
        //recorrer el arreglo
        for(Poligono poli: poligono){//poli es el iterador(i)
            System.out.println(poli.toString());//llamar el objeto con el metodo tostring que tiene los datos
            System.out.println("Area. "+poli.area());//se llama el otro metodo area
            System.out.println("-----------");//espacio
            
        }
    }
    
}


package poligonos;


public class Rectangulo extends Poligono {
  //privados
  private double lado1,lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //metodo accesores
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "rectangulo{" +super.toString()+ "lado1 = " + lado1 + ", lado2 = " + lado2 + '}';
    }
    
    @Override//ya existe el metido en el padre
    public double area(){
        return lado1*lado2;
    }
  
  
  
}

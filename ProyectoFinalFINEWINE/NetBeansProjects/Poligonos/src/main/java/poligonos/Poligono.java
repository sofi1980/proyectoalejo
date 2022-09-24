
package poligonos;


public abstract class Poligono {
    
    protected int nlados;

    public Poligono(int nlados) {
        this.nlados = nlados;
    }
    
    public int getNlados() {
        return nlados;
    }
    
    @Override
    public String toString() {
        return "Poligono{" + "nlados=" + nlados + '}';
    }
    public abstract double area();
}

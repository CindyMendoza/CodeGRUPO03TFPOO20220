package Clase3;

//Clase Abstracta Poligono
public abstract class Poligono {
    private int numLados;

    public Poligono(int numLados) {
        this.numLados = numLados;
    }

    public Poligono() {
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    //Declaración del método abstracto area()
    public abstract double area();

    public String mostrarDatos(){
        return "Lados = " + numLados;
    }

    public int multiplicarentero(){
        return 5 * 5;
    }
}

package Clase3;

public class Rectangulo extends Poligono{
    private double lado1;
    private double lado2;

    public Rectangulo(int numLados, double lado1, double lado2) {
        //super(numLados);
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo() {
    }

    //Implementación del método Abstracto area()
    //Heredado de la clase Poligono
    @Override
    public double area() {
        return lado1 * lado2;
    }

    public String mostrarDatos(){
        return "Lado1 = " + lado1 + ", Lado2 = " + lado2 + ", N° Lados = " + getNumLados();
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}

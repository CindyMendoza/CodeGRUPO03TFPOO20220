package Clase3;

public class Triangulo extends Poligono{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(int numLados, double lado1, double lado2, double lado3) {
        super(numLados);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo() {
    }

    //Implementación del método Abstracto area()
    //Heredado de la clase Poligono
    @Override
    public double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(p * (p-lado1) * (p-lado2) * (p-lado3));
    }

    public String mostrarDatos(){
        return "Lado1 = " + lado1 + ", Lado2 = " + lado2 + ", Lado3 = " + lado3 + ", N° Lados = " + getNumLados();
    }
    //@Override = Anular el método
    //Con @Override se muestra error porque no lo encuentra en la super clase o clase padre (Poligono)
    public int multiplicarEntero(){
        return 6 * 6;
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo(3,3.25, 4.55, 2.71);
        System.out.printf("Area del triángulo: %.2f %n", t.area());

        Rectangulo r = new Rectangulo(2,5.70, 2.29);
        System.out.printf("Area del rectángulo: %.2f %n", r.area());

        //Clases Abstractas:
        //1. Se utilizan solo como super clases
        //2. No se puede instancia objetos de esa clase
        //3. Util para brindar una super clase apropiada, del cual se heredaran otras clases
        //La siguiente línea es inválida:
        //Poligono poligono = new Poligono();

        //Si un método es Abstracto la clase también lo debe ser.

        System.out.println("Mostrar datos: ");
        System.out.println("Triángulo: ");
        System.out.println(t.mostrarDatos());
        System.out.println("Rectángulo: ");
        System.out.println(r.mostrarDatos());

        System.out.println(t.multiplicarEntero());
    }
}

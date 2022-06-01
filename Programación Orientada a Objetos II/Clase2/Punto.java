package Clase2;

public class Punto {
    private int x;
    private int y;

    //Constructor
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    //Get y Set
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //Calcular la distancia a ese punto (desde el origen)
    public double calcularDistanciaAlPunto(){
        //double distancia = 0;
        //distancia = Math.sqrt(this.x * this.x + this.y * this.y);
        //return distancia;
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    //Calcular el angulo que forma el punto (x, y)
    public double calcularAngulo(){
        double aux = (double) (this.y) / this.x;
        return Math.toDegrees(Math.atan(aux));
    }
    //Main
    public static void main(String[] args) {
        Punto punto = new Punto(30, 40);
        System.out.println("Calculando la distancia del origen al punto (x,y): ");
        System.out.println("La distancia es: " + punto.calcularDistanciaAlPunto());

        System.out.println("El angulo que forma el punto es: ");
        System.out.println(punto.calcularAngulo());
        System.out.printf("El angulo en grados es %.2f", punto.calcularAngulo());

        int a;
        int b;
        int c;
        int x, y, z;

        Punto punto1, punto2 = new Punto(), punto3, punto4;
        punto1 = new Punto(5, 5);
        punto4 = punto1;
        System.out.println("");
        System.out.println("Punto 1");
        System.out.println(punto1.getX() + ", " + punto1.getY());

        System.out.println("Punto 4:");
        System.out.println(punto4.getX() + ", " + punto4.getY());

        punto3 = new Punto();
        System.out.println("Punto 3:");
        System.out.println(punto3.getX() + ", " + punto3.getY());

        System.out.println("Punto 2:");
        System.out.println(punto2.getX() + ", " +  punto2.getY());

        //Como crear un arreglo de la clase Punto?
        String [] nombres = {"Juan", "Jose", "Luis"};

        Punto[] listaDePuntos = {new Punto(),new Punto()};
        Punto[] tablaDePuntos;
        tablaDePuntos = new Punto[5];

        //while, do while, for
        //For: 3 partes: inicializacion, condicion, incremento o decremento
        for(int i=0; i < 5; i++){
            tablaDePuntos[i] = new Punto(10, 20);
        }
        //Escribir sus valores asignados por defecto
        System.out.println("Recorrido de arreglo de Puntos: ");
        for(int i = 0; i < 5; i++){
            System.out.println( i +" "+ tablaDePuntos[i].getX() + ", " + tablaDePuntos[i].getY());
        }

    }
}

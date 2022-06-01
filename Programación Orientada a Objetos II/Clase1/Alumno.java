package Clase1;

public class Alumno {
    private int codigo;
    private String nombre;
    private int nota1;
    private int nota2;

    //Constructor de la clase Alumno
    public Alumno(int codigo, String nombre, int nota1, int nota2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    //Get y Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    //Calcular el promedio de las 2 notas
    public double calcularPromedio(){
        double promedio = 0;
        promedio = (nota1 + nota2) / 2.0;
        return promedio;
    }

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(20150255, "Pepe", 12, 20);
        Alumno alumno2 = new Alumno(20150253, "Ana", 14, 17);

        System.out.println("Alumno 1: ");
        System.out.println(alumno1.getNombre());
        System.out.println(alumno1.calcularPromedio());

        System.out.println("Alumno 2: ");
        System.out.println(alumno2.getNombre());
        System.out.println(alumno2.calcularPromedio());
    }
}

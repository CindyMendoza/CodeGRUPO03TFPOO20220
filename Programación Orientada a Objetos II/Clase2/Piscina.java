package Clase2;

public class Piscina {
    private double largo;
    private double ancho;
    private double profundidad;

    public Piscina(double largo, double ancho, double profundidad) {
        this.largo = largo;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public Piscina() {
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double calcularVolumen(){
        /*double volumen = 0;
        volumen = this.largo * this.ancho * this.profundidad;
        return volumen;*/
        return this.largo * this.ancho * this.profundidad;
    }

    public double calcularCantidadAgua(){
        return calcularVolumen() * 0.75;
    }

    public double calcularCantidadCloro(){
        double cantidadCloro = 0;
        cantidadCloro = (calcularCantidadAgua()*1000) * (0.015 / 1.5);
        return cantidadCloro;
    }

    public static void main(String[] args) {
        Piscina piscina = new Piscina(1,1,1);
        System.out.println("Calculo del volumen total en m3: " + piscina.calcularVolumen());
        System.out.println("Calculo de la cantidad de Agua en m3: " + piscina.calcularCantidadAgua());
        //1 m3 = 1000 litros
        System.out.println("Calculo de la cantidad de Agua en litros: "+ piscina.calcularCantidadAgua()*1000);
        System.out.println("Cantidad de cloro necesario en gramos: " + piscina.calcularCantidadCloro());

        Piscina piscina2 = new Piscina();
        piscina2.setAncho(5);
        piscina2.setLargo(15);
        piscina2.setProfundidad(2);
        System.out.println("Volumen en m3: " + piscina2.calcularVolumen());
        System.out.println("Agua en litros: " + piscina2.calcularCantidadAgua()*100);
        System.out.println("Cloro en gramos: " + piscina2.calcularCantidadCloro());

        //Solicitar al usuario el ingreso de las dimensiones de la piscina.
    }
}

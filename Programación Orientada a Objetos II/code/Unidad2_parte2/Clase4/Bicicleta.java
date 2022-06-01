package Clase4;

public class Bicicleta implements Rueda, Cadena{

    //@Override
    public void avanzar() {
        System.out.println("La Bicicleta esta avanzando.");
    }

    //@Override
    public void rebotar() {
        System.out.println("La bicicleta rebotó.");
    }

    //@Override
    public void desinflar() {
        System.out.println("La rueda de la Bicicleta esta desinflada.");
    }

    //@Override
    public void inflar() {
        System.out.println("Inflando la rueda de la bicicleta.");
    }

    //@Override
    public void desgastar() {
        System.out.println("La rueda de la bicicleta esta desgastada.");
    }

    //@Override
    public void detenerse() {
        System.out.println("La bicicleta se detuvo.");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();
        Bicicleta bicicleta = new Bicicleta();

        auto.avanzar();
        bicicleta.avanzar();
        bicicleta.engrasar();
    }

    //@Override
    public void engrasar() {
        System.out.println("La cadena de la bicicleta se esta engrasando.");
    }
}

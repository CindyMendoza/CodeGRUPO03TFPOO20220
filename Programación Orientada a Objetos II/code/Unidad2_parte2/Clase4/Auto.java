package Clase4;

public class Auto implements Rueda{

    //@Override
    public void avanzar() {
        System.out.println("El Auto esta avanzando.");
    }

    //@Override
    public void rebotar() {
        System.out.println("La rueda del Auto rebotó.");
    }

    //@Override
    public void desinflar() {
        System.out.println("La Rueda del Auto esta desinflada.");
    }

    //@Override
    public void inflar() {
        System.out.println("Inflando la rueda del Auto.");
    }

    //@Override
    public void desgastar() {
        System.out.println("La Rueda del auto se desgasto.");
    }

    //@Override
    public void detenerse() {
        System.out.println("El Auto se detuvo.");
    }
}

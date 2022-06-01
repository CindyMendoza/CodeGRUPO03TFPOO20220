package Taller2.Interfaces;

public class LenguajePais implements Lenguaje{
    @Override
    public void mostrarDatos() {
        System.out.println("Hola, soy el Lenguaje Francés.");
    }

    @Override
    public void mostrarOtroMensaje() {
        System.out.println("Hola, este es un segundo mensaje de Francés.");
    }
}

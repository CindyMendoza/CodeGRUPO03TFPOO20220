package Taller2.Interfaces;

public interface Lenguaje {

    public void mostrarDatos();
    default public void mostrarOtroMensaje(){
        System.out.println("Hola, te saludo desde la Interface.");
    }

}

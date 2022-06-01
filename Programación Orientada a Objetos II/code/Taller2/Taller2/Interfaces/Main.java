package Taller2.Interfaces;

public class Main {
    public static void main(String[] args) {
        LenguajePais lenguajePais = new LenguajePais();
        LenguajeProgramacion lenguajeProgramacion = new LenguajeProgramacion();

        lenguajePais.mostrarDatos();
        lenguajeProgramacion.mostrarDatos();

        lenguajePais.mostrarOtroMensaje();
        lenguajeProgramacion.mostrarOtroMensaje();
    }
}

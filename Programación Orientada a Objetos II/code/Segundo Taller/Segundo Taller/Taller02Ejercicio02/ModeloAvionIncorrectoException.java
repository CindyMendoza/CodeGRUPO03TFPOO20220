package Taller02Ejercicio02;

//Hija                      Padre
public class ModeloAvionIncorrectoException extends Exception {
    @Override
    public String getMessage() {
        return "Modelo de avión inválido";
    }
}

package TF;

public class DominioNoExisteException extends Exception {
    @Override
    public String getMessage(){return "Ingrese un dominio que se encuentre registrado";}
}

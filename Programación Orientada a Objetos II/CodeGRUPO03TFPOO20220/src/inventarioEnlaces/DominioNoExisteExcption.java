package TF;

public class DominioNoExisteExcption extends Exception {
    @Override
    public String getMessage(){return "Ingrese una dominio que se encuentre registrado";}
}

package TF;

public class EmpresaNoExisteException extends Exception {
    @Override
    public String getMessage(){return "Ingrese una empresa que se encuentre registrada";}
}

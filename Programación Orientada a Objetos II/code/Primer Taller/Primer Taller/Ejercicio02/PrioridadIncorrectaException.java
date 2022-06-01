package ComposicionAgregacion03;
public class PrioridadIncorrectaException extends Exception {
    @Override
    public String getMessage() {
        return "Prioridad Incorrecta";
    }
}

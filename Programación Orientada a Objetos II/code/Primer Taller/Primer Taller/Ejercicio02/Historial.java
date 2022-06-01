package ComposicionAgregacion03;

import java.util.ArrayList;
import java.util.List;

public class Historial {

    private String codigo;
    private List<Visita> visitas;

    public Historial(String codigo) {
        this.codigo = codigo;
        this.visitas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Visita> getVisitas() {
        return visitas;
    }

    public void registrarVisita(String fecha, String motivo, double costo) {
        Visita visita = new Visita(fecha, motivo, costo);
        this.visitas.add(visita);
    }

    public double calcularMontoTotal() {
        double montoTotal = 0;
        for (Visita visita: visitas) {
            montoTotal = montoTotal + visita.getCosto();
        }
        return montoTotal;
    }

    @Override
    public String toString() {
        return "Historial: " +
                " codigo= " + codigo +
                " visitas= " + visitas +
                " monto total= " + calcularMontoTotal();
    }
}
package ComposicionAgregacion03;

public class Paciente {

    private String documento;
    private String nombres;
    private int edad;
    private Historial historial;

    public Paciente(String documento, String nombres, int edad) {
        this.documento = documento;
        this.nombres = nombres;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public int getEdad() {
        return edad;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void asignarHistorial(Historial historial) {
        this.historial = historial;
    }

    public String obtenerPrioridad() {
        if (historial.calcularMontoTotal() > 5000) {
            return "Alta";
        } else if (historial.calcularMontoTotal() >= 2000 && historial.calcularMontoTotal() <= 5000) {
            return "Media";
        } else if (historial.calcularMontoTotal() < 2000) {
            return "Baja";
        }
        return null;
    }

    @Override
    public String toString() {
        return "Paciente: " +
                " documento= " + documento +
                " nombres= " + nombres +
                " edad= " + edad +
                " historial= " + historial +
                " prioridad= " + obtenerPrioridad();
    }
}
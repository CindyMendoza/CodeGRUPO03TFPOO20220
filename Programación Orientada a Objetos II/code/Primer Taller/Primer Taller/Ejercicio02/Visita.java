package ComposicionAgregacion03;

public class Visita {

    private String fecha;
    private String motivo;
    private double costo;

    public Visita(String fecha, String motivo, double costo) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

   @Override
    public String toString() {
        return "Visita:" +
                " fecha= " + fecha +
                " motivo= " + motivo +
                " costo= " + costo;
    }
}
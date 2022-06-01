package com.clinica;

public class Visita {

    private String fecha;
    private String motivo;
    private double monto;

    public Visita(String fecha, String motivo, double monto) throws Exception {
        if (monto < 0) {
            throw new Exception("No se puede ingresar monto negativo");
        }
        this.fecha = fecha;
        this.motivo = motivo;
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "fecha='" + fecha + '\'' +
                ", motivo='" + motivo + '\'' +
                ", monto=" + monto +
                '}';
    }
}

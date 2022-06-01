package com.U202117830;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String codigo;
    private List<Asiento> asientos;
    private List<Pelicula> peliculas;

    public Sala(String codigo) {
        this.codigo = codigo;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void registrarAsiento(String fila, String letra, String categoria) {
        Asiento asiento = new Asiento(fila, letra, categoria);
        this.asientos.add(asiento);
    }
    public List<Asiento> listarAsientos() {
        return this.asientos;
    }
    public void asignarPelicula(String nombre) {
        Pelicula pelicula = new Pelicula(nombre);
        this.peliculas.add(pelicula);
    }
    public List<Pelicula>  listarPeliculas() {
        return this.peliculas;
    }


    public double calcularMontoVenta() {
        double montoVenta = 0.0;
        for (Asiento asiento: asientos) {

                montoVenta=+asiento.obtenerPrecio();

        }

        return montoVenta;
    }
    @Override
    public String toString() {
        return "Sala{" +
                "codigo='" + codigo + '\'' +
                ", asientos=" + asientos +
                ", peliculas=" + peliculas +
                '}';
    }

    public void registrarAsiento(Asiento asiento) {
    }
}

package com.aerolinea;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String modelo;
    private List<Asiento> asientos;
    public Avion(String modelo) {
        this.modelo = modelo;
        this.asientos = new ArrayList<>();
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void registrarAsiento(Integer numero, String letra) {
        Asiento asiento = new Asiento(numero, letra);
        asientos.add(asiento);
    }
    public List<Asiento> listarAsientos() {
        return asientos;
    }


    @Override
    public String toString() {
        return "Avion{" +
                "modelo='" + modelo + '\'' +
                ", asientos=" + asientos +
                '}';
    }
}

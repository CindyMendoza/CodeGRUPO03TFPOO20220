package com.aerolinea;

import java.util.List;

public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private Avion avion;

    public Vuelo(String codigo, String origen, String destino) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Avion getAvion() {
        return avion;
    }

    public void asignarAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "codigo='" + codigo + '\'' +
                ", avion=" + avion +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}





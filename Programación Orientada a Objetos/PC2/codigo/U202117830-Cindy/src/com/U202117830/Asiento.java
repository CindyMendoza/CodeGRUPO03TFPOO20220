package com.U202117830;

public class Asiento {
    private String fila;
    private String letra;
    private String categoria;

    public Asiento(String fila, String letra, String categoria) {
        this.fila = fila;
        this.letra = letra;
        this.categoria = categoria;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Double obtenerPrecio() {
        Double precio=0.0;
        if (this.categoria == "Regular"){
            precio=20.0;
        }else if(this.categoria == "4DX"){
            precio=45.0;
        }

        return precio;
    }
    @Override
    public String toString() {
        return "Asiento{" +
                "fila='" + fila + '\'' +
                ", letra='" + letra + '\'' +
                ", categoria='" + categoria + '\'' +
                ", obtenerPrecio='" + obtenerPrecio() + '\'' +
                '}';
    }
}

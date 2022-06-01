package com.PA2;

public abstract class Vehiculo {
    private String codigo;
    private String anioCompra;
    private String marca;
    private String modelo;
    private String color;
    public Vehiculo(String codigo, String anioCompra, String marca, String modelo, String color) {
        this.codigo = codigo;
        this.anioCompra = anioCompra;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAnioCompra() {
        return anioCompra;
    }

    public void setAnioCompra(String anioCompra) {
        this.anioCompra = anioCompra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract Integer calcularVelocidad();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "codigo='" + codigo + '\'' +
                ", anioCompra=" + anioCompra +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", calcularVelocidad='" + calcularVelocidad() + '\'' +
                '}';
    }
}

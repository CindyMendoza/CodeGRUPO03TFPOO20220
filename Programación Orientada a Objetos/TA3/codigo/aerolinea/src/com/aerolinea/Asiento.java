package com.aerolinea;

public class Asiento {
    private Integer numero;
    private String letra;

    public Asiento(Integer numero, String letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public double calcularPrecio() {
        double precioBase = 0,factor =0;
        if(this.letra.equals("A")||this.letra.equals("C")||this.letra.equals("D")||this.letra.equals("F")){
            precioBase = 80;
        }else if(this.letra.equals("B")||this.letra.equals("E")){
            precioBase = 60;
        }else{
            precioBase = 0;
        }
        if(this.numero >= 0 || this.numero < 7){
            factor = 1.5;
        }else if(this.numero >= 7 || this.numero <= 16){
            factor = 1.3;
        }else if(this.numero > 16){
            factor = 1.15;
        } else{
            factor = 0;
        }

        return precioBase*factor;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "numero=" + numero +
                ", letra='" + letra + '\'' +
                ", CalcularPrecio='" + calcularPrecio() + '\'' +
                '}';
    }


}

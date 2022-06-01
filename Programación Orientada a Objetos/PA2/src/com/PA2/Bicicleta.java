package com.PA2;

public class Bicicleta extends Vehiculo {
    private String clasificacion;
    private Integer cantPlatos;
    private boolean canastilla;

    public Bicicleta(String codigo, String anioCompra, String marca, String modelo, String color, String clasificacion,
                     Integer cantPlatos, boolean canastilla) {
        super(codigo, anioCompra, marca, modelo, color);
        this.clasificacion = clasificacion;
        this.cantPlatos = cantPlatos;
        this.canastilla = canastilla;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getCantPlatos() {
        return cantPlatos;
    }

    public void setCantPlatos(Integer cantPlatos) {
        this.cantPlatos = cantPlatos;
    }

    public boolean isCanastilla() {
        return canastilla;
    }

    public void setCanastilla(boolean canastilla) {
        this.canastilla = canastilla;
    }
    public Integer calculoKm(Integer km){
        Integer valorKm=0;
        if (this.cantPlatos>2){
            valorKm=km+5;
        }else{
            valorKm = km;
        }
        return  valorKm;
    };


    @Override
    public Integer calcularVelocidad() {
        Integer velocidad=0;
        if (this.clasificacion.toLowerCase().equals("urbana")) {
            Integer km = 15;
            velocidad = this.calculoKm(km) ;
        } else if(this.clasificacion.toLowerCase().equals("montañera")){
            Integer km = 25;
            velocidad = this.calculoKm(km);
        }else if(this.clasificacion.toLowerCase().equals("ruta")){
            Integer km = 30;
            velocidad = this.calculoKm(km);
        }
        return velocidad;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "clasificacion='" + clasificacion + '\'' +
                ", cantPlatos=" + cantPlatos +
                ", canastilla=" + canastilla +
                "} " + super.toString();
    }
}

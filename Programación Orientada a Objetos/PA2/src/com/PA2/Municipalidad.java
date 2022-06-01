package com.PA2;

import java.util.ArrayList;
import java.util.List;

public class Municipalidad {
    private List<Vehiculo> arregloVehiculos;
    private String nombre;

    public Municipalidad(List<Vehiculo> arregloVehiculos, String nombre) {
        this.arregloVehiculos = new ArrayList<>();;
        this.nombre = nombre;
    }

    public List<Vehiculo> listarVehiculos() {
        return arregloVehiculos;
    }
    public void registrarVehiculo(Vehiculo vehiculo) {
        this.arregloVehiculos.add(vehiculo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String CalcularMayorVelocidad(){
        Integer mayor = 0;
        String elemento = "No hay elemento mayor";
        for(Vehiculo p: this.arregloVehiculos){
            if (p.calcularVelocidad()>mayor){
                mayor =p.calcularVelocidad();
                elemento = p.toString();
            }
        }
        return elemento;
    }
    public String buscarVehiculoXCodigo(String codigo) {

        String valorEncontrado="No encontrado";
        for(Vehiculo p: this.arregloVehiculos){
            if (p.getCodigo().equals(codigo)){
                valorEncontrado =p.toString();
            }
        }
        return valorEncontrado;

    }
    public String buscarVehiculoXAnio(String anio) {

        String valorEncontrado="No encontrado";
        for(Vehiculo p: this.arregloVehiculos){
            if (p.getAnioCompra().equals(anio)){
                valorEncontrado =p.toString();
            }
        }
        return valorEncontrado;

    }
}

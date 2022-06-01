package com.aerolinea;

import java.util.ArrayList;
import java.util.List;

public class Aerolinea {
    private List<Vuelo> vuelos;
    public Aerolinea() {
        this.vuelos = new ArrayList<>();
    }

    public void registrarVuelos(String codigo, String origen, String destino) {
        Vuelo vuelo = new Vuelo(codigo, origen, destino);
        vuelos.add(vuelo);
    }
    public Vuelo buscarVuelo(String codigo) {
        for (Vuelo vuelo: vuelos) {
            if (vuelo.getCodigo().equals(codigo)) {
                return vuelo;
            }
        }
        return null;
    }
    public void asignarAvion(String codigo, Avion avion) {
        Vuelo vuelo = buscarVuelo(codigo);
        if (vuelo != null) {
            vuelo.asignarAvion(avion);
        }
    }
    public List<Vuelo> listarVuelo(String modelo) throws Exception {

        List<Vuelo> vuelosAux = new ArrayList<>();

        for (Vuelo vuelo: vuelos) {

            if (vuelo.getAvion().getModelo().equals(modelo)) {
                vuelosAux.add(vuelo);
            }
        }
        if (vuelosAux.size() == 0) {
            throw new Exception("Modelo de avión inválido");
        }
        return vuelosAux;
    }

    public List<Vuelo> getVuelos() {

        return vuelos;
    }
    @Override
    public String toString() {
        return "Aerolinea{" +
                "vuelos=" + vuelos +
                "getVuelos=" + getVuelos() +
                '}';
    }

}

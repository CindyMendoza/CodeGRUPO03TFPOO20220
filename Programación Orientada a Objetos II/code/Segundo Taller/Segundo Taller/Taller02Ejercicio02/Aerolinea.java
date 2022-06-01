package Taller02Ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Aerolinea {

    private List<Vuelo> vuelos;

    public Aerolinea() {
        this.vuelos = new ArrayList<>();
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void registrarVuelo(String codigo, String origen, String destino) {
        Vuelo vuelo = new Vuelo(codigo, origen, destino);
        vuelos.add(vuelo);
    }

    public void registrarVuelo(String codigo, Avion avion, String origen, String destino) {
        Vuelo vuelo = new Vuelo(codigo, origen, destino);
        vuelo.asignarAvion(avion);
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

    public List<Vuelo> obtenerListaVuelosConModeloAvion(String modelo) throws ModeloAvionIncorrectoException {
        List<Vuelo> listaResultado = new ArrayList<>();
        for (Vuelo vuelo: vuelos) {
            if (vuelo.tieneAvionConModelo(modelo) == true) {
                listaResultado.add(vuelo);
            }
        }
        if (listaResultado.size() == 0) {
            throw new ModeloAvionIncorrectoException();
        }
        return listaResultado;
    }
}
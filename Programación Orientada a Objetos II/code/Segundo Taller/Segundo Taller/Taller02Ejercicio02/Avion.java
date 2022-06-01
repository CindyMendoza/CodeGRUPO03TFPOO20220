package Taller02Ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Avion {

    private String modelo;
    private List<Asiento> asientos;

    public Avion(String modelo, int numero, String letra) {
        this.modelo = modelo;
        this.asientos = new ArrayList<>();
        Asiento asiento = new Asiento(numero, letra);
        this.asientos.add(asiento);
    }

    public String getModelo() {
        return modelo;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void asignarAsiento(int numero, String letra) {
        Asiento asiento = new Asiento(numero, letra);
        this.asientos.add(asiento);
    }

    @Override
    public String toString() {
        return "Avion:" +
                " modelo= " + modelo +
                " asientos= " + asientos;
    }
}
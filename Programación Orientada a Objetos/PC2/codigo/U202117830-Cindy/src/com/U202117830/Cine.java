package com.U202117830;

import java.util.List;

public class Cine {
    private List<Sala> salas;
    public Sala buscarSala(String codigo) {
        for (Sala sala: salas) {
            if (sala.getCodigo().equals(codigo)) {
                return sala;
            }
        }
        return null;
    }
    public void asignarAsiento(String codigo, Asiento asiento) {
        Sala sala = buscarSala(codigo);
        if (sala != null) {
            sala.asignarAsiento(asiento);
        }
    }
}

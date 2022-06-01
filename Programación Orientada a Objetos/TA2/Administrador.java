package com.ta2;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Participante> participantes;
    public Administrador(List<Participante> participantes) {
        this.participantes = new ArrayList<>();
    }
    //registrarParticipante()
    public void registrarParticipante(Participante participante) {
        if(participante.getEdad()>=18){
            participantes.add(participante);
        }else{
            System.out.println("El participante tiene que ser mayor de edad");
        }

    }

    //imprimirListado()

    public List<Participante> getParticipantes() {
        return participantes;
    }

    //obtenerGanador()
    public String obtenerGanador() {
        final int[] max = {0};
        final String[] nombre = {null};
        participantes.forEach((n) -> {

            if (n.calcularPuntaje() > max[0]){
                max[0] = n.calcularPuntaje();
                nombre[0] = n.getNombre();
            }

        } );
        return "El ganador es " +nombre[0]+" con "+max[0]+" puntos";


    }
    //buscarParticipante()
    public void buscarParticipante(String busqueda) {
        participantes.forEach((n) -> {

            if (n.getDni().equals(busqueda)){
                System.out.print("El DNI encontrado es:" + n);
            }else{
                System.out.print("El DNI no se encuentra registrado");
            }

        } );

    }


}

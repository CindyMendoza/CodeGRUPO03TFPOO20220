package com.aerolinea;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // Crear y registrar 3 vuelos cada uno con un avión asignado que tenga al menos
        //2 asientos. (1.5 puntos)

        Aerolinea aerolinea1 = new Aerolinea();

        aerolinea1.registrarVuelos("V001", "Lima", "Cuzco");
        aerolinea1.registrarVuelos("V002", "Lima", "Quito");
        aerolinea1.registrarVuelos("V003", "Cali", "Lima");

        Avion avion01 = new Avion("M001");
        avion01.registrarAsiento(14, "D");
        avion01.registrarAsiento(16, "A");
        Avion avion02 = new Avion("M003");
        avion02.registrarAsiento(1, "F");
        avion02.registrarAsiento(2, "B");
        Avion avion03 = new Avion("M003");
        avion03.registrarAsiento(17, "C");
        avion03.registrarAsiento(18, "E");

        aerolinea1.asignarAvion("V001", avion01);
        aerolinea1.asignarAvion("V002", avion02);
        aerolinea1.asignarAvion("V003", avion03);
        System.out.println("Lista de vuelos con el modelo ingresado:");


        List<Vuelo> vuelosPorModelo = new ArrayList<>();
        try {
            vuelosPorModelo = aerolinea1.listarVuelo("M003");
            System.out.println(vuelosPorModelo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

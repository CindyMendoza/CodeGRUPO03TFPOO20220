package Taller02Ejercicio02;

import java.nio.file.attribute.AttributeView;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // A)
        // B)
        // C)

        Aerolinea aerolineaA = new Aerolinea();

        Avion avionA = new Avion("Airbus 319", 1, "A");
        Avion avionB = new Avion("Boeing 747", 1, "A");
        Avion avionC = new Avion("Boeing 747", 1, "A");

        avionA.asignarAsiento(20, "A");
        avionA.asignarAsiento(13, "C");
        avionB.asignarAsiento(25, "E");
        avionB.asignarAsiento(14, "F");
        avionC.asignarAsiento(12, "C");
        avionC.asignarAsiento(17, "D");

        aerolineaA.registrarVuelo("LA252", "Lima", "Arequipa");
        aerolineaA.asignarAvion("LA252", avionA);
        aerolineaA.registrarVuelo("LA665", avionB, "Lima", "Piura");
        aerolineaA.registrarVuelo("LA987", avionC, "Trujillo", "Iquitos");

        // Opcional
        //System.out.println("Vuelos Registrados");
        //List<Vuelo> vuelosRegistrados = aerolineaA.getVuelos();
        //for (Vuelo vuelo: vuelosRegistrados) {
        //    System.out.println(vuelo);
        //}

        // D)
        System.out.println("Vuelos segun modelo de Avion");
        List<Vuelo> vuelosModeloA = new ArrayList<>();
        try {
            vuelosModeloA = aerolineaA.obtenerListaVuelosConModeloAvion("Boeing 747");
        } catch (ModeloAvionIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        for (Vuelo vuelo: vuelosModeloA) {
            System.out.println(vuelo);
        }

        // E)
        System.out.println("Vuelos segun modelo inexistente de Avion");
        List<Vuelo> vuelosModeloB = new ArrayList<>();
        try {
            vuelosModeloB = aerolineaA.obtenerListaVuelosConModeloAvion("Boeing 999");
        } catch (ModeloAvionIncorrectoException e) {
            System.out.println(e.getMessage());
        }
        for (Vuelo vuelo: vuelosModeloB) {
            System.out.println(vuelo);
        }
    }
}

package Cine;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cine cine = new Cine();
        //Películas
        Pelicula pelicula1 = new Pelicula("Silent Hill");
        Pelicula pelicula2 = new Pelicula("Rambo");
        Pelicula pelicula3 = new Pelicula("El Padrino");

        //Registro de salas
        cine.registrarSala("S001", pelicula1);
        cine.registrarSala("S002", pelicula2);
        cine.registrarSala("S003", pelicula3);

        //Registro de Asientos
        cine.asignarAsientoASala("S001", 1, "A", "Regular");
        cine.asignarAsientoASala("S001", 1, "B", "Regular");
        cine.asignarAsientoASala("S001", 1, "C", "Regular");

        cine.asignarAsientoASala("S002", 2, "A", "4DX");
        cine.asignarAsientoASala("S002", 2, "B", "Regular");

        cine.asignarAsientoASala("S003", 3, "Y", "Regular");
        cine.asignarAsientoASala("S003", 3, "Z", "4DX");

        //Mostrar toda la información
        List<Sala> salasRegistradasDelCine = cine.getSalas();
        for(Sala sala:salasRegistradasDelCine){
            System.out.println(sala);
        }

        //Monto total y sala 4DX
        System.out.println("Parte C:");
        Sala salaMayorVenta4Dx = cine.obtenerSalaMayorVentaAsiento4D();
        System.out.println("La sala con mayor venta y que tiene al menos un asiento 4DX es: " + salaMayorVenta4Dx);

        //D
        System.out.println("Parte D:");
    }
}

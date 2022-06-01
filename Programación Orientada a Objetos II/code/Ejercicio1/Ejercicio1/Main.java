package Taller1.Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Legislador> listaLegisladores = new ArrayList<>();
        //Como instancio un objeto de las clases Diputado y Senador?
        //Las siguientes 3 lineas era solo para recordar.
        /*int numero = 0;
        String nombre = "Luis";
        boolean encontrado = false;*/
        //Con clases:
        Diputado diputado1 = new Diputado("40589623", "Luis", "Vasquez", "Lima");
        Diputado diputado2 = new Diputado("07123456", "María", "Lopez", "Tacna");
        Diputado diputado3 = new Diputado("10111213", "Juan", "Palacios", "Tumbes");

        Senador senador1 = new Senador("12345678", "Lucia", "Peña", "Piura");
        Senador senador2 = new Senador("98765432", "Mario", "Moreno", "Ancash");
        //Agregando los objetos de la clase Diputado
        listaLegisladores.add(diputado1);
        listaLegisladores.add(diputado2);
        listaLegisladores.add(diputado3);
        //Agregando los objetos de la clase Senador
        listaLegisladores.add(senador1);
        listaLegisladores.add(senador2);

        System.out.println("Listado de Legisladores: ");
        for(Legislador milistadeLegisladores:listaLegisladores){
            System.out.println(milistadeLegisladores.mostrarDatos() + ", " + milistadeLegisladores.mostrarCamaraTrabaja());
        }
        //Lo siguiente genera error porque la clase es Abstracta
        //Legislador leg1 = new Legislador();

    }
}

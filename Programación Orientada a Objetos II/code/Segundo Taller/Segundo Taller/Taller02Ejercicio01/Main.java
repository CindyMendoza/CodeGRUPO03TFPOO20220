package Taller02Ejercicio01;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // A)
        // B)

        Tienda tienda = new Tienda();

        Categoria categoriaA = null;
        try {
            categoriaA = new Categoria("CAT01", "Terror");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Categoria categoriaB = null;
        try {
            categoriaB = new Categoria("CAT02", "Animación");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Categoria categoriaC = null;
        try {
            categoriaC = new Categoria("CAT03", "Comedia");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tienda.registrarPelicula("PEL01", "Shrek 1", categoriaB);
        tienda.registrarPelicula("PEL02", "El conjuro", categoriaA);
        tienda.registrarPelicula("PEL03", "Asu Mare", categoriaC);

        tienda.asignarActorAPelicula("PEL01", "Eddie Murphy", "Americana");
        tienda.asignarActorAPelicula("PEL01", "Cameron Diaz", "Americana");
        tienda.asignarActorAPelicula("PEL02", "Vera Farmiga", "Americana");
        tienda.asignarActorAPelicula("PEL02", "Patrick Wilson", "Americana");
        tienda.asignarActorAPelicula("PEL03", "Carlos Alcantara", "Peruana");
        tienda.asignarActorAPelicula("PEL03", "Emilia Drago", "Peruana");

        List<Pelicula> peliculasRegistradas = tienda.getPeliculas();
        for (Pelicula pelicula: peliculasRegistradas) {
            System.out.println(pelicula);
        }

        // C)

        System.out.println("Peliculas Aptas con Actores Peruanos");
        List<Pelicula> peliculasAptas = tienda.listadoPeliculasAptas("Peruana");
        for (Pelicula pelicula: peliculasAptas) {
            System.out.println(pelicula);
        }

        // D)
        try {
            Categoria categoriaD = new Categoria("CAT02", "OtroValor");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
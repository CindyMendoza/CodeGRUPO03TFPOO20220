package Taller02Ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Pelicula> peliculas;

    public Tienda() {
        this.peliculas = new ArrayList<>();
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void registrarPelicula(String codigo, String nombre, Categoria categoria) {
        Pelicula pelicula = new Pelicula(codigo, nombre, categoria);
        peliculas.add(pelicula);
    }

    public Pelicula buscarPelicula(String codigo) {
        for (Pelicula pelicula: peliculas) {
            if (pelicula.getCodigo().equals(codigo)) {
                return pelicula;
            }
        }
        return null;
    }

    public void asignarActorAPelicula(String codigo, String nombre, String nacionalidad) {
        Pelicula pelicula = buscarPelicula(codigo);
        if (pelicula != null) {
            pelicula.registrarActor(nombre, nacionalidad);
        }
    }

    public List<Pelicula> listadoPeliculasAptas(String nacionalidad) {
        List<Pelicula> peliculasAux = new ArrayList<>();
        for (Pelicula pelicula: peliculas) {
            if (pelicula.esAptaParaMenoresEdad() &&
                    pelicula.tieneActorDeNacionalidad(nacionalidad)) {
                peliculasAux.add(pelicula);
            }
        }
        return peliculasAux;
    }

}
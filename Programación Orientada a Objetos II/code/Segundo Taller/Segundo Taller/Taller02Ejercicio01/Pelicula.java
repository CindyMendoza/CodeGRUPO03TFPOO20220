package Taller02Ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

    private String codigo;
    private String nombre;
    private Categoria categoria;
    private List<Actor> actores;

    public Pelicula(String codigo, String nombre, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.actores = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void registrarActor(String nombre, String nacionalidad) {
        Actor actor = new Actor(nombre, nacionalidad);
        actores.add(actor);
    }

    public boolean esAptaParaMenoresEdad() {
        if (categoria.getNombre().equals("Terror") ||
                categoria.getNombre().equals("Suspenso") ||
                categoria.getNombre().equals("Accion")) {
            return false;
        }
        return true;
    }

    public boolean tieneActorDeNacionalidad(String nacionalidad) {
        for (Actor actor: actores) {
            if (actor.getNacionalidad().equals(nacionalidad)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", actores=" + actores +
                '}';
    }
}


package com.clinica;

public class NoExistenDatosException extends Exception {

    @Override
    public String getMessage() {
        return "No existen datos para el criterio de búsqueda";
    }
}

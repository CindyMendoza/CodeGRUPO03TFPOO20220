package com.clinica;

public class NumeroInvalidoException extends Exception {

    @Override
    public String getMessage() {
        return "Número ingresado inválido";
    }
}

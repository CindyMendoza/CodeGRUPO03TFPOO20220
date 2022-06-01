package com.ta2;

public class Masacre extends Participante{
    private Integer puntaje_equipo;
    private Integer puntaje_barra;


    public Masacre(String nombre, String apellido, Integer cant_sms, String dni, Integer edad, Integer puntaje_equipo, Integer puntaje_barra) {
        super(nombre, apellido, cant_sms, dni, edad);
        this.puntaje_equipo = puntaje_equipo;
        this.puntaje_barra = puntaje_barra;
    }

    public Integer getPuntaje_equipo() {
        return puntaje_equipo;
    }

    public void setPuntaje_equipo(Integer puntaje_equipo) {
        this.puntaje_equipo = puntaje_equipo;
    }

    public Integer getPuntaje_barra() {
        return puntaje_barra;
    }

    public void setPuntaje_barra(Integer puntaje_barra) {
        this.puntaje_barra = puntaje_barra;
    }

    @Override
    public Integer calcularPuntaje() {
                return this.getCant_sms() * 4 + this.puntaje_barra + this.puntaje_equipo * 2;
    }
}

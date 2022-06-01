package com.ta2;

public class Televidente extends Participante{
    private Integer cant_llamadas;
    private Integer num_tel;


    public Televidente(String nombre, String apellido, Integer cant_sms, String dni, Integer edad, Integer cant_llamadas, Integer num_tel) {
        super(nombre, apellido, cant_sms, dni, edad);
        this.cant_llamadas = cant_llamadas;
        this.num_tel = num_tel;
    }

    public Integer getCant_llamadas() {
        return cant_llamadas;
    }

    public void setCant_llamadas(Integer cant_llamadas) {
        this.cant_llamadas = cant_llamadas;
    }

    public Integer getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(Integer num_tel) {
        this.num_tel = num_tel;
    }

    @Override
    public Integer calcularPuntaje() {
        return this.getCant_sms() * 4 + this.cant_llamadas * 3;
    }
}

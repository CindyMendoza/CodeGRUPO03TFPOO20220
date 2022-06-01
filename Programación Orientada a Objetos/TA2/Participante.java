package com.ta2;

public abstract class Participante {
    private String nombre;
    private String apellido;
    private Integer cant_sms;
    private String dni;
    private Integer edad;

    public Participante(String nombre, String apellido, Integer cant_sms, String dni, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cant_sms = cant_sms;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCant_sms() {
        return cant_sms;
    }

    public void setCant_sms(Integer cant_sms) {
        this.cant_sms = cant_sms;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }


    public void setEdad(Integer edad) {
            this.edad = edad;
    }

    public abstract Integer calcularPuntaje();

    @Override
    public String toString() {
        return "Participante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cant_sms=" + cant_sms +
                ", dni='" + dni + '\'' +
                ", edad='" + edad + '\'' +
                ", calcularPuntaje=" + calcularPuntaje() +
                '}';
    }
}

package Taller02Ejercicio02;

public class Vuelo {

    private String codigo;
    private Avion avion;
    private String origen;
    private String destino;

    public Vuelo(String codigo, String origen, String destino) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public void asignarAvion(Avion avion) {
        this.avion = avion;
    }

    public boolean tieneAvionConModelo(String modelo) {
        if (avion.getModelo().equals(modelo)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vuelo" +
                " codigo= " + codigo +
                " origen= " + origen +
                " destino= " + destino +
                " avion= " + avion;
    }
}
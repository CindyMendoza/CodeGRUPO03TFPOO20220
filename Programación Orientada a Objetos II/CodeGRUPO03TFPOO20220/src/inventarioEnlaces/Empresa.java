package TF;

import java.util.List;

public class Empresa {
    private String nombre;
    private String ruc;

    public Empresa() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Empresa(String nombre, String ruc) {
        this.nombre = nombre;
        this.ruc = ruc;

    }

    public String getNombre() {
        return nombre;
    }

    public String getRuc() {
        return ruc;
    }

    @Override
    public String toString(){
        return "Empresa: " +
                " nombre: " + nombre + " ruc: " + ruc ;
    }



}

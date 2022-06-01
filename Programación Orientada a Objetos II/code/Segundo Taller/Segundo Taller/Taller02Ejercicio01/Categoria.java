package Taller02Ejercicio01;

public class Categoria {

    private String codigo;
    private String nombre;

    public Categoria(String codigo, String nombre) throws Exception {
        if (!nombre.equals("Terror") && !nombre.equals("Suspenso")
                && !nombre.equals("Acción") && !nombre.equals("Comedia")
                && !nombre.equals("Animación")) {
            throw new Exception("Categoría inválida");
        }
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
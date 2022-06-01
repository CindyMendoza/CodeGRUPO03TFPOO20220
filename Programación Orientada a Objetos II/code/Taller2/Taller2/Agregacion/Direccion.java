package Taller2.Agregacion;

public class Direccion {
    private String direccion;
    private String distrito;
    private String provincia;
    private String departamento;

    public Direccion(String direccion, String distrito, String provincia, String departamento) {
        this.direccion = direccion;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
    }

    public Direccion() {
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

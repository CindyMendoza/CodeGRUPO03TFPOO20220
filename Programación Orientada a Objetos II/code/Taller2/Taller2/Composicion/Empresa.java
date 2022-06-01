package Taller2.Composicion;

public class Empresa {
    private String ruc;
    private String razonSocial;
    private Direccion direccion;

    public Empresa(String ruc, String razonSocial, Direccion direccion) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
    }

    public Empresa() {
    }

    public Empresa(String ruc, String razonSocial, String direccion, String distrito, String provincia, String departamento){
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        //Aqui instancio un objeto de la clase Direccion
        this.direccion = new Direccion(direccion, distrito, provincia, departamento);
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void mostrarDatosEmpresa(){
        System.out.println("Datos de la empresa: " + " RUC = " + ruc + ", razón social = " + razonSocial);
        //if (direccion != null) {
            System.out.println("Su dirección es: " + direccion.getDireccion() + " " + direccion.getDistrito() + " " + direccion.getProvincia() + " " + direccion.getDepartamento());
        //}
    }
}

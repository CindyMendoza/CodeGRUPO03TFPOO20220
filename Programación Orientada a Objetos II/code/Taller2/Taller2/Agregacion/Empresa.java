package Taller2.Agregacion;

public class Empresa {
    private String ruc;
    private String razonSocial;
    private Direccion direccion;

    public Empresa(String ruc, String razonSocial, Direccion direccion) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        //Aquí solo envío como parámetro la instancia de la clase Dirección
        this.direccion = direccion;
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
        if (direccion != null) {
            System.out.println("Su dirección es: " + direccion.getDireccion() + " " + direccion.getDistrito() + " " + direccion.getProvincia() + " " + direccion.getDepartamento());
        }
    }
}

package Taller2.Composicion;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("20123456789", "Empresa QWE", "Av. San Borja Sur 125", "San Borja", "Lima", "Lima");
        Empresa empresa2 = new Empresa("20698574123", "Empresa FIFO", "Av. Aviacion 2714", "San Borja", "Lima", "Lima");

        empresa1.mostrarDatosEmpresa();
        empresa2.mostrarDatosEmpresa();


    }
}

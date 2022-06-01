package Taller2.Agregacion;

public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Av. San Borja Norte 1452", "San Borja", "Lima", "Lima");
        Direccion direccion2 = new Direccion("Av. Javier Prado Este 2563", "Surco", "Lima", "Lima");

        //Instancio las empresas con sus direcciones respectivas
        Empresa empresa1 = new Empresa("20123456789", "Empresa XyZ", direccion1);
        Empresa empresa2 = new Empresa("20987654326", "Android Enterprise", direccion2);
        Empresa empresa3 = new Empresa("20654789321", "Empresa ABC", null);

        //Mostrar datos en pantalla
        empresa1.mostrarDatosEmpresa();
        empresa2.mostrarDatosEmpresa();
        empresa3.mostrarDatosEmpresa();

        empresa1 = null;
        //empresa1.mostrarDatosEmpresa();
        System.out.println(direccion1.getDireccion());
        System.out.println(direccion2.getDireccion());
    }
}

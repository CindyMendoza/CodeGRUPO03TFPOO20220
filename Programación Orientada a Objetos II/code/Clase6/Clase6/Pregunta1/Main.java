package Clase6.Pregunta1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("2.- ");
        Refrigeradora refrigeradora = new Refrigeradora();

        Fruta fruta1 = new Fruta("P001", "Pera", 1.0, 5, true);
        Fruta fruta2 = new Fruta("P002", "Manzana", 2.5, 10, false);

        Liquido liquido1 = new Liquido("P003", "Gaseosa 2.5 Lt", 7.0, 2500, "Fanta");
        Liquido liquido2 = new Liquido("P004", "Gaseosa 40 ml", 2.0, 40, "KR");

        refrigeradora.registrarProducto(fruta1);
        refrigeradora.registrarProducto(fruta2);
        refrigeradora.registrarProducto(liquido1);
        refrigeradora.registrarProducto(liquido2);
        //Mostrar informacion
        System.out.println("Listado de productos de mi refrigeradora: ");

        List<Producto> productosRegistrados = refrigeradora.getProductos();
        for(Producto prod:productosRegistrados){
            System.out.println("Producto: " + prod.getCodigo() + " " + prod.getNombre() + " S/ " + prod.getPrecio());
        }

        System.out.println("Parte C: ");
        System.out.println("¿Existe alguna fruta dulce?");
        /*if(refrigeradora.verificarExisteFrutaDulce())
        {
            System.out.println("SI");
        }
        else{
            System.out.println("NO");
        }*/
        //?: Operador Ternario
        System.out.println(refrigeradora.verificarExisteFrutaDulce() ? "SI" : "NO");

        //D.-
        System.out.println("Parte D: ");
        System.out.println("Valor total referencial de mi refrigeradora: ");
        System.out.println("S/ " + refrigeradora.calcularValorTotalProductos());
    }
}

package com.pa1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Producto productoA = new Producto("P0001", "Producto A",3,3.5);
        Producto productoB = new Producto("P0002", "Producto B",2,2.5);
        Producto productoC = new Producto("P0003", "Producto C",1,1.5);
        Producto productoD = new Producto("P0004", "Producto D",1,0.5);
        Producto productoE = new Producto("P0005", "Producto E",2,1.5);
        Producto productoF = new Producto("P0006", "Producto F",3,2.5);

        Pasteleria pasteleriaA = new Pasteleria(001,"Pastelitos A","Calle foresta 246",null);
        Pasteleria pasteleriaB = new Pasteleria(002,"Pastelitos B","Av Separadora 151",null);
        pasteleriaA.registrarProducto(productoA);
        pasteleriaA.registrarProducto(productoB);
        pasteleriaA.registrarProducto(productoC);
        pasteleriaB.registrarProducto(productoD);
        pasteleriaB.registrarProducto(productoE);
        pasteleriaB.registrarProducto(productoF);
        for(Producto p:pasteleriaA.getProductos()){
            System.out.println(p);
        }

    }
}

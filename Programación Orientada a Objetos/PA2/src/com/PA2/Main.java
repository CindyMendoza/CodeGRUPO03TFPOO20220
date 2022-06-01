package com.PA2;

public class Main {

    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta("B001","2020","Xtrem","MB01","Negro","Urbana",4,true);
        Bicicleta bici2 = new Bicicleta("B002","2018","Xtrem","MB02","Blanco","Montañera",2,true);
        Bicicleta bici3 = new Bicicleta("B003","2019","Xtrem","MB03","Rojo","Ruta",2,false);
        Scooter scot1 = new Scooter("S001","2011","Xiaomi","X001","Amarillo","XM01",24);
        Scooter scot2 = new Scooter("S002","2011","Xiaomi","X002","Verde","XM02",48);
        Scooter scot3 = new Scooter("S003","2019","Xiaomi","X003","Morado","XM03",72);
        System.out.println("--------- Registrando vehiculos -----------");
        Municipalidad muni1 = new Municipalidad(null,"Cieneguilla");
        muni1.registrarVehiculo(bici1);
        muni1.registrarVehiculo(bici2);
        muni1.registrarVehiculo(bici3);
        muni1.registrarVehiculo(scot1);
        muni1.registrarVehiculo(scot2);
        muni1.registrarVehiculo(scot3);
        System.out.println("--------- Listado de vehiculos -----------");
        System.out.println(muni1.listarVehiculos());
        System.out.println("--------- Vehiculo con mayor velocidad -----------");
        System.out.println(muni1.CalcularMayorVelocidad());
        System.out.println("--------- Búsqueda  por el código del vehículo -----------");
        System.out.println(muni1.buscarVehiculoXCodigo("S001"));
        System.out.println("--------- Búsqueda  por el año de compra -----------");
        System.out.println(muni1.buscarVehiculoXAnio("2011"));

    }
}

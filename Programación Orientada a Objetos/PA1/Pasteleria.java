package com.pa1;

import java.util.ArrayList;
import java.util.List;

public class Pasteleria {
    private Integer ruc;
    private String nombre;
    private String direccion;
    private List<Producto> productos;
    public Pasteleria(Integer ruc, String nombre, String direccion,List<Producto> productos) {
        this.ruc = ruc;
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }

    public Pasteleria getProductos() {
        return productos;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public Integer getRuc() {
        return ruc;
    }

    public void setRuc(Integer ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void registrarProducto(Producto producto) {
        productos.add(producto);
    }
    public double calcularTotalVenta(Producto producto) {
        return  producto.getCantidad()*producto.getPrecio()*0.18;
    }
}

package Taller02Ejercicio02;

public class Asiento {

    private int numero;
    private String letra;

    public Asiento(int numero, String letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public String getLetra() {
        return letra;
    }

    public double obtenerPrecioBase() {
        double precioBase = 0;
        if (letra.equals("A") || letra.equals("C") || letra.equals("D") || letra.equals("F")) {
            precioBase = 80;
        } else if (letra.equals("B") || letra.equals("E")) {
            precioBase = 60;
        }
        return precioBase;
    }

    public double obtenerFactor() {
        double factor = 0;
        if (numero < 7) {
            factor = 1.5;
        } else if (numero <= 16 && numero >= 7) {
            factor = 1.3;
        } else {
            factor = 1.15;
        }
        return factor;
    }

    public double calcularPrecioFinal() {
        double precioBase = obtenerPrecioBase();
        double factor = obtenerFactor();
        return precioBase * factor;
    }

    @Override
    public String toString() {
        return "Asiento:" +
                " numero= " + numero +
                " letra= " + letra +
                " precio= $" + calcularPrecioFinal();
    }
}
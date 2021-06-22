package com.upc.repetitiva;

/*
Ejercicio que implementa la estructura repetitiva for:
El objetivo es determinar el promedio de la suma de los números impares de un arreglo, y
eliminar los elementos duplicados del arreglo
 */

public class EjercicioFor {

    public static int eliminarDuplicados(int[] arreglo, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int posicion = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arreglo[i] != arreglo[i + 1]) {
                temp[posicion++] = arreglo[i];
            }
        }

        temp[posicion++] = arreglo[n - 1];

        // Cambiando arreglo original
        for (int i = 0; i < posicion; i++) {
            arreglo[i] = temp[i];
        }

        return posicion;
    }

    public static int[] sumaImpares(int[] arreglo) {
        int suma = 0;
        int cantidad = 0;
        int[] respuesta = new int[2];
        for (int i = 0; i < arreglo.length; i++) {
            if (i != 0 && i % 2 != 0) {
                suma += arreglo[i];
                cantidad++;
            }
        }

        respuesta[0] = suma;
        respuesta[1] = cantidad;

        return respuesta;
    };

    public static void main(String[] args) {
        //Datos del problema
        int[] arreglo = {1, 2, 2, 4, 6, 9, 9, 11, 18, 18};
        int length = arreglo.length;

        //Cálculo del promedio de la suma de números impares
        int[] sumaCantidad = sumaImpares(arreglo);
        double promedioSumaImpares = (double) sumaCantidad[0] / sumaCantidad[1];

        System.out.println("El promedio de números impares es: " + promedioSumaImpares);

        System.out.println("");

        //Eliminar números duplicados del arreglo
        length = eliminarDuplicados(arreglo, length);

        System.out.println("Arreglo sin duplicados: ");

        for (int i = 0; i < length; i++) {
            if (i == length) {
                System.out.print(arreglo[i]);
            } else {
                System.out.print(arreglo[i] + ",");
            }
        }
    }
}

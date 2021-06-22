package com.upc.repetitiva;
import java.util.*;

/*
Ejercicio que implementa la estructura repetitiva while:
El programa utiliza la búsqueda binaria para permitirle al usuario
determinar si el número ingresado está o no en un arreglo de números
 */

public class EjercicioWhile {
    public static int  binarySearch(int [] array, int valor, int index) {

        // Valores iniciales
        int izquierda = 0;
        int derecha = array.length - 1;

        // While there is a section having length > 0 to search
        // Ejecutar mientras las secciones tengan por lo menos 1 elemento length >0
        while(izquierda <= derecha && index < 0) {
            int mid = izquierda + ((derecha - izquierda) / 2);

            // Si el valor es encontrado
            if(array[mid] == valor) {
                index = mid;
                break;
            }
            // Si valor < array[mid], buscar en sección izquierda
            else if(valor < array[mid]) {
                // buscar en sección izquierda
                derecha = mid - 1;
            }
            else { // Si valor > array[mid], buscar en sección derecha
                izquierda = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,16,18,20,21};
        int index = -1;
        int valor = 4;

       index = binarySearch(array, valor, index);

        System.out.println(
                (index > -1)
                        ? "Valor '" + valor + "' se encontró en el índice: " + index
                        : "Valor '" + valor + "' no fue encontrado en el arreglo: " + Arrays.asList(array)
        );
    }
}

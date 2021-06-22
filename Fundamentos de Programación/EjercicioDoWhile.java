package com.upc.repetitiva;

import java.util.Scanner;

/*
Ejercicio que implementa la estructura repetitiva do-while:
El objetivo es permitir al usuario ingresar un valor entre 1 y 100,
el programa finalizará cuando el número ingresado por el usuario coincide
con el número aleatorio generado por el programa
 */

public class EjercicioDoWhile {

    public static void main(String[] args) {
        int numeroAleatorio;      // valor a ser adivinado
        int numero;    // almacena valor ingresado por usuario

        // Objeto scanner para capturar datos de usuario
        Scanner console = new Scanner(System.in);

        // Asignar un número aleatorio a ser adivinado
        numeroAleatorio = (int) (Math.random() * 100) + 1;

        do {
            System.out.print("Ingrese un número entero entre 1 y 100: ");
            numero = console.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("Adivinaste el número correcto!");
            } else if (numero < numeroAleatorio) {
                System.out.println(
                        "El número ingresado es menor al número objetivo.\nPrueba de nuevo!");
            } else {
                System.out.println(
                        "El número ingresado es mayor al número objetivo.\nPrueba de nuevo!");
            }
        }

        while (numero != numeroAleatorio);
    }
}


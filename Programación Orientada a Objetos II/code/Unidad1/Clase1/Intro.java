package Clase1;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        String nombre = "Luis";
        int anioActual;
        int edad;
        System.out.println("Hola Mundo!!!");
        System.out.println("Bienvenidos al curso de Programación Orientada a Objetos!!!");
        System.out.println("Tu nombre es: " + nombre);

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Hola " + nombre + ", tu edad es: " + edad);

    }
}

import java.util.Scanner;

public class Pregunta_1 {
    public static void main(String[] args){

        /* 01. DECLARAR VARIABLES */
        Scanner sc = new Scanner(System.in);
        int bebidas_1, bebidas_2, sanguches_1, sanguches_2;
        double precio_b1 = 2.50;
        double precio_b2 = 3.40;
        double precio_s1 = 2.50;
        double precio_s2 = 3.40;
        double precio_s2_2 = 6.50;
        double division_b2, modulo_b2, division_s2, modulo_s2, total_bebidas, total_sanguches, total;

        /* 02. CAPTURAR DATOS */
        System.out.println("Ingrese la cantidad de bebidas sin leche: ");
        bebidas_1 = sc.nextInt();

        System.out.println("Ingrese la cantidad de bebidas con leche: ");
        bebidas_2 = sc.nextInt();

        System.out.println("Ingrese la cantidad de sanguches tipo 1: ");
        sanguches_1 = sc.nextInt();

        System.out.println("Ingrese la cantidad de sanguches tipo 2: ");
        sanguches_2 = sc.nextInt();

        /* 03. OPERACIONES */

        // VENTA DE BEBIDAS
        if(bebidas_2 % 2 == 0){
            division_b2 = bebidas_2 / 2;
            total_bebidas = precio_b1 * bebidas_1
                          + precio_b2 * division_b2
                          + precio_b2 * division_b2 * 0.5;
        }else{
            division_b2 = (bebidas_2-1) / 2;
            total_bebidas = precio_b1 * bebidas_1
                          + precio_b2 * division_b2
                          + precio_b2 * division_b2 * 0.5
                          + precio_b2;
        }

        // VENTA DE SANGUCHES
        if(sanguches_2 % 2 == 0){
            division_s2 = sanguches_2 / 2;
            total_sanguches = precio_s1 * sanguches_1
                            + precio_s2_2 * division_s2;
        }else{
            division_s2 = (sanguches_2-1) / 2;
            total_sanguches = precio_s1 * sanguches_1
                            + precio_s2_2 * division_s2
                            + precio_s2;
        }

        total = total_bebidas + total_sanguches;

        /* 04. RESULTADOS */
        System.out.printf("El importe a cobrar es: %.1f \n", total);
    }
}

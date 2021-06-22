import java.util.Scanner;

public class Ejercicio02
{
    public static void main(String[] args)
    {
        //01. Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        double lado_a, lado_b, lado_c, area;
        double area_triangulo, area_rectangulo;

        //02. Captura de datos
        System.out.println("\nIngrese el lado A: ");
        lado_a = sc.nextDouble();

        System.out.println("\nIngrese el lado B: ");
        lado_b = sc.nextDouble();

        System.out.println("\nIngrese el lado C: ");
        lado_c = sc.nextDouble();

        //03. Calculos
        // Area del Triangulo
        area_triangulo = (lado_b * (lado_a - lado_c)) / 2; // 25m2

        // Area del Rectangulo
        area_rectangulo = lado_b * lado_c; // 50m2

        // Area total
        area = area_triangulo + area_rectangulo;

        //04. Resultado
        System.out.println("\nEl area total es de : " + area + "m2");
    }
}

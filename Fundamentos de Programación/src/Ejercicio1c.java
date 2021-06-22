import java.util.Scanner;

public class Ejercicio1c
{
    public static void main(String[] args)
    {
        //01. Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;

        double area1;
        double area2;
        double areaTotal;

        //02. Captura de Valores
        System.out.println("Ingrese el lado A: ");
        a = sc.nextDouble();

        System.out.println("Ingrese el labo B: ");
        b = sc.nextDouble();

        System.out.println("Ingrese el lado C");
        c = sc.nextDouble();

        //03. Cálculos
        area1       = (a - c) * b / 2;  // Formula del área de un triángulo
        area2       = c * b;            // Formula del área de un rectángulo
        areaTotal   = area1 + area2;

        //04. Resultado
        System.out.printf("\nEl resultado es: %.2f \n", areaTotal);
    }
}

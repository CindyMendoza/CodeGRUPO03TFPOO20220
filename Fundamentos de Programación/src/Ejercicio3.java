import java.util.Scanner;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        //01. Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        double altura;
        double largo;
        double ancho;
        double costoXMetroCubico;

        double volumen;
        double aPagar;

        //02. Captura de Valores
        System.out.println("Ingrese la altura: ");
        altura = sc.nextDouble();

        System.out.println("Ingrese el largo: ");
        largo = sc.nextDouble();

        System.out.println("Ingrese el ancho");
        ancho = sc.nextDouble();

        System.out.println("Ingrese el costo por metro cúbico");
        costoXMetroCubico = sc.nextDouble();

        //03. Cálculos
        volumen = altura * largo * ancho;
        aPagar = volumen * costoXMetroCubico;

        //04. Resultado
        System.out.printf("\nEl resultado es: %.2f \n", aPagar);
    }
}

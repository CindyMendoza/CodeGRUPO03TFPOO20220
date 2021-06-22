import java.util.Scanner;

public class Ejercicio2
{
    public static void main(String[] args)
    {
        //01. Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        double horas;
        double pagoxHora;

        double sueldoBruto;
        double descuento;
        double sueldoNeto;

        //02. Captura de Valores
        System.out.println("Ingrese las horas trabajadas: ");
        horas = sc.nextDouble();

        System.out.println("Ingrese el pago por hora: ");
        pagoxHora = sc.nextDouble();

        //03. Cálculos
        sueldoBruto = horas * pagoxHora;
        descuento = sueldoBruto * 0.10;
        sueldoNeto = sueldoBruto - descuento;

        //04. Resultado
        System.out.printf("\nEl importe a recibir es: %.2f \n", sueldoNeto);
    }
}

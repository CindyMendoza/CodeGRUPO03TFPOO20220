import java.util.Scanner;

public class Ejercicio4b
{
    public static void main(String[] args)
    {
        //01. Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        double horas;
        double importexHora;

        double importeACobrar;

        //02. Captura de Valores
        System.out.println("Ingrese las horas trabajadas: ");
        horas = sc.nextDouble();

        System.out.println("Ingrese el importe por hora: ");
        importexHora = sc.nextDouble();

        //03. Cálculos
        //Math.ceil() devuelve el entero mayor o igual más próximo a un número dado
        importeACobrar = Math.ceil(horas) * importexHora;

        //04. Resultado
        System.out.printf("\nEl importe a recibir es: %.2f \n", importeACobrar);
    }
}

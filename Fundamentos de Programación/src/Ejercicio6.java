import java.util.Scanner;

public class Ejercicio6
{
    public static void main(String[] args)
    {
        //01. Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        int nro_meses;

        int cobro_x_mes;
        double membresia;

        //02. Captura de Valores
        System.out.println("Ingrese el número de meses de suscripción (máximo 12):");
        nro_meses = sc.nextInt();

        //03. Cálculos
        if(nro_meses > 12)
            cobro_x_mes = 0;
        else if (nro_meses >= 5)
            cobro_x_mes = 80;
        else if (nro_meses >= 2)
            cobro_x_mes = 100;
        else
            cobro_x_mes = 120;

        membresia = cobro_x_mes * nro_meses;

        //04. Resultado
        System.out.printf("\nLa membresia es de: %.2f \n", membresia);
    }
}
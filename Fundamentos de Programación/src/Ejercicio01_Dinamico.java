import java.util.Scanner;

public class Ejercicio01_Dinamico
{
    public static void main(String[] args)
    {
        //01. Declarar Variable
        Scanner sc = new Scanner(System.in);
        int horas_trabajo;
        double pago_x_hora, sueldo, porcentaje_dscto;

        //02. Lectura de Datos
        System.out.println("\nCuantas horas trabajó HOY?: ");
        horas_trabajo = sc.nextInt();

        System.out.println("\nCual es su pago por horas?: ");
        pago_x_hora = sc.nextDouble();

        System.out.println("\nCual es el porcentaje de descuento?: ");
        porcentaje_dscto = sc.nextDouble();

        //03. Calculos
        sueldo = pago_x_hora * horas_trabajo;
        sueldo = sueldo * (1 - porcentaje_dscto/100);

        //03. Resultado
        System.out.println("\nEl sueldo calculado es de: " + sueldo);
    }
}
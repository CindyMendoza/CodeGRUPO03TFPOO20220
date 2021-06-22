import java.util.Scanner;

public class Ejercicio_06
{
    public static void main(String[] args)
    {
        //01.Declaracion de variables
        Scanner sc = new Scanner(System.in);
        double comision;
        int cantidad_49, cantidad_99, cantidad_199;

        //02.Captura de Datos
        System.out.println("Ingrese el nro de paquetes de 49 vendidos: ");
        cantidad_49 = sc.nextInt();

        System.out.println("Ingrese el nro de paquetes de 99 vendidos: ");
        cantidad_99 = sc.nextInt();

        System.out.println("Ingrese el nro de paquetes de 199 vendidos: ");
        cantidad_199 = sc.nextInt();

        //03.Calculo a traves de metodos
        comision = calcula_comision(cantidad_49, cantidad_99, cantidad_199);

        //04.Mostrar Resultados
        //System.out.println("\nEl pago total de comision es: S/." + comision);
        System.out.printf("\nEl pago total de comision es: S/.%.2f \n", comision);
    }

    static double calcula_comision(int plan_49, int plan_99, int plan_199)
    {
        double comision = 0, bono;
        double subtotal_49, subtotal_99, subtotal_199;
        int total_paquetes;

        subtotal_49  = plan_49  *  50 * 0.03;
        subtotal_99  = plan_99  * 100 * 0.07;
        subtotal_199 = plan_199 * 200 * 0.15;

        comision = subtotal_49 + subtotal_99 + subtotal_199;

        total_paquetes = plan_49 + plan_99 + plan_199;

        if(total_paquetes >= 8 && total_paquetes <=12)
            bono = 0.1;
        else if(total_paquetes >= 13 && total_paquetes <=17)
            bono = 0.15;
        else if(total_paquetes > 17)
            bono = 0.2;
        else
            bono = 0;

        comision = comision * (1 + bono);

        return comision;
    }
}
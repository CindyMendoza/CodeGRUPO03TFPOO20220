import java.util.Scanner;

public class Ejercicio5
{
    public static void main(String[] args)
    {
        //01. Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        int bebidas;
        int sanguches;

        double monto_bebidas;
        double monto_sanguches;
        double descuento;
        double monto_total;

        //02. Captura de Valores
        System.out.println("Ingrese el número de bebidas consumidas: ");
        bebidas = sc.nextInt();

        System.out.println("Ingrese el número de sanguches consumidos: ");
        sanguches = sc.nextInt();

        //03. Cálculos
        monto_bebidas = bebidas * 3.00;
        monto_sanguches = sanguches * 2.00;
        descuento = (monto_bebidas * 0.1) +  (monto_sanguches * 0.1);
        monto_total = monto_bebidas + monto_sanguches - descuento;

        //04. Resultado
        System.out.printf("\nEl importe a sobrar es: %.2f \n", monto_total);
    }
}

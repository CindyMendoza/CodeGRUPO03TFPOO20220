import java.util.Scanner;

public class Pregunta_03
{
    public static void main(String[] args)
    {
        //Declaracion de variables
        Scanner sc = new Scanner(System.in);
        int contrato;
        double m3_consumidos;

        //Captura de Datos
        System.out.println("Ingrese el número de contrato: ");
        contrato = sc.nextInt();
        System.out.println("Ingrese la cantidad de m3 consumidos: ");
        m3_consumidos = sc.nextDouble();

        //Operaciones

        //METODO 1
        double importe = calculaImporte(m3_consumidos);
        System.out.printf("\nEl Importe es de: %.2f \n", importe);

        //METODO 1
        double mantenimiento = calculaMantenimiento(contrato, importe);
        System.out.printf("El Mantenimiento es de: %.2f \n", mantenimiento);

        //METODO 1
        double total = calculaTotal(contrato, importe, mantenimiento);
        System.out.printf("El Total es de: %.2f \n", total);
    }

    static double calculaImporte(double m3_consumidos)
    {
        double importe = 0;

        if(m3_consumidos > 0 && m3_consumidos<10)
            importe = m3_consumidos * 3;
        else if(m3_consumidos >= 10 && m3_consumidos<30)
            importe = m3_consumidos * 2.5;
        else if(m3_consumidos >= 30 && m3_consumidos<50)
            importe = m3_consumidos * 2.2;
        else if(m3_consumidos >= 50)
            importe = m3_consumidos * 2;

        return importe;
    }

    static double calculaMantenimiento(int contrato, double importe)
    {
        double mantenimiento = 0;

        if(contrato % 2 == 0)
            mantenimiento = importe * 0.021;
        else
            mantenimiento = importe * 0.014;

        return mantenimiento;
    }

    static double calculaTotal(int contrato, double importe, double mantenimiento)
    {
        double IGV = 0, total = 0;

        IGV = (importe + mantenimiento) * 0.19;

        if(contrato % 10 == 0)
            total = importe + mantenimiento;
        else
            total = IGV + importe + mantenimiento;

        return total;
    }
}


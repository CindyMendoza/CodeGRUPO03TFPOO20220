import java.util.Scanner;

public class Ejercicio_05
{
    public static void main(String[] args)
    {
        // 01.Declaracion de Variables
        Scanner sc = new Scanner(System.in);
        String grado_instruccion;
        int tarifa_x_hora, antiguedad, porcentaje_aumento, minutos_tardanza, bono, horas_del_mes;
        double pago_mensual;

        // 02.Captura de Datos
        System.out.println("Ingrese Grado de instruccion: " +
                "(B) Bachiller    " +
                "(T) Titulado    " +
                "(M) Maestría    " +
                "(D) Doctorado");
        grado_instruccion = sc.nextLine();

        System.out.println("Ingrese los años de antiguedad del docente:");
        antiguedad = sc.nextInt();

        System.out.println("Ingrese los minutos de tardanza en el mes:");
        minutos_tardanza = sc.nextInt();

        System.out.println("Ingrese en total de horas trabajadas en el mes:");
        horas_del_mes = sc.nextInt();

        // 03.Llamada a metodos
        tarifa_x_hora = calcular_tarifa_x_horas(grado_instruccion);
        porcentaje_aumento = calcular_aumento(antiguedad);
        bono = calcular_bono(minutos_tardanza);

        pago_mensual = calcular_pago_mensual(tarifa_x_hora, horas_del_mes, porcentaje_aumento, bono);
        //pago_mensual = calculo_pago_2(grado_instruccion, antiguedad, minutos_tardanza, horas_del_mes);

        // 04.Mostrar Resultados
        System.out.println("\nLa tarifa por Hora del Docente es: S/." + tarifa_x_hora);
        System.out.println("El porcentaje de aumento es de: " + porcentaje_aumento + "%");
        System.out.println("El bono a entregar es: S/." + bono);
        System.out.println("El pago total del mes es de : S/." + pago_mensual);
    }

    static int calcular_tarifa_x_horas(String grado)
    {
        int tarifa = 0;

        if(grado == "B" || grado.equals("B"))
            tarifa = 40;
        else if(grado == "T" || grado.equals("T"))
            tarifa = 54;
        else if(grado == "M" || grado.equals("M"))
            tarifa = 72;
        else if(grado == "D" || grado.equals("D"))
            tarifa = 100;
        else
            tarifa = 0;

        return tarifa;
    }

    static int calcular_aumento(int antiguedad)
    {
        int porcentaje_aumento = 0;

        if(antiguedad > 10)
            porcentaje_aumento = 10;
        else if(antiguedad >= 6 && antiguedad <=10)
            porcentaje_aumento = 7;
        else if(antiguedad >= 3 && antiguedad <=5)
            porcentaje_aumento = 5;
        else if(antiguedad > 0 && antiguedad <=3)
            porcentaje_aumento = 3;
        else
            porcentaje_aumento = 0;

        return porcentaje_aumento;
    }

    static int calcular_bono(int minutos)
    {
        int bono = 0;

        if(minutos == 0)
            bono = 120;
        else if(minutos >= 1 && minutos <= 5)
            bono = 80;
        else if(minutos >= 6 && minutos <= 10)
            bono = 40;
        else if(minutos >= 11 && minutos <= 15)
            bono = 0;
        else if(minutos >= 16)
            bono = -40;

        return bono;
    }

    static double calcular_pago_mensual(int tarifa_x_hora, int horas_trabajadas, int porcentaje_aumento, int bono)
    {
        double pago_mensual = 0, subtotal_1, subtotal_2;

        subtotal_1 = tarifa_x_hora * horas_trabajadas;
        subtotal_2 = subtotal_1 * (1 + (((double)porcentaje_aumento/100)));
        pago_mensual = subtotal_2 + bono;

        return pago_mensual;
    }

    static double calculo_pago_2(String grado_instruccion, int antiguedad, int minutos_tardanza, int horas_del_mes)
    {
        double pago_mensual = 0, subtotal_1, subtotal_2;
        int tarifa_x_hora, porcentaje_aumento, bono;

        tarifa_x_hora = calcular_tarifa_x_horas(grado_instruccion);
        porcentaje_aumento = calcular_aumento(antiguedad);
        bono = calcular_bono(minutos_tardanza);

        subtotal_1 = tarifa_x_hora * horas_del_mes;
        subtotal_2 = subtotal_1 * (1 + (((double)porcentaje_aumento/100)));
        pago_mensual = subtotal_2 + bono;

        return pago_mensual;
    }
}
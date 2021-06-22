public class Ejercicio01_Fijo
{
    public static void main(String[] args)
    {
        //01. Declarar Variable
        int horas_trabajo = 8;
        double pago_x_hora = 10, sueldo, porcentaje_dscto = 0.1;

        //02. Calculos
        sueldo = pago_x_hora * horas_trabajo;
        sueldo = sueldo * (1 - porcentaje_dscto);

        //03. Resultado
        System.out.println("\nEl sueldo calculado es de: " + sueldo);
    }
}
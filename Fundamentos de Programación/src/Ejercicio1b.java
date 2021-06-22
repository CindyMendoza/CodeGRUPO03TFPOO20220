public class Ejercicio1b
{
    public static void main(String[] args)
    {
        //01. Declaracion de Variables
        double a;
        double b;
        double c;

        double area1;
        double area2;
        double areaTotal;

        //02. Asignacion de Valores
        a = 90.555;
        b = 40.124;
        c = 59.652;

        //03. Cálculos
        area1       = (a - c) * b / 2;  // Formula del área de un triángulo
        area2       = c * b;            // Formula del área de un rectángulo
        areaTotal   = area1 + area2;

        //04. Resultado
        System.out.println("El resultado es: " + areaTotal); // un decimal
        System.out.printf("El resultado es: %.2f \n", areaTotal); // dos decimales
    }
}

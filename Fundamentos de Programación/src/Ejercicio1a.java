public class Ejercicio1a
{
    public static double areaTerreno(a,b,c){
        double area1;
        double area2;
        double areaTotal;
        area1       = (a - c) * b / 2;  // Formula del área de un triángulo
        area2       = c * b;            // Formula del área de un rectángulo
        areaTotal   = area1 + area2;
        return areaTotal;
    }
    public static void main(String[] args)
    {

        System.out.println("El resultado es: " + areaTerreno(90,40,60));
    }
}

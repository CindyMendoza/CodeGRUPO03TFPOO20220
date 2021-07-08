import java.util.Scanner;

public class Pregunta_02 {
    public static void main(String[] args) {

        //01.Declaracion de variables
        Scanner sc = new Scanner(System.in);
        double basica;
        int hijos;
        String cargo;

        //02.Captura de Datos
        System.out.println("Ingrese remuneracion basica: ");
        basica = sc.nextDouble();

        System.out.println("Ingrese cantidad de hijos: ");
        hijos = sc.nextInt();

        sc.nextLine();
        System.out.println("Ingrese cargo ('O', 'E'): ");
        cargo = sc.nextLine();

        //04.Resultados
        System.out.printf("La Bonificación 1 es: %.2f \n", calcularB1(cargo));
        System.out.printf("La Bonificación 2 es: %.2f \n", calcularB2(hijos));
        System.out.printf("La remuneracion total es: %.2f \n", calcularTOTAL(basica, hijos, cargo));
    }

    static double calcularB1(String cargo){
        double B1 = 0.0;

        if(cargo.equals("O"))
            B1 = 100;
        else if (cargo.equals("E"))
            B1 = 150;

        return B1;
    }

    static double calcularB2(int hijos){
        double B2 = 0.0;

        if(hijos == 1 || hijos ==2)
            B2 = 50 * hijos;
        else if (hijos>2)
            B2 = 40 * hijos;

        return B2;
    }

    static double calcularTOTAL(double basica, int hijos, String cargo){
        double total = 0.0;

        return basica + calcularB1(cargo) + calcularB2(hijos);
    }
}
import java.util.Scanner;

public class Pregunta_2 {
    public static void main(String[] args){

        /* 01. DECLARAR VARIABLES */
        Scanner sc = new Scanner(System.in);
        int examen_escrito, examen_oral;
        double precio;
        String nivel;

        /* 02. CAPTURAR DATOS */
        System.out.println("Ingrese el puntaje del examen escrito: ");
        examen_escrito = sc.nextInt();

        System.out.println("Ingrese el puntaje del examen oral: ");
        examen_oral = sc.nextInt();

        /* 03. OPERACIONES */

        // Identificar el nivel
        nivel = identificar_nivel (examen_escrito, examen_oral);

        // Identificar el precio
        precio = identificar_precio (nivel, examen_escrito, examen_oral);

        /* 04. RESULTADOS */
        System.out.println("El nivel alcanzado es \"" + nivel + "\"");
        System.out.printf("El precio a cobrar es: %.2f \n", precio);
    }

    static String identificar_nivel (int escrito, int oral){
        if(escrito > 90 && oral > 75)
            return "Avanzado";
        else if (escrito > 75 && oral >= 50)
            return "Intermedio";
        else
            return "Básico";
    }

    static double identificar_precio (String nivel, int escrito, int oral){
        if(nivel == "Avanzado")
            if(escrito > 95 && oral > 95)
                return 220;
            else
                return 250;
        else if (nivel == "Intermedio")
            if(escrito > 65 && oral > 65)
                return 200;
            else
                return 220;
        else
            if(escrito > 30 && oral > 30)
                return 160;
            else
                return 180;
    }
}

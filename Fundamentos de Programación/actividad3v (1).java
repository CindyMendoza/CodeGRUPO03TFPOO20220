import java.util.Arrays;

public class actividad3v {
    //Pregunta 01
    // "Totalmente insatisfecho(0)", "Insatisfecho"(1), "Poco satisfecho"(2),"Ni satisfecho ni insatisfecho"(3), "Satisfecho"(4), "Muy satisfecho"(5)

    static int respuestaEncuestaVentanilla01[] = {0, 1, 2, 3, 4, 5, 0, 1};
    static int respuestaEncuestaVentanilla02[] = {2, 5, 5, 0, 1, 2, 3};
    static int respuestaEncuestaVentanilla03[] = {4, 5, 1, 1, 2, 2, 5, 5, 0};
    static int respuestaEncuestaVentanilla04[] = {0, 1, 2, 3, 4, 5};
    static int respuestaEncuestaVentanilla05[] = {0, 1, 2, 3, 4, 5, 1, 1};
    static String asistentes[] = {"Elena Chaves", "Rosalia Wu", "Marta Godoy", "Paloma Jaramillo", "Sagrario Carrascosa"};
    static int[][] arregloTotal = {respuestaEncuestaVentanilla01, respuestaEncuestaVentanilla02, respuestaEncuestaVentanilla03, respuestaEncuestaVentanilla04, respuestaEncuestaVentanilla05};


    static int cantidadPacientesContestaronEncuesta () {
        int sumaTotal = 0;

        for (int i = 0; i < arregloTotal.length; i++) {
            sumaTotal += arregloTotal[i].length;
        }
        return sumaTotal;
    }

    static double totalNivelSatisfaccionPorArray () {
        double porcentajeDeSatisfaccionRecepcion = 0;

        int contador = 0;
        for (int i = 0; i < arregloTotal.length; i++) {
            for (int j = 0; j < arregloTotal[i].length; j++) {
                if (arregloTotal[i][j] == 4 || arregloTotal[i][j] == 5) {
                    contador++;
                }
            }
            porcentajeDeSatisfaccionRecepcion = Math.round (((contador * 100.0) / cantidadPacientesContestaronEncuesta ()) * 100) / 100.0;

        }
        return porcentajeDeSatisfaccionRecepcion;
    }

    static String[] asistenteGanadora () {
        String[] asistente = new String[2];
        int[] tempo1 = new int[5];
        double[] tempo2 = new double[5];
        double mayor = 0;
        for (int i = 0; i < arregloTotal.length; i++) {
            for (int j = 0; j < arregloTotal[i].length; j++) {
                if (arregloTotal[i][j] == 4 || arregloTotal[i][j] == 5) {
                    tempo1[i]++;

                    tempo2[i] = (tempo1[i] * 100) / Double.valueOf (cantidadPacientesContestaronEncuesta ());
                    if (tempo2[i] > mayor) {
                        mayor = tempo2[i];
                        asistente[0] = asistentes[i];
                        asistente[1] = String.format ("%.2f", mayor);
                    }

                }

            }
        }
        return asistente;
    }

    //Pregunta 02
    static String listas[] = {"1", "2", "3", "B", "N"};
    static int votosValidos[] = {40, 30, 50, 30, 20};

    static int cantidadPersonasParticipantes () {
        int cantidad = 0;
        for (int i = 0; i < listas.length; i++) {
            cantidad += votosValidos[i];
        }
        return cantidad;
    }

    static double[] cantidadyPorcentajeVotosByN () {
        double[] cantidad = new double[2];
        double cantidadBlancos = 0;
        double cantidadNullos = 0;
        double porcentajeBlancos = 0;
        double porcentajeNulos = 0;
        for (int i = 0; i < listas.length; i++) {
            if (listas[i].equals ("B")) {
                cantidadBlancos = votosValidos[i];
                porcentajeBlancos = (cantidadBlancos * 100 / cantidadPersonasParticipantes ());
            }
        }
        for (int j = 0; j < listas.length; j++) {
            if (listas[j].equals ("N")) {
                cantidadNullos = votosValidos[j];
                porcentajeNulos = (cantidadNullos * 100 / cantidadPersonasParticipantes ());
            }
        }
        cantidad[0] = cantidadBlancos + cantidadNullos;
        cantidad[1] = Math.round ((porcentajeBlancos + porcentajeNulos) * 100) / 100.0;
        return cantidad;
    }

    static String[] listaGanadora () {
        String[] lista = new String[2];
        int mayorVoto = 0;
        String mayor = null;
        double porcentajeGanador = 0;
        for (int i = 0; i < votosValidos.length; i++) {
            if (votosValidos[i] > mayorVoto) {
                mayorVoto = votosValidos[i];
                mayor = listas[i];
            }
            porcentajeGanador = (Double.valueOf (mayorVoto) * 100) / cantidadPersonasParticipantes ();
            lista[0] = mayor;
            lista[1] = String.format ("%.2f", porcentajeGanador);

        }
        return lista;
    }

    static double[] relacionDeListas () {
        double lista[] = new double[4];
        int totalListasMenosByN = 0;
        double primerLugar = 0;
        double segundoLugar = 0;
        double mayor1 = 0;
        double mayor2 = 0;
        double porcentaje1 = 0;
        double porcentaje2 = 0;

        for (int i = 0; i < listas.length; i++) {
            if (! listas[i].equals ("B") && ! listas[i].equals ("N")) {
                totalListasMenosByN += votosValidos[i];
            }
            for (int j = 0; j < votosValidos.length; j++) {
                if (votosValidos[j] > mayor1) {
                    mayor1 = Double.valueOf (votosValidos[j]);
                    primerLugar = Double.parseDouble (listas[j]);
                }
                for (int k = 0; k < votosValidos.length; k++) {
                    if (votosValidos[k] < mayor1 && votosValidos[k] > mayor2) {
                        mayor2 = Double.valueOf (votosValidos[k]);
                        segundoLugar = Double.parseDouble (listas[k]);
                    }
                    porcentaje1 = Math.round (mayor1 * 100 / totalListasMenosByN * 100) / 100.0;
                    porcentaje2 = Math.round (mayor2 * 100 / totalListasMenosByN * 100) / 100.0;
                    lista[0] = primerLugar;
                    lista[1] = porcentaje1;
                    lista[2] = segundoLugar;
                    lista[3] = porcentaje2;
                }
            }
        }
        return lista;
    }

    public static void main (String[] args) {
        //Respuestas 01
        System.out.println ("La cantidad de pacientes que contestaron fueron: " + cantidadPacientesContestaronEncuesta ());
        System.out.println ("El nivel de satisfacción de todo el area de recepcion fue de: " + totalNivelSatisfaccionPorArray () + " %");
        System.out.println ("La asistente ganadora es: " + Arrays.toString (asistenteGanadora ()));
        System.out.println ("*****************************************************");
        //Respuestas 02
        System.out.println ("la cantidad de personas que participaron fueron: " + cantidadPersonasParticipantes ());
        System.out.println ("la cantidad y porcetaje de los votos ByN fue de: " + Arrays.toString (cantidadyPorcentajeVotosByN ()));
        System.out.println ("La lista ganadora y su porcentaje es " + Arrays.toString (listaGanadora ()));
        System.out.println ("la relacion de las 2 primeras listas es: " + Arrays.toString (relacionDeListas ()));


    }
}

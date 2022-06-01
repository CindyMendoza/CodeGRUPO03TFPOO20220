package Clase3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Pepe");
        nombres.add("Luis");
        nombres.add("Lucia");
        nombres.add("Carmen");
        nombres.add("Beto");

        //Iteración del ArrayList llamado nombres
        Iterator<String> iterator = nombres.iterator();

        System.out.println("Usando Iterator: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Usando Colecciones: ");
        //Listar ahora usando "for" para Colecciones
        for(String c:nombres){
            System.out.println(c);
        }

    }
}

package ComposicionAgregacion02;

public class Ejecutar {
    public static void main(String[] args) {
        SmartPhone cel = new SmartPhone("A10PRO",3400,"Samsung");

        Chip entel = new Chip("Entel",953647219);

        Chip tigo = new Chip("Tigo",936962351);

        cel.agregarChip(entel);
        cel.agregarChip(tigo);
        cel.mostrar();

    }
}

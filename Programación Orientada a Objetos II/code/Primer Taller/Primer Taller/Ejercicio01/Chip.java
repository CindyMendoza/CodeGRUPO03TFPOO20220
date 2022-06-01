package ComposicionAgregacion02;

public class Chip {
    private String empresa;
    private int numero;

    public  Chip(String empresa, int numero){
        this.empresa = empresa;
        this.numero = numero;
    }

    public void mostrar(){
        System.out.println("Empresa: " + empresa);
        System.out.println("Numero de celular: " + numero);
    }
}

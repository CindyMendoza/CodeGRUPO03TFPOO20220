package Excepciones;

public class Exc1 {

    public static void main(String[] args) {
        int numero = 10;
        int dividendo = 20;
        int divisor = 0;
        double resultado;

        //resultado = dividendo / divisor;
        //System.out.println(10.0/0);
        try{
        resultado = dividendo / divisor;
        System.out.println(resultado);
        //
        //System.out.println(resultado + numero);
        }
        catch (ArithmeticException ex){
            System.out.println("No es posible la división entre 0");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}

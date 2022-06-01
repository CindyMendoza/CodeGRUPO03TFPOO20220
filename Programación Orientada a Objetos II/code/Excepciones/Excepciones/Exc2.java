package Excepciones;

public class Exc2 {

    public static void main(String[] args) {
        try{
            int number[] = new int[10];
            number[10] = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("No es posible dividir entre cero (0)");//A
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fuera de lo permitido para el arreglo.");//B
        }
        catch (Exception e){
            System.out.println("Excepcion distinta a las 2 anteriores.");//C
        }
    }

}

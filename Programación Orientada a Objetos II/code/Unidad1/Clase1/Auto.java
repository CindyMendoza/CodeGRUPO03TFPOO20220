package Clase1;

public class Auto {
    //Atributos
    private String marca;
    private String placa;
    private String color;
    private String modelo;
    private int velocidad;

    public Auto(String marca, String placa, String color, String modelo, int velocidad) {
        this.marca = marca;
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public Auto(String marca, String placa, String color, String modelo) {
        this.marca = marca;
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
    }

    public Auto(String marca, String placa, String color) {
        this.marca = marca;
        this.placa = placa;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }


    //Constructor de la clase Auto
    /*public Auto(String marca, String placa, String color, String modelo, int velocidad){
        this.marca = marca;
        this.placa = placa;
        this.color = color;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }*/
    //Set y Get de los atributos
    /*public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(){
        this.velocidad = velocidad;
    }*/

    public void avanzar(){}
    public void frenar(){}
    public void girarIzquierda(){}
    public void girarDerecha(){}

}

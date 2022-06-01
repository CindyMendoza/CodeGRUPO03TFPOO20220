package Clase3;

public class Auto extends Vehiculo{
    public String maletera;
    public String parabrisas;
    public String plumillas;
    public boolean parrilla;

    public Auto(String placa, String marca, String modelo, String maletera, String parabrisas, String plumillas) {
        super(placa, marca, modelo);
        this.maletera = maletera;
        this.parabrisas = parabrisas;
        this.plumillas = plumillas;
    }

    public Auto() {
    }

    public Auto(String placa, String marca, String modelo, String maletera, String parabrisas, String plumillas, boolean parrilla) {
        super(placa, marca, modelo);
        this.maletera = maletera;
        this.parabrisas = parabrisas;
        this.plumillas = plumillas;
        this.parrilla = parrilla;
    }

    public void correr(){
        System.out.println("Estoy en la clase: Auto");
    }

    public String getMaletera() {
        return maletera;
    }

    public void setMaletera(String maletera) {
        this.maletera = maletera;
    }

    public String getParabrisas() {
        return parabrisas;
    }

    public void setParabrisas(String parabrisas) {
        this.parabrisas = parabrisas;
    }

    public String getPlumillas() {
        return plumillas;
    }

    public void setPlumillas(String plumillas) {
        this.plumillas = plumillas;
    }

    public static void main(String[] args) {
        Auto auto = new Auto("AW231", "Toyota", "Yaris", "Chica","Templado","Dobles");
        auto.correr();

        Vehiculo auto1 = new Vehiculo("AQ789", "Kia", "Optima");
        Vehiculo auto2 = new Auto("AP654","BMW", "A20", "Grande", "Templado", "Triples");

        Auto auto5 = new Auto();
        System.out.println("Auto 1: correr()");
        auto1.correr();
        System.out.println("Auto 2: correr()");
        auto2.correr();

        Auto auto3 = new Auto();
        //Lo siguiente es válido?
        //La solucion en este caso es la conversion (Cast)
        //Auto auto4 = (Auto) new Vehiculo();
    }
}

package Clase2;

public class Boleta {
    public Boleta(double monto) {
        this.monto = monto;
    }

    private double monto;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double calcularIGV(){
        //igv = 18% del monto de la Boleta
        double igv = 0;
        igv = 0.18 * this.monto;
        return igv;
    }

    public double calcularMontoFinal(){
        //monto final = monto + igv;
        double montFinaly = 0;
        montFinaly = calcularIGV() + this.monto;
        return montFinaly;
    }

    public static void main(String[] args) {
        Boleta boleta = new Boleta(125.5125);
        System.out.println("El monto original de la boleta es: " + boleta.getMonto());
        System.out.println("El igv calculado es: " + boleta.calcularIGV());
        System.out.println("El monto final es: " + boleta.calcularMontoFinal());
        System.out.printf("El monto final es %.2f", boleta.calcularMontoFinal());
    }
}

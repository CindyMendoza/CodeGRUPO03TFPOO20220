package ComposicionAgregacion02;

public class SmartPhone {
    private String modelo;
    private Bateria bateria; //Composicion
    private int nroChips; //Cantidad de chips
    private Chip[] chips; //Vector de chips Agregación

    public SmartPhone(String modelo, int cantMAh, String marcaBateria){
        this.modelo = modelo;
        this.bateria = new Bateria(cantMAh,marcaBateria);
        this.nroChips = 0;
        this.chips = new Chip[2]; //p1: 0 p2:1
    }

    public void agregarChip(Chip nuevoChip){
        if (nroChips<2){
            chips[nroChips] = nuevoChip;
            nroChips ++;
        }
    }

    public void mostrar(){
        System.out.println("Modelo: " + modelo);
        bateria.mostrar();
        System.out.println("Nro Chips: " + nroChips);
        for (int i=0; i<nroChips; i++){
            chips[i].mostrar();
        }
    }
}

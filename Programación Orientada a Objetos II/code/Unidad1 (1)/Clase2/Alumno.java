package Clase2;

public class Alumno {
    private String codigo;
    private String nombres;
    private String apellidos;
    private double notaPc1;
    private double notaPc2;
    private double notaParticipacion;
    private double notaEF;

    public Alumno(String codigo, String nombres, String apellidos, double notaPc1, double notaPc2, double notaParticipacion, double notaEF) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.notaPc1 = notaPc1;
        this.notaPc2 = notaPc2;
        this.notaParticipacion = notaParticipacion;
        this.notaEF = notaEF;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getNotaPc1() {
        return notaPc1;
    }

    public void setNotaPc1(double notaPc1) {
        this.notaPc1 = notaPc1;
    }

    public double getNotaPc2() {
        return notaPc2;
    }

    public void setNotaPc2(double notaPc2) {
        this.notaPc2 = notaPc2;
    }

    public double getNotaParticipacion() {
        return notaParticipacion;
    }

    public void setNotaParticipacion(double notaParticipacion) {
        this.notaParticipacion = notaParticipacion;
    }

    public double getNotaEF() {
        return notaEF;
    }

    public void setNotaEF(double notaEF) {
        this.notaEF = notaEF;
    }
    //Calculo de la nota final
    public double calcularNotaFinal(){
        //nota final = pc1*0.2 + pc2*0.25+pa*0.25+ef*0.30
        double notaFinal = 0;
        notaFinal = this.notaPc1*0.2 + this.notaPc2*0.25 + this.notaParticipacion*0.25 + this.notaEF*0.30;
        return notaFinal;
    }
    //Validacion si el alumno esta aprbado o no
    public String estaAprobado(){
        String situacion = "";
        if (calcularNotaFinal() >= 13)
            situacion = "APROBADO";
        else
            situacion = "DESAPROBADO";
        return situacion;
    }

    public static void main(String[] args) {
        //1. Presentación del alumno
        Alumno alumno = new Alumno("20210001", "Juan", "Caceres Luna", 13, 13, 13, 13);
        System.out.println("El alumno es: " + alumno.getCodigo() + " - " + alumno.getNombres() + " " + alumno.getApellidos());
        //2. Calcular y mostrar nota final
        System.out.println("La nota final del curso es: " + alumno.calcularNotaFinal());
        //3. Mostrar si esta aprobado o desaprobado
        System.out.println("Situación final del alumno: " + alumno.estaAprobado());
    }
}

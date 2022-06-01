package com.ta2;

public class Main {
    public static void main(String[] args){
        Masacre masacreA = new Masacre("Juan", "Perez",3,"45999864",25,5,7);
        Masacre masacreB = new Masacre("Carla", "Mendoza ",5,"45999865",15,4,3);
        Masacre masacreC = new Masacre("Rodrigo", "Aguirre",7,"45999866",20,3,2);
        Televidente televidenteA = new Televidente("Ariana","Gutierrez",5,"10478569",21,5,98988977);
        Televidente televidenteB = new Televidente("Pedro","Gutierrez",5,"10478570",15,7,98988978);
        Televidente televidenteC = new Televidente("Luis","Gutierrez",5,"10478571",22,9,98988979);

        Administrador adm1 = new Administrador(null);

        adm1.registrarParticipante(masacreA);
        adm1.registrarParticipante(masacreB);
        adm1.registrarParticipante(masacreC);
        adm1.registrarParticipante(televidenteA);
        adm1.registrarParticipante(televidenteB);
        adm1.registrarParticipante(televidenteC);
        for(Participante p:adm1.getParticipantes()){
            System.out.println(p);
        }
        System.out.println(adm1.obtenerGanador());
        adm1.buscarParticipante("45999864");
    }
}

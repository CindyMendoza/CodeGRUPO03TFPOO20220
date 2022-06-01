package com.clinica;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Clinica clinicaJP = new Clinica();

        clinicaJP.registrarPaciente("45999999", "Carlos Mendoza", 28);
        clinicaJP.registrarPaciente("45999991", "Cinthia Suarez", 21);
        clinicaJP.registrarPaciente("45999992", "Carla Perez", 24);

        Historial historialA = new Historial("HIS001");
        try {
            historialA.registrarVisita("13/11/2021", "Chequeo Preventivo", 150);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            historialA.registrarVisita("14/11/2021", "Test covid", 290);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Historial historialB = new Historial("HIS002");
        try {
            historialB.registrarVisita("01/05/1990", "Cirujia", 7150);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            historialB.registrarVisita("04/11/2010", "Internamiento preventivo", -500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Historial historialC = new Historial("HIS003");
        try {
            historialC.registrarVisita("05/03/2019", "Analisis sangre", 950);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            historialC.registrarVisita("27/08/2020", "Radiografia", -50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        clinicaJP.asignarHistorial("45999999", historialA);
        clinicaJP.asignarHistorial("45999991", historialB);
        clinicaJP.asignarHistorial("45999992", historialC);
        System.out.println("Pacientes Registrados");
        System.out.println("=====================");
        List<Paciente> pacientesRegistrados = clinicaJP.getPacientes();
        for (Paciente paciente : pacientesRegistrados) {
            System.out.println(paciente);
        }

        System.out.println("Pacientes de Prioridad:");
        System.out.println("=====================");
        List<Paciente> pacientesDePrioridad = new ArrayList<>();
        try {
            pacientesDePrioridad = clinicaJP.obtenerPacientes("Baja");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Paciente paciente : pacientesDePrioridad) {
            System.out.println(paciente);
        }

    }

}

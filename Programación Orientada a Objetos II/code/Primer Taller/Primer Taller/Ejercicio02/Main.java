package ComposicionAgregacion03;

import java.awt.image.MultiPixelPackedSampleModel;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // A)
        // B)
        // C)
        Clinica clinicaA = new Clinica();

        clinicaA.registrarPaciente("46531739", "Jose Torres", 25);
        clinicaA.registrarPaciente("19915633", "Carlos Gomez", 29);
        clinicaA.registrarPaciente("16454889", "Sofia Matos", 33);

        Historial historialA = new Historial("HIS001");
        historialA.registrarVisita("01/01/2021", "Control", 1700);
        historialA.registrarVisita("02/02/2021", "Intervencion", 2500);

        Historial historialB = new Historial("HIS002");
        historialB.registrarVisita("02/04/2021", "Cirugia", 3900);
        historialB.registrarVisita("03/05/2021", "Cirugia", 4500);

        Historial historialC = new Historial("HIS003");
        historialC.registrarVisita("01/07/2021", "Control", 150);
        historialC.registrarVisita("04/07/2021", "Laboratorio", 450);

        clinicaA.asignarHistorial("46531739", historialA);
        clinicaA.asignarHistorial("19915633", historialB);
        clinicaA.asignarHistorial("16454889", historialC);

        // Opcional
        //System.out.println("Pacientes registrados:");
        //List<Paciente> pacientesRegistrados = clinicaA.getPacientes();
        //for (Paciente paciente: pacientesRegistrados) {
        //    System.out.println(paciente);
        //}

        // D)
        System.out.println("Pacientes de prioridad");
        List<Paciente> pacientesPrioridad = new ArrayList<>();
        try {
            pacientesPrioridad = clinicaA.obtenerPacientesDePrioridad("Alta");
        } catch (PrioridadIncorrectaException e) {
            System.out.println(e.getMessage());
        }
        for (Paciente paciente: pacientesPrioridad) {
            System.out.println(paciente);
        }

        // E)
        System.out.println("Pacientes de prioridad inexistente");
        List<Paciente> pacientesPrioridadB = new ArrayList<>();
        try {
            pacientesPrioridadB = clinicaA.obtenerPacientesDePrioridad("NoExiste");
        } catch (PrioridadIncorrectaException e) {
            System.out.println(e.getMessage());
        }
        for (Paciente paciente: pacientesPrioridadB) {
            System.out.println(paciente);
        }

    }
}
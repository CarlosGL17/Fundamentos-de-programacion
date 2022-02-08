package examen;
import java.util.Scanner;
/*
    1. La calificación de la unidad de un alumno se calcula en base a los siguientes criterios:
    Examen: 60%
    Trabajo final: 25%
    Tareas: 15%
    Realizar un programa que solicite al alumno las calificaciones obtenidas en los 3 rubros anteriores y calcule la
    calificación de la unidad
    @autor: Garcia Lira Carlos Humberto
    ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────
*/
public class Examen1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double calificacionExamen, calificacionTrabajoFinal, calificacionTareas;
        int calificacionUnidad;
        System.out.println("Ingresa la calificación del examen (1-100): ");
        calificacionExamen = teclado.nextInt() * 0.60;

        System.out.println("Ingresa la calificación del trabajo final (1-100):");
        calificacionTrabajoFinal = teclado.nextInt() * 0.25;

        System.out.println("Ingresa la calificación de las tareas (1-100):");
        calificacionTareas = teclado.nextInt() * 0.15;

        calificacionUnidad = (int)Math.round(calificacionExamen + calificacionTrabajoFinal + calificacionTareas);

        System.out.println("Examen: \t\t\t\t\t\t" + calificacionExamen);
        System.out.println("Trabajo final: \t\t\t\t\t\t" + calificacionTrabajoFinal);
        System.out.println("Tareas: \t\t\t\t\t\t" + calificacionTareas);
        System.out.println("─────────────────────────────────────");
        System.out.println("Calificaion de la unidad: \t\t\t\t" + calificacionUnidad);

        teclado.close();
    }
}
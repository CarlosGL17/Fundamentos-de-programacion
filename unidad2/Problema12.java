package unidad2;

import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        
        int alumnos;
        final double COSTO_INS = 1599.50;
        double ingresoSem;
        
        Scanner teclado = new Scanner(System.in);  
        System.out.println("¿Cuantos alumnos ingresaran este semestre?");
        alumnos = teclado.nextInt();
        
        ingresoSem = alumnos * COSTO_INS;
        
        System.out.println("Los ingresos del semestre en total serán de: $" + ingresoSem);
        
        
    }
}

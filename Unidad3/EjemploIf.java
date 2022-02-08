package Unidad3;

import java.util.Scanner;

public class EjemploIf {
    public static void main(String[] args) {
        
        double calificacion;
        final double CALIFICACION_APROBAR = 70;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la calificacion: ");
        calificacion = teclado.nextDouble();
        
        if (calificacion >= CALIFICACION_APROBAR)
        {
            System.out.println("Pasaste la materia");
            System.out.println("Felicidades!!!");
        
        }
        System.out.println("Esta linea se muestra despues del " + "if, independientemente si se ejecuta o no");
    }
}

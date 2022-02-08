package unidad2;

import java.util.Scanner;

public class Problema19 {
    public static void main(String[] args) {
        
        double ang1;
        double ang2;
        double ang3;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cual es el valor del primer angulo?");
        ang1 = teclado.nextDouble();
        System.out.println("¿Cual es el valor del segundo angulo?");
        ang2 = teclado.nextDouble();
        
        ang3 = 180 - ang1 - ang2;
        
        System.out.println("El angulo restante tiene un valor de: " + ang3 + "º");
    }
}

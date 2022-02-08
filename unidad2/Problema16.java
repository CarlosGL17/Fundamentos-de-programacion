package unidad2;

import java.util.Scanner;

public class Problema16 {
    public static void main(String[] args) {
    
        double sueldoM;
        double sueldoA;
        final double IMPUESTO = 0.93;
        double sueldoF;
        
        
        Scanner teclado = new Scanner(System.in);    
        System.out.println("¿Cual es su sueldo mensual? ");
        sueldoM = teclado.nextDouble();
        
        sueldoA = sueldoM * 12;
        
        sueldoF = sueldoA * IMPUESTO;
        
        System.out.println("Tu sueldo anual será de: $" + sueldoF);
    
    
    }
   
}

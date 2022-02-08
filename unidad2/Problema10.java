package unidad2;

import java.util.Scanner;

public class Problema10{
    public static void main(String[] args) {
        
        double sueldoB;
        final double COMISION = 1.10;
        double sueldoF;
        int ventas;
        
        Scanner teclado = new Scanner(System.in);  
        System.out.println("Ingrese cuantas fueron las ventas del mes: ");
        ventas = teclado.nextInt();
        
        sueldoB = ventas * 230;
        
        System.out.println("Tu sueldo base es de: $" + sueldoB);
        
        sueldoF = sueldoB * COMISION;
        
        System.out.println("Y tu sueldo con comisiones extraS es de: $" + sueldoF);

        
        
        
        
        
    }

}

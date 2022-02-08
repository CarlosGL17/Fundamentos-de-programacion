package unidad2;

import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {
        
        double sueldoB;
        double sueldoNeto;
        final double SEGURO = 0.03;
        final double FONDO = 0.02;
        int horas;
        
        Scanner teclado = new Scanner(System.in);  
        System.out.println("Ingrese horas trabajadas al dia: ");
        horas = teclado.nextInt();
        
        sueldoB = horas * 120;
        
        sueldoNeto = sueldoB - (sueldoB * SEGURO) - (sueldoB * FONDO);
        
        System.out.println("Tu sueldo Neto es de: $" + sueldoNeto);
        
        
        
        
    }
}

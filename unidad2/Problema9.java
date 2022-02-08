package unidad2;

import java.util.Scanner;

public class Problema9 {
    public static void main(String[] args) {
        
        double carro;
        final double INTERES = 1.15;
        double precioF;
        
        Scanner teclado = new Scanner(System.in);  
        System.out.println("¿Cual es el precio del carro?");
        carro = teclado.nextDouble();
        
        precioF = carro * INTERES;
        
        System.out.println("El precio final del carro es de: $" + precioF );
       

        
        
        
    }
}

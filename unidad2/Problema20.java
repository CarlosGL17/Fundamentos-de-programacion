package unidad2;

import java.util.Scanner;

public class Problema20 {
    public static void main(String[] args) {
        
        double quintal;
        final double GANANCIA = 1.40;
        double preciok;
        double precioF;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese precio de 1 quintal de arroz: ");
        quintal = teclado.nextDouble();
        
        preciok = quintal / 100;
        
        precioF = preciok * GANANCIA;
        
        System.out.println("El precio al publico de arroz por kilo es de: $" + precioF);
        
    }
}

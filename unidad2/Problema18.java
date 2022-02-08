package unidad2;

import java.util.Scanner;

public class Problema18 {
    public static void main(String[] args) {
        
        double precio;
        final double GANANCIA = 1.30;
        double precioF;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el precio base del producto");
        precio = teclado.nextDouble();
        
        precioF = precio * GANANCIA;
        
        System.out.println("El precio final del producto es de: $" + precioF);
        
        
        
    }
}

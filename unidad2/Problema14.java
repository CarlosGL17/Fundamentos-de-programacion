package unidad2;

import java.util.Scanner;

public class Problema14 {
    public static void main(String[] args) {
        
        double precio1;
        double precio2;
        double precio3;
        double precioF;
        
        Scanner teclado = new Scanner(System.in); 
        System.out.println("¿Cual es el precio del producto en el departamento 1?");
        precio1 = teclado.nextDouble();
        
        System.out.println("¿Cual es el precio del producto en el departamento 2?");
        precio2 = teclado.nextDouble();
        
        System.out.println("¿Cual es el precio del producto en el departamento 3?");
        precio3 = teclado.nextDouble();
        
        precioF = (precio1 + precio2 + precio3) / 3;
        
        System.out.println("El precio medio del producto es de: $" + precioF);

        
    }
}

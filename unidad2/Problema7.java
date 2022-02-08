package unidad2;

import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
         
        final int HUEVOS = 15;
        final int TORTA = 8;
        final int HAMBURGUESA = 12;
        final int SANDWICH = 6;
        final int REFRESCO = 4;
        final int CAFE = 3;
        final int JUGO = 2;
            
        int cant1;
        int cant2;
        int cant3;
        int cant4;
        int cant5;
        int cant6;
        int cant7;
        double total;
        
        Scanner teclado = new Scanner(System.in);   
        System.out.println("¿Cuantos huevos al gusto compró? ");
        cant1 = teclado.nextInt();
        System.out.println("¿Cuantas tortas compró? ");
        cant2 = teclado.nextInt();
        System.out.println("¿Cuantas hamburguesas compró? ");
        cant3 = teclado.nextInt();
        System.out.println("¿Cuantos sandwiches compró? ");
        cant4 = teclado.nextInt();          
        System.out.println("¿Cuantos refrescos compró? ");
        cant5 = teclado.nextInt();
        System.out.println("¿Cuantos cafés compró? ");
        cant6 = teclado.nextInt();
        System.out.println("¿Cuantos jugos compró? ");
        cant7 = teclado.nextInt();
     
        total = ((cant1 * HUEVOS) + (cant2 * TORTA) + (cant3 * HAMBURGUESA) + (cant4 * SANDWICH) + (cant5 * REFRESCO) + (cant6 * CAFE) + (cant7 * JUGO)) * 1.15 ;                

        System.out.println("El total a pagar es: $" + total);
        
        
    }
    
}

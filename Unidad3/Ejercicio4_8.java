package Unidad3;

import java.util.Scanner;

public class Ejercicio4_8 {
    public static void main(String[] args) {
        
        int cant;
        int cant2;
        int cant3;
        final double DESC = 0.88;
        int comsem;
        double descap;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la primer cantidad: ");
        cant = teclado.nextInt();
        
        System.out.println("Ingrese la segundo cantidad: ");
        cant2 = teclado.nextInt();
        
         System.out.println("Ingrese la tercer cantidad: ");
        cant3 = teclado.nextInt();
        
        comsem = cant + cant2 + cant3;
        
        if (comsem > 1000)
        {
            descap = comsem * DESC;
            System.out.println("La cantidad final a pagar es: " + descap);
        }
                
                
    }
}

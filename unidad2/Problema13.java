package unidad2;

import java.util.Scanner;

public class Problema13 {
    public static void main(String[] args) {
        
        double cat1;
        double cat2;
        double hipo;
        
        Scanner teclado = new Scanner(System.in);  
        
        System.out.println("Ingrese el primer cateto: ");
        cat1 = teclado.nextDouble();
        
        System.out.println("Ingrese el segundo cateto: ");
        cat2 = teclado.nextDouble();
        
        hipo = Math.sqrt((cat1 * cat1)+(cat2 * cat2));
        
        System.out.println("El valor de la hipotenusa es: " + hipo);


        
    }
}

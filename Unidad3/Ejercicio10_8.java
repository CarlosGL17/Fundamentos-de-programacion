package Unidad3;

import java.util.Scanner;

public class Ejercicio10_8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        int factorial = 1;
        
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        
        do 
        {
          factorial = factorial * num;
            num--;  
        } while (num > 0);
        
        System.out.println("El factorial del numero es: " + factorial);
    }
}

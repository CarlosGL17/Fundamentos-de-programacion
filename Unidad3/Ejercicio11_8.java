package Unidad3;

import java.util.Scanner;

public class Ejercicio11_8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int factorial = 1;
        int num;
                
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        
        for (int i = num; num > 0; num--) 
        {
            factorial = factorial *1;
        }
        
        System.out.println("El factorial del numero es: " + factorial);
        
        
    }
}

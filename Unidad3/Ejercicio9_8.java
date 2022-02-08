package Unidad3;

import java.util.Scanner;

public class Ejercicio9_8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num;
        int factorial = 1;
        
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        
        while (num > 0)
        {
            factorial = factorial * num;
            num--;
        }
        System.out.print("El factorial del numero es: " + factorial);
        
        
    }
}

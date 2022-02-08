package Unidad3;

// Pedir que se introduzcan 2 numero y mostrar cual es el mayor

import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo numero: ");
        num2 = teclado.nextInt();
        
        if (num1 > num2)
        {
            System.out.println("El numero mayor es: " + num1);
        }
        else
        {
            System.out.println("El numero mayor es: " + num2);
        }
        
    }
}

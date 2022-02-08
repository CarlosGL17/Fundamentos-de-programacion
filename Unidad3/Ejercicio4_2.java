package Unidad3;

import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int num3;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num3 = teclado.nextInt();
        
        if (num1 > 15 && num2 > 15 && num3 > 15)
        {
            System.out.println("Numeros correctos");
        }
                
                
    }
}
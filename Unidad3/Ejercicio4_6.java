package Unidad3;

import java.util.Scanner;

public class Ejercicio4_6 {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int num3;
        int prod;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        
        System.out.println("Ingrese el tercer numero: ");
        num3 = teclado.nextInt();
        
        if (num1 == 100 || num2 == 100 || num3 == 100 )
        {
            prod = num1 + num2 + num3;
            System.out.println("La suma de los numeros es: " + prod);
        }
                
                
    }
}

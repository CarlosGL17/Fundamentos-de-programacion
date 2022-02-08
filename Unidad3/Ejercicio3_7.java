package Unidad3;

import java.util.Scanner;

public class Ejercicio3_7 {
    public static void main(String[] args) {
        
        int num2;
        int num1;
        int prod;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese segundo numero: ");
        num2 = teclado.nextInt();
        
        prod = num1 * num2;
        
        // if (num1 * num2 > 100) tambien aplica
        
        if  (prod > 100)
        {
            System.out.println("Producto válido");
           
        }
        
    }
}
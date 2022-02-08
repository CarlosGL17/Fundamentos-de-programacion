package Unidad3;

import java.util.Scanner;

public class Ejercicio4_4 {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int res;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        
        if (num1 > 50 && num2 == 33)
        {
            res = num1 + num2;
            System.out.println("El resultado es: " + res);
        }
                
                
    }
}

package Unidad3;

import java.util.Scanner;

public class Ejercicio4_1 {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        
        if (num1 > num2)
        {
            System.out.println("Numeros aprobados");
        }
                
                
    }
}

package Unidad3;

import java.util.Scanner;

public class Ejercicio4_7 {
    public static void main(String[] args) {
        
        int num1;
        int num2;
        int res;
        int prod;
        int cubo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        
        res = num1 + num2;
        
        prod = num1 * num2;
        
        if (res >= 100 || prod >=100 )
        {
            cubo= num1 * num1 * num1;
            System.out.println("El primer numero al cubo es: " + cubo);
        }
                
                
    }
}

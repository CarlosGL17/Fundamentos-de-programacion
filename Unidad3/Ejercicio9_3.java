package Unidad3;

import java.util.Scanner;

public class Ejercicio9_3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num = 0;
        int suma = 0; 
        
        
        
        while (num != -1)
        {
            System.out.println("Dame un numero: ");
            num = teclado.nextInt();
            suma = suma + num;
        }
        
        System.out.println("El resultado final es: " + suma);
    }
}

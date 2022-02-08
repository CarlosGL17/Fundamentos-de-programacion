package Unidad3;

import java.util.Scanner;

public class Ejercicio10_3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num = 0;
        int suma = 0; 

        do
        {
            System.out.println("Dame un numero: ");
            num = teclado.nextInt();
            
            suma = suma + num;
            
        }while (num != -1);
        
        System.out.println("El resultado final es: " + suma);
    }
}

package Unidad3;

import java.util.Scanner;

public class Ejercicio11_4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num = 0;
        int suma = 0;

        for (int cont = 0; cont < 10; cont++) 
        {
            System.out.println("Dame un numero: ");
            num = teclado.nextInt();
             
            if (num% 2 != 0 )
            {          
            suma = suma + num;
            }
            
        }
        
        System.out.println("La suma de los impares es: " + suma);
        
    }
}

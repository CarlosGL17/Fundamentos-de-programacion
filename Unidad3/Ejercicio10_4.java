package Unidad3;

import java.util.Scanner;

public class Ejercicio10_4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int num = 0;
        int suma = 0;
        int contador = 0;    
             
        do 
        {
            System.out.println("Dame un numero: ");
            num = teclado.nextInt();
             
            if (num% 2 != 0 )
            {          
            suma = suma + num;
            }
            contador++;  
            
        } while (contador < 10);
        
        System.out.println("La suma de los impares es: " + suma);
        
    }
}

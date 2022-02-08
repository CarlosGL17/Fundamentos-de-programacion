package Unidad3;

import java.util.Scanner;

public class Ejercicio10_6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int num = 0;
        int contador = 0;
        int sumaA = 0; 
        int sumaB = 0;

        do
        {
            System.out.println("Ingrese un numero: ");
            num = teclado.nextInt();
            
            if (num % 2 == 0)
            {
                sumaA = sumaA + num;
            }
            else
            {
                sumaB = sumaB + num;
            }    
            
            contador++;
        } while (contador < 10);
        
        System.out.println("El valor total de los numeros pares es: " + sumaA);
        System.out.println("El valor total de los impares es: " + sumaB);
 
    }
}

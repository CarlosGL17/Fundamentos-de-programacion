package Unidad3;

import java.util.Scanner;

public class Ejercicio11_5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int x = 0;
        int suma = 0;
        int num;
        
        System.out.println("Ingrese un numero: ");
        x = teclado.nextInt();
        
        for (int cont = 0; cont < x; cont++)
        {
               
         System.out.println("Ingrese numero: ");
            num = teclado.nextInt();
            
            suma = suma + num; 
        }
        
        System.out.println("El total de la suma es: " + suma);

    }
}

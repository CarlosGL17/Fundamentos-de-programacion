package Unidad3;

import java.util.Scanner;

public class Ejercicio10_5 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int x = 0;
        int suma = 0;
        int contador = 0;
        int num;
        
        
        System.out.println("Ingrese un numero: ");
        x = teclado.nextInt();
        
        do 
        {
            
         System.out.println("Ingrese numero: ");
            num = teclado.nextInt();
            
            suma = suma + num;
     
        contador++;   
        
        } while (contador < x);
        
        System.out.println("El total de la suma es: " + suma);

        
    }
}

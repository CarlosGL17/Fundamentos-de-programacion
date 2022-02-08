package Unidad3;

import java.util.Scanner;

public class Ejercicio3_9 {
    public static void main(String[] args) {
        
        int num;
        int num2;
        int suma;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        num = teclado.nextInt();
        
        if  (num != 200 )
        {
            System.out.println("Ingrese otro numero: ");
        num2 = teclado.nextInt();
        
        suma = num + num2;
        
            System.out.println("La suma de los numeros es: " + suma );
           
        }
        
    }
}
package Unidad3;

import java.util.Scanner;

public class Ejercicio3_5 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        num = teclado.nextInt();
        
        
        if  (num % 2 == 0) //% modulo para que el reisduo sea igual a 0
        {
            System.out.println("Numero par");
           
        }
        
    }
}
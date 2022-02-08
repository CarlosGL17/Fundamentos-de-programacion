package Unidad3;

import java.util.Scanner;

public class Ejercicio3_6 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        num = teclado.nextInt();
        
        boolean num1 = num > 10; 
        
        if  (num1 == true)
        {
            System.out.println("Numero mayor a 10");
           
        }
        
    }
}
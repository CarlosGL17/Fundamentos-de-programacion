package Unidad3;

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        num = teclado.nextInt();
        
        if  (num <= 20)
        {
            System.out.println("Numero menor a 20");
           
        }
        
    }
}
package Unidad3;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        num = teclado.nextInt();
        
        if (num > 10)
        {
            System.out.println("Numero mayor a 10");
        }
        
    }
}

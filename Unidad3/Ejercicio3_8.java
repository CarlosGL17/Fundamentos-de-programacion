package Unidad3;

import java.util.Scanner;

public class Ejercicio3_8 {
    public static void main(String[] args) {
        
        int num;
        double desc;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad: ");
        num = teclado.nextInt();
        
        if  (num > 2000)
        {
            desc = num *  0.85;
            System.out.println("El valor con descuento es: " + desc);
           
        }
        
    }
}
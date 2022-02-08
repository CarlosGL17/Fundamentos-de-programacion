package Unidad3;

import java.util.Scanner;

public class Ejercicio3_11 {
    public static void main(String[] args) {
        
        char letra;
  
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese letra: ");
        letra = teclado.next().charAt(0);
        
        if  (letra == 'S')
        {
            System.out.println("Saliendo del Sistema" );
           
        }
        
    }
}
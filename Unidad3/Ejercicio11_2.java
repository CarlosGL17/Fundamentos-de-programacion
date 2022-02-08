package Unidad3;

import java.util.Scanner;

public class Ejercicio11_2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int suma = 0;
        
        for (int cont = 0; cont <= 1000; cont++)
        {
            if (cont % 2 == 0);
            
            {
                suma = suma + cont;
                
                
            } 
        }
        
        System.out.println(suma);
    }
}

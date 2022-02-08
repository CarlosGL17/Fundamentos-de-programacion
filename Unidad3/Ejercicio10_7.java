package Unidad3;

import java.util.Scanner;

public class Ejercicio10_7 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int sueldo = 0;
        int contador = 0;
        int sumaA = 0; 
        int sumaB = 0;
        int sumaC = 0;
        
        do 
        {
          System.out.println("Ingrese su sueldo: ");
            sueldo = teclado.nextInt();
            
            if (sueldo >= 300)
            {
                sumaA++;
            }
            else
            {
                if (sueldo > 200)
                {
                    sumaB++;
                }
                else
                {
                    sumaC++;
                }
            }   
            
            
            contador++;  
        } while (contador < 30);
        
        System.out.println("La cantidad de empleados que reciben 300 o mas son: " + sumaA);
        System.out.println("La cantidad de empleados que reciben mas de 200 pero menos de 300 son: " + sumaB);
        System.out.println("La cantidad de empleados que reciben 200 o menos son: " + sumaC);
    }
}

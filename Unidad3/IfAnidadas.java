package Unidad3;

import java.util.Scanner;

public class IfAnidadas {
    public static void main(String[] args) {
        
        int num;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        num = teclado.nextInt();
        
        if (num > 0)
        {
            if (num % 2 == 0)
            {
                System.out.println("Numero positivo par");
            }
            else
            {
                System.out.println("Numero positivo impar");
            }
        }
        else
        {
            if (num < 0)
            {    
            if (num % 2 == 0)
            {
                System.out.println("Numero negativo par");
            }
            else
            {
                System.out.println("Numero negativo impar");
            }
        }
        else 
        {
               System.out.println("El numero es el 0");
        }
        
    }
    }
}

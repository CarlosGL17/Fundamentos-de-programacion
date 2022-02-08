package unidad4;

import java.util.Scanner;

public class Evaluacion2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String arr[] = new String[5];
        final String PROFE = "Jorge Prado Mercado";
        
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println("Ingrese un nombre de usuario: ");
            arr[i] = teclado.nextLine();
            
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("El usuario numero " + i + " se llama: " + arr[i]);
            
            if (arr[i].equalsIgnoreCase(PROFE))
            {
                System.out.println("Es el profesor!!");
            }    
            else
            {
            }
        }
        
        
        
    }
}

package Unidad3;

import java.util.Scanner; 

public class Ejercicio10_2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int contador = 0 ;
        int suma = 0;
        
        do 
        {
          if (contador % 2 == 0);
            
            {
                suma = suma + contador;
                
                
            } 
             contador++;  
        }while(contador <= 1000);   
        
        System.out.println(suma);
    }
}

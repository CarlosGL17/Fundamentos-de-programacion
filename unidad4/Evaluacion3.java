package unidad4;

import java.util.Scanner;

public class Evaluacion3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double suma = 0;
        double prom;
        int contador = 0;
        
        int arr[] = new int [10];
        
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i] = (int) (Math.random() * 100); 
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Numero: " + arr[i]);
            
            if(arr[i] % 2 == 0)
            {
                suma = suma + arr[i];
                contador++;
            }
            else
            {
            }    
        }
        
        prom = suma / contador;
        
        System.out.println("El promedio de los numeros es: " + prom);
        

    }
 
}

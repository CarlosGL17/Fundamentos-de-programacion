package unidad4;

import java.util.Scanner;

public class EjemploArreglo3 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int arreglo[] = new int[5];
        // Pedir al usuario los 5 numeros
        for (int i = 0; i < arreglo.length; i++) 
        {
            System.out.println("Ingrese un numero entero: ");
            arreglo[i] = teclado.nextInt();   
            
        }
        
        // Mostrar los elementos del arreglo
        for (int i = 0; i < arreglo.length; i++)
        {
            System.out.println("Numero: " + arreglo[i]);
        }
        
        //Mostrar el contenido del arreglo utilizando un for-each
        for (   int num   :   arreglo   )
        {
            System.out.println("Numero: " + num);
        }
        
        
    }
}

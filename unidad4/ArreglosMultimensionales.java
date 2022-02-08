package Unidad4;

import java.util.Scanner;
public class ArreglosMultimensionales {
    public static void main(String[] args) {
        
        double suma = 0;
        double prom;
        int arr[][] = new int [3][4];
        Scanner teclado = new Scanner(System.in);
        for (int renglones = 0; renglones < arr.length; renglones++)
        {
            for (int columnas = 0; columnas < arr[renglones].length; columnas++) 
            {
                System.out.println("Ingrese calificacion " + columnas + " del alumno " + renglones + ": ");
                arr[renglones][columnas] = teclado.nextInt();
                suma = suma + arr[renglones][columnas]; 
            }
                    
        }
        
        System.out.println("Calificaciones ingresadas: ");
        for (int ren = 0; ren < arr.length; ren++) 
        {
            for (int col = 0; col < arr[ren].length; col++)
            {
                System.out.print(arr[ren][col] + " ");
            }
            System.out.println(" ");
        }
        
        prom = suma / 12;
        
        System.out.println("El promedio es: " + prom);
        
    }
    
}

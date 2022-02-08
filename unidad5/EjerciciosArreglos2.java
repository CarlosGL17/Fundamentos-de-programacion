package Unidad5;
/*
-- Pedir cantidad de numeros al usuario
- Leer los numeros
- Ordenar los numeros    
- Mostrarlos
*/
import java.util.Scanner;
public class EjerciciosArreglos2 {
    public static void main(String[] args) {
        
        
    }
    
    public int[] lector (int num)
    {
        int arr[] = new int[num];
        
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 100);       
        }
        
        return arr;
    }
    
    
}

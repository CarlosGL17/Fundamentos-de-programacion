package unidad5;

import java.util.Scanner;
public class EjemploMetodosArreglos {
    public static void main(String[] args) {
        
        
        
        
    }
    
    public int[] primos (int num){
    
        int arr[] = new int [num];
        int arrPrimos[] = new int [num];
        
        for (int i = 0; i < arr.length; i++) 
        {
             arr[i] = (int) (Math.random() * 100); 
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] %2 == 0) 
            {
                
            }
            else if (arr[i] %3 == 0)
            {
            
            }
        }
        return arr;
    
    }
    
    
    
    
}

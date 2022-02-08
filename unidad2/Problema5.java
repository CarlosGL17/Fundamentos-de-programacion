package unidad2;

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
    
        double tempC;
        double tempF;
        
        Scanner teclado = new Scanner(System.in);   
        System.out.println("Ingrese la temperatura en grados Centigrados ");
        tempC = teclado.nextDouble();
        
        tempF = (tempC * 1.8) + 32;
        
        System.out.println("La temperatura en grados Farenheit es: " + tempF);
        
    
    }
    
    
}

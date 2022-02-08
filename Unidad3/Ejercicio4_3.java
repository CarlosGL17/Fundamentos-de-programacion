package Unidad3;

import java.util.Scanner;

public class Ejercicio4_3 {
    public static void main(String[] args) {
        
        String nombre;
        char letra;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese letra especifica: ");
        letra = teclado.next().charAt(0);
        
        final String NOMBRE = "SantaAna";
        final char VF = 'M';
        
        if (nombre.equalsIgnoreCase(NOMBRE) && 
                letra == VF );
        {
            System.out.println("Datos validos");
        }
                
                
    }
}
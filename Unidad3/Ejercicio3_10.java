package Unidad3;

import java.util.Scanner;

public class Ejercicio3_10 {
    public static void main(String[] args) {
        
        String nombre;
  
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();
        
        if  (nombre.equals("Eduardo" ))
        {
            System.out.println("Acceso autorizado " );
           
        }
        
    }
}
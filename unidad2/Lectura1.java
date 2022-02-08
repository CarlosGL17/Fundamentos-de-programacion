package unidad2;

import java.util.Scanner;

public class Lectura1 {
    public static void main(String[] args) {
        
    // Asi se crea un objeto para ller datos del teclado
    Scanner teclado = new Scanner(System.in);
    
    // Variable para guardar la cantidad inicial de hermanos
    int cantidadHermanos = 0;
    
    System.out.println("Ingrese la cantidad de hermanos que tiene: ");
    
    // Aqui se hace la lectura=
    cantidadHermanos = teclado.nextInt();
    
    // Mostrar la cantidad de hermanos ingresada
    System.out.println("La cantidad de hermano es: " + cantidadHermanos);
    
    } 
}

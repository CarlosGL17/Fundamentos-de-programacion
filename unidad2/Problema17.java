package unidad2;

import java.util.Scanner;

public class Problema17 {
    public static void main(String[] args) {
        
        double herencia;
        final double HIJO_MA = 0.30;
        final double HIJO_ME = 0.25;
        final double HIJO_PE = 0.35;
        final double ESPOSA = 0.10;
        double hijoma;
        double hijome;
        double hijope;
        double esposa;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el valor de la herencia: ");
        herencia = teclado.nextDouble();
        
        hijoma = herencia * HIJO_MA;
        hijome = herencia * HIJO_ME;
        hijope = herencia * HIJO_PE;
        esposa = herencia * ESPOSA;
        
        System.out.println("El hijo mayor recibirá: $" + hijoma);
        System.out.println("El hijo de en medio recibirá: $" + hijome);
        System.out.println("El hijo pequeño recibirá: $" + hijope);
        System.out.println("La esposa recibirá: $" + esposa);
        
    }
}

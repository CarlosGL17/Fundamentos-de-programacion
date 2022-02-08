package Unidad3;

import java.util.Scanner;
// Hacer un programa que puda un numero que será la potencia a elevar a otro numero
// Si el numero elevado a dicha potencia es mayor a 100, mostrar "Numero valido"

public class EvaluacionCortoCircuito {
    public static void main(String[] args) {
        int potencia;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese potencia a elevar: ");
        potencia = teclado.nextInt();
        
        int numero = 5;
        double resultado;
        
        // resultado = Math.pow(numero, potencia);
        
        
        
        if ( potencia > 0 && Math.pow(numero, potencia) > 100)
        {
            System.out.println("Numero valido");
        }
        
        
    }
}

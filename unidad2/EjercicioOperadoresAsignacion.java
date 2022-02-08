package unidad2;

import java.util.Scanner;

public class EjercicioOperadoresAsignacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double resultado = 5;
        
        double otroValor = 0;
        
        System.out.println("¿Que valor quieres sumar?");
        otroValor = teclado.nextDouble();
     
        resultado += otroValor;
        System.out.println("El resultado de la suma de los numeros es: " + resultado );
        
        resultado = 5;
        
        System.out.println("¿Que valor quieres restar?");
        otroValor = teclado.nextDouble();
              
        resultado -= otroValor;
        System.out.println("El resultado de la resta de los numeros es: " + resultado );
        
        resultado = 5;
        
        System.out.println("¿Que valor quieres multiplicar?");
        otroValor = teclado.nextDouble();
        
        resultado *= otroValor;
        System.out.println("El resultado de la multiplicacion de los numeros es: " + resultado );
        
        resultado = 5;
        
        System.out.println("¿Que valor quieres dividir?");
        otroValor = teclado.nextDouble();
        
        resultado /= otroValor;
        System.out.println("El resultado de la division de los numeros es: " + resultado );
        

        
    }
     
}

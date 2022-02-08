package Unidad3;

import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) {
        
        int opcion;
        Scanner teclado = new Scanner(System.in);
                
        do
        {
            System.out.println("MENÚ:");
            System.out.println("1- Calcular area de rectangulo");
            System.out.println("2- Calcular area de triangulo");
            System.out.println("3- Calcular area de circulo");
            System.out.println("4- Salir");
            System.out.println("Ingrese una opción: ");
            opcion = teclado.nextInt();
            
        } while (opcion != 4);
        
    }
}

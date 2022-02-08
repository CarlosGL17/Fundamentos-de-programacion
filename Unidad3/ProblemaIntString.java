package Unidad3;

import java.util.Scanner;

public class ProblemaIntString {
    public static void main(String[] args) {
        
        String nombre;
        int numero1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        numero1 = teclado.nextInt();
        // Sin el siguiente comando no se puede realizar la accion de ingresar el nombre, esto para limpiar el buffer
        teclado.nextLine();
        System.out.println("Ingresa tu nombre: ");
        nombre = teclado.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
    }
}

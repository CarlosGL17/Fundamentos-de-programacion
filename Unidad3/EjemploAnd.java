package Unidad3;

import java.util.Scanner;

public class EjemploAnd {
    public static void main(String[] args) {
        
        Scanner teclado = new  Scanner(System.in);
        String nombre = "";
        final String NOMBRE_VALIDO = "Carlos";
        int edad = 0;

        System.out.println("Ingresa el nombre de la persona");
        nombre = teclado.nextLine();

        System.out.println("Ingresa la edad de la persona");
        edad = teclado.nextInt();

        if (nombre.equals(NOMBRE_VALIDO) && edad > 30) {
            System.out.println("Adelante");
        } else {
            System.out.println("denegado");
        }

        teclado.close();
        
        
        
    }
}

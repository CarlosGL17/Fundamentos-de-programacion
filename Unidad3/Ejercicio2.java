package Unidad3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int num;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un numero entero entre 1 y 1000");
        num = teclado.nextInt();
        // utilizar doble "=" para señalar igual
        boolean resultado = num == 777;
        // if (resultado)  ->  puede sustituir lo que sigue a continuacion
        if (num == 777)
        {
            System.out.println("Felicidades!!!");
        }
        
        char letra;
        System.out.println("ingrese letra: ");
        letra = teclado.next().charAt(0);
        if (letra == 's')
        {
            System.out.println("Salir");
        }
        
        String nombre;
        final String NOMBRE_CORRECTO = "Carlos";
        teclado.nextLine();
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();
        // if(nombre == "Carlos")
        if (nombre.equals("Carlos"));
        if (nombre.equals(NOMBRE_CORRECTO));
        {
            System.out.println("Te llamas carlos");
        }
        
        
    }
}

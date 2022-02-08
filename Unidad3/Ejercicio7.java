package Unidad3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        String usuario;
        final int CODE = 13579;
        final String ADMIN = "Admin";
        int codigo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca su usuario: ");
        usuario = teclado.nextLine();
        
        
        System.out.println("Introduzca numero de contraseña: ");
        codigo = teclado.nextInt();
        
        
        if (usuario.equals(ADMIN))
        {
            if (codigo == 13579)
            {
                System.out.println("Acceso autorizado");
            }
            else
            {
                System.out.println("Contraseña incorrecta");
            }
        }
        else 
        {
            System.out.println("Usuario incorrecto");
        }
    
    }
}


       
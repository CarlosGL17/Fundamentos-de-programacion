package Unidad3;

import java.util.Scanner;

public class SimboloNegacion {
    public static void main(String[] args) {
        
        String usuario;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su usuario: ");
        usuario = teclado.nextLine();
        
        final String NOMBRE_USUARIO = "admin";
        
       // if ( usuario.equals(NOMBRE_USUARIO))
        if (usuario.equalsIgnoreCase(NOMBRE_USUARIO))
        {
            System.out.println("Bienvenido");
        }
        
        // Si el usuario NO fuera admin, indicar "Acceso denegado"
        
        if (! usuario.equals(NOMBRE_USUARIO))
        {
            System.out.println("Acceso denegado");
        }
        
        
    }
    
}

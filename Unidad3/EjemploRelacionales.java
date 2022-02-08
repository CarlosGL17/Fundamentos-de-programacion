package Unidad3;

import java.util.Scanner;

public class EjemploRelacionales {
    public static void main(String[] args) {
        
        int edad;
        String estadocivil;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        
        teclado.nextLine();
        System.out.println("Ingrese su estado civil: ");
        estadocivil = teclado.nextLine();
        
        //Si ambos se cumplen
        if (edad >= 18 && 
                (estadocivil.equalsIgnoreCase("soltero") 
                || estadocivil.equalsIgnoreCase ("divorciado")
                || estadocivil.equalsIgnoreCase ("viudo")))
        {
            System.out.println("Puedes casarte!");
        }
        
    }
}

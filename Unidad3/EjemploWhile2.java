
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AMERICA ALEJANDRA SANTOS SANCHEZ 
 */
public class EjemploWhile2 {
    public static void main(String[] args) {
        //pedir numeros al usuario, cuando se ingrese un numero par, terminar
        boolean bandera = true; 
        int numero; 
        Scanner teclado = new Scanner(System.in);
        while (bandera )
        {
            System.out.println("Ingrese numero: ");
            numero = teclado.nextInt();
            if ( numero % 2 == 0)
            {
              bandera = false;
            }
        }    
    }
    
}

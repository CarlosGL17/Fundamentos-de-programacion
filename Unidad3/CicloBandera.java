
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author REDES01
 */
public class CicloBandera {
    public static void main(String[] args) {
        char digito; 
        boolean bandera = false;
        while ( !bandera )
        {
            System.out.println("Ingresa un caracter: ");
            Scanner teclado = new Scanner (System.in);
            digito = teclado.next().charAt(0);
            if (digito >= '0' && digito <= '9' )
            {
                bandera = true;
            }
        }
    }
}

import java.util.Scanner;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author REDES01
 */
public class DiferenciaWhileYDoWhile {
    public static void main(String[] args) {
        // PEDIR NUMERO HASTA QUE SE INTRODUZCA EL NUMERO -1
        final int CENTINELA = -1;
        int numeroLeido;
        Scanner teclado = new Scanner(System.in);
        
        //CICLO WHILE
        System.out.println("Ingrese un numero: ");
        numeroLeido = teclado.nextInt();
        while (numeroLeido != CENTINELA)
        {
            System.out.println("Ingrese un numero: ");
            numeroLeido = teclado.nextInt();
        }
        
        //CICLO DO WHILE
        do
        {
            System.out.println("Ingrese un numero: ");
            numeroLeido = teclado.nextInt();
        }
        while(numeroLeido != CENTINELA);
        
    }
}


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
public class EjemploWhile1 {
    public static void main(String[] args) {
        /*int contador = 1; 
        while (contador <= 1000)
        {
        
            System.out.println(contador);
            contador ++;
        }  */
        
//        int contador = 2; 
//        while(contador <= 100000)
//        {
//            System.out.println(contador);
//        contador +=2;
//        }
//PEDIR DOS NUMEROS, UNO DE INICIO Y OTRO DE FINAL
// MOSTRAR LOS NUMEROS DESDE EL INBICIO HASTA EL FINAL 
Scanner teclado = new Scanner(System.in);
 int inicio = 0; 
 int valorFin = 0; 
        System.out.println("Ingrese el valor de inicio: ");
        inicio = teclado.nextInt();
        System.out.println("Ingrese el valor del final: ");
        valorFin = teclado.nextInt(); 
        while (inicio <= valorFin)
        {
            System.out.println(inicio);
            inicio ++;
        }    
           
    }            
    
}

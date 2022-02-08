package unidad2;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        
        double in;
        double cm;
        
        Scanner teclado = new Scanner(System.in);   
        System.out.println("Ingrese la medida en pulgadas ");
        in = teclado.nextDouble();
        
        cm = (in * 2.54);
        
        System.out.println("La medida en centimetros es: " + cm + "cm");
        
    }
}

package unidad2;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        
        double altura;
        double base;
        double area;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base: " );
        base = teclado.nextDouble();
        System.out.println("Ingrese el valor de la altura: " );
        altura = teclado.nextDouble();
        
        area = (base * altura);
        
        System.out.println("El area del rectangulo es: " + area);
   
    }
   
}

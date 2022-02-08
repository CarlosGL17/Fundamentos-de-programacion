package unidad2;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        
        double altura;
        double basem;
        double baseM;
        double area;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la base mayor: ");
        baseM = teclado.nextDouble();
        System.out.println("Ingrese la base menor: ");
        basem = teclado.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = teclado.nextDouble();
        
        area = ((baseM + basem)/2 ) * altura;
        System.out.println("El area del trapecio es: " + area);
        
    }
    
}

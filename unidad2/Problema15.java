package unidad2;

import java.util.Scanner;

public class Problema15 {
    public static void main(String[] args) {
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double nota5;
        double prom1;
        double prom2;
        double promF;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame la primer nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Dame la segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.println("Dame la tercer nota: ");
        nota3 = teclado.nextDouble();
        System.out.println("Dame la cuarta nota: ");
        nota4 = teclado.nextDouble();
        System.out.println("Dame la quinta nota: ");
        nota5 = teclado.nextDouble();
        
        prom1 = (nota1 + nota2)/2;
        
        prom2 = (nota3 + nota4)/2;
        
        promF = prom1 + prom2 + nota5;
        
        System.out.println("El promedio final es de: " + promF);
    }
}

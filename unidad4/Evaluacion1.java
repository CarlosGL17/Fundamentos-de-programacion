package unidad4;

import java.util.Scanner;

public class Evaluacion1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        double arrS[] = new double[10];
        double total = 0;
        double promS;
        
        for (int i = 0; i < arrS.length ; i++)
        {
            System.out.println("Ingrese su salario: ");
            arrS[i] = teclado.nextDouble();
           
        }
        
        for (int i = 0; i < arrS.length ; i++)
        {
            System.out.println("El salario num: " + i + " es de: $" + arrS[i]);
            total = total + arrS[i];
        }
        
        promS = total / 10;
        
        System.out.println("El salario promedio es de: $" + promS);
        
    }
}

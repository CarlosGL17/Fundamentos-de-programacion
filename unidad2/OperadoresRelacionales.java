package unidad2;

import java.util.Scanner;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        boolean res = 10 <= 10;
        System.out.println("Resultado: " + res);
        
        res = 8 != 8;
        System.out.println("Resultado: " + res);
        
        double var1;
        double var2;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor 1: " );
        var1 = teclado.nextDouble();
        System.out.println("Ingrese valor 2: " );
        var2 = teclado.nextDouble();
        res = var1 > var2;
        System.out.println("¿Var1 es mayor a var1? " + res);
                
    }
    
    
    
}

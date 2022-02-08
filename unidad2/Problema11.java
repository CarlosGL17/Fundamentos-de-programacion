package unidad2;

import java.util.Scanner;

class Problema11 {
    public static void main(String[] args) {
        
       double prestamo1;
       double prestamo2;
       final double INT1 = 1.26;
       final double INT2 = 1.35;
       double credito1;
       double credito2;
       double creditoF;
       
       Scanner teclado = new Scanner(System.in);  
       System.out.println("¿De cuanto será tu préstamo?");
       prestamo1 = teclado.nextDouble();
       
       System.out.println("¿De cuanto será tu préstamo?");
       prestamo2 = teclado.nextDouble();
      
       credito1 = prestamo1 * INT1;
       credito2 = prestamo2 * INT2;
       
       creditoF = credito1 + credito2;

       System.out.println("Cantidad del préstamo1 es de: $" + prestamo1);
       System.out.println("Cantidad del préstamo2 es de: $" + prestamo2);
       System.out.println("El total a pagar del prestamo1 es: $" + credito1);
       System.out.println("El total a pagar del prestamo2 es: $" + credito2);
       System.out.println("El total a pagar por ambos creditos es de: $" + creditoF); 
    }
}


import java.util.Scanner;


 // @author AMERIC ALEJANDRA SANTOS SANCHEZ

public class EjemploCicloWhileAlimentos {
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int cantidadAlimentos, contador, suma, cantidadCalorias;
      contador = 0; 
      suma = 0;
        System.out.println("Ingrese la cantidad de alimentos consumidos: ");
        cantidadAlimentos = teclado.nextInt (); 
        while(contador < cantidadAlimentos)
        {
            System.out.println("Ingrese la cantidad de calorias de alimento"
            + contador + 1 +":");
            cantidadCalorias = teclado.nextInt();
            suma+=cantidadCalorias; 
            contador ++; 
        }
        System.out.println("La suma total de las calorias es: "+ suma);
    }
           
    
}

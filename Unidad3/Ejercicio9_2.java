import java.util.Scanner;

public class Ejercicio9_2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int contador = 0 ;
        int suma = 0;
        
        while(contador <= 1000)
           
        {
            if (contador % 2 == 0);
            
            {
                suma = suma + contador;
                
                
            } 
             contador++;
        }
        System.out.println(suma);
    }
  
}

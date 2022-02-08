import java.util.Scanner;
public class EjemploCicloFor2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        final int MAX = 100; 
        
        for (int i = 0, j = MAX; i < j; i++, j--)
        {
            System.out.println("El valor de i es: " + i);
            
            System.out.println("El valor de j es: " + j);
            
        }
        
    }
  
}

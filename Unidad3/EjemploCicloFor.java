import java.util.Scanner;
public class EjemploCicloFor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int i = 0;
        
        System.out.println("Ingrese valor inicial: ");
        i = teclado.nextInt();
        // Mientras i sea positiva o que no sea par      
        
        for (; (i >= 0) /*&& (i % 2 != 0)*/ ; i -= 3) 
        {
            if (i % 2 != 0)
            {
            System.out.println("Valor de i= " + i);
            }
        }
        
    }
}

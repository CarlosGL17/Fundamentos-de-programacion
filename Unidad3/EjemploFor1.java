import java.util.Scanner;
public class EjemploFor1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int edad;
        int suma = 0;
        double prom = 0;
        
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Ingrese una edad: ");
            edad = teclado.nextInt();
            
            suma = suma + edad;
        }
        prom = suma / 10;
        
        System.out.println("El promedio de edad es: " + prom);
    }
}

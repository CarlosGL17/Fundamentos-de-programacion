import java.util.Scanner;
public class EjemploDoWhile1 {
    public static void main(String[] args) {
        //CALCULAR EL PROMEDIO DE 10 EDADES INTRODUCIDAS POR TECLADO
        Scanner teclado = new Scanner(System.in);
        
        int contador = 0;
        int edad;
        int suma = 0;
        double prom;
        
        do
        {
            System.out.println("Ingrese la edad: ");
            edad = teclado.nextInt();
            suma = suma + edad;
            contador = contador + 1; // tambien puede ser: contador++;
        }
        while(contador <= 10);
        
        prom = suma / 10 ;
        
        System.out.println("El promedio de edad es: " + prom);
    }
}

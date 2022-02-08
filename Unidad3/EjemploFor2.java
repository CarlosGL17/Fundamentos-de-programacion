import java.util.Scanner;
public class EjemploFor2 {
    public static void main(String[] args) {
        //Utilizando un ciclo for, pedir numeros, cuando el numero ingresado sea multiplo de 3, salir y mostrar la suma de los numeros leidos
        Scanner teclado = new Scanner(System.in);
        
        int suma = 0;
        int num;
        
        boolean bandera = true;
        //while (bandera) de preferencia en algunos casos
        for (; bandera; ) 
        {
            System.out.println("Ingrese numero: ");
            num = teclado.nextInt();
            
            suma = suma + num;
            if (num%3 == 0)
            {
                bandera = false;
            }
            
        }
        System.out.println("La suma es: " + suma);
    }
}

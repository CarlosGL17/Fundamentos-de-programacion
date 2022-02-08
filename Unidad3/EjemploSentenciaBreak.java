import java.util.Scanner;
public class EjemploSentenciaBreak {
    public static void main(String[] args) {
        
        //Hacer un programa que pida 10 numeros pares y muestre su suma
        //si recibe un impar deja de pedir numeros y muestra la suma actual
        
        byte LIMITE = 10;
        int suma = 0;
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < LIMITE; i++) 
        {
            System.out.println("Ingresa un numero par: ");
            numero = teclado.nextInt();
            
            if (numero % 2 != 0) 
            {
                break;
            }
            suma += numero;
        }
        System.out.println("La suma es: " + suma);
    }
}

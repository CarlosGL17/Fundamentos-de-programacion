package unidad3;

import java.util.Scanner;
/*
*Ejemplo de la utilizacion de If y Else
@autor Carlos Lira
*/

public class ejemploIfElsee {
    public static void main(String[] args) {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero = teclado.nextInt();

        if (numero > 1000) {
            System.out.println("Numero muy grande");
        } else{
            System.out.println("Numero muy pequeño");
        }
        
        teclado.close();
    }
}

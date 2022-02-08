package unidad4;

import java.util.Scanner;
public class Evaluacion4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int arr[] = new int [30];
        int num;
        int cont = 0;
        int numMayor = 0;
        int posMa = 0;
        int posMe = 0;
        int posMau = 0;
        int posMeu = 0;
        int numMenor = 100;
        
        // Llenar el arreglo con numero aleatorios
        for (int i = 0; i < arr.length ; i++) 
        {
            arr[i] = (int) (Math.random() * 100); 
        }
        // Mostrar los numeros
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " - ");
        }
        
        // Buscar el mayor y menor
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > numMayor)
            {
                numMayor = arr[i];
                posMa = i;    
                
            }
            else if (arr[i] < numMenor)
            {
                numMenor = arr[i];
                posMe = i;
            }
            
            if (arr[i] == numMayor)
                {
                    posMau = i;
                    
                }
            
            if (arr[i] == numMenor)
                {
                    posMeu = i;
                    
                }
            
        }
        
        //Mostrar mayor y menor
        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero menor es: " + numMenor);
        
        // Mostrar posiciones
        System.out.println("La primer posicion del numero mayor es: " + posMa);
        System.out.println("La ultima posicion del numero mayor es: " + posMau);
        System.out.println("La primer posicion del numero menor es: " + posMe);
        System.out.println("La ultima posicion del numero menor es: " + posMeu);
        
        
        // Pedir numero al usuario y mostrar su num de repticiones en el arreglo
        System.out.println("Ingrese un numero entre el 0 y el 100: ");
        num = teclado.nextInt();
        
        for (int i = 0; i < arr.length -1; i++) 
        {
            if (arr[i] == num)
            {
                cont++;
            }
            else
            {
            }
        }
        
        System.out.println("Tu numero se repitió " + cont + " veces en el arreglo");
        
        // Suma y promedio de numeros pares e impares 
        int pares = 0;
        int impares = 0;
        int contPares = 0;
        int contImpares = 0;
        
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] % 2 == 0) 
            {
                pares += arr[i];
                contPares++;
            }
            else
            {
                impares += arr[i];
                contImpares++;
            }
        }
        
        System.out.println("La suma de los numeros pares es: " + pares);
        System.out.println("La suma de los numeros impares es: " + impares);
        
        
        
    }
}

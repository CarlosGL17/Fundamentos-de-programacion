package unidad4;

public class EjemploArreglos5 {
    public static void main(String[] args) {
        
        //Crear un arreglo de 20 numeros generados aleatoriamente y mostrar cuantos son pares y cuantos son impares
        
        int par = 0;
        int impar = 0;
        int arr[] = new int[20];
        
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random()*100);
            
            if (arr[i] % 2 == 0)
            {
                par++;
            } 
            else
            {
                impar++;
            }
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Los numeros son: " + arr[i]);
        }
        
        System.out.println("La cantidad de numeros pares es: " + par);
        System.out.println("La cantidad de numeros impares es: " + impar);
        
    }
}

package examen;
/*
    *@author GARCIA LIRA CARLOS HUMBERTO
*/
public class Examen {
    public static void main(String[] args) {
        //Definir el arregloOriginal
        int arregloOriginal[] = new int[20];

        //Llenar el arregloOriginal al azar
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = (int)(Math.random() * 100);
        }

        //Cantidad de numeros pares e impares para definir los arreglos
        int cantidadPares = 0, cantidadImpares = 0;
        for (int i = 0; i < arregloOriginal.length; i++) {
            if (arregloOriginal[i] % 2 == 0){
                cantidadPares++;
            } else{
                cantidadImpares++;
            }
        }

        //Definicion del arreglo arregloPares
        int arregloPares[] = new int[cantidadPares];
        
        //Llenado del arregloPares con los números pares del arreglo original
        int contadorPares = 0, contadorImpares = 0, contador = 0;
        while (contadorPares < arregloPares.length){
            if (arregloOriginal[contador] % 2 == 0){
                arregloPares[contadorPares++] = arregloOriginal[contador];
            }
            contador++;
        }

        //Definicion del arreglo arregloImpares
        int arregloImpares[] = new int[cantidadImpares];
        
        //Llenado del arregloImpares con los números impares del arreglo original
        contador = 0;
        while (contadorImpares < arregloImpares.length){
            if (arregloOriginal[contador] % 2 != 0){
                arregloImpares[contadorImpares++] = arregloOriginal[contador];
            }
            contador++;
        }

        //Mostrar los arreglos
        System.out.println("ArregloOriginal: " + arregloOriginal.length + " elementos");
        mostrarArreglo(arregloOriginal);

        System.out.println("\n\nArregloPares: " + arregloPares.length + " elementos");
        mostrarArreglo(arregloPares);

        System.out.println("\n\nArregloImpares: " + arregloImpares.length + " elementos");
        mostrarArreglo(arregloImpares);

        // Bubble Sort de Mayor a Menor
        for (int i = 0; i < arregloOriginal.length; i++) {
            for (int j = 1; j < arregloOriginal.length-i; j++) {
                if (arregloOriginal[j-1] < arregloOriginal[j]){
                    int temporal = arregloOriginal[j-1];
                    arregloOriginal[j-1] = arregloOriginal[j];
                    arregloOriginal[j] = temporal;
                }
            }
        }

        //Mostrar los elementos del arregloOriginal del mayor al menor
        System.out.println("\n\nArregloOriginal mayor a menor: " + arregloOriginal.length + " elementos");
        mostrarArreglo(arregloOriginal);
        System.out.println("");
    }
    public static void mostrarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}

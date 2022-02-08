package unidad4;


public class EjemploArreglos4 {
    public static void main(String[] args) {
        
        int arreglo[] = new int[10];
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++)
        {
            arreglo[i] = (int) (Math.random() * 100);
            suma = suma + arreglo[i];
            
        }
        // Actividad: calcular y mostrar la suma de los 10 numeros generados
        for (int i = 0; i < arreglo.length; i++)
        {
            System.out.println("El numero es: " + arreglo[i]);
        }
        System.out.println();
        System.out.println("La suma de los 10 numeros es: " + suma);
    }
}

package Unidad5;
//crear una clase que lea las calificaciones de 5 alumnos y muestre el promedio de las mismas
// Utilizar metodos
import java.util.Scanner;
public class EjerciciosArreglos1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int cantidad;
        System.out.println("Ingrese la cantidad de calificaciones a revisar: ");
        cantidad = teclado.nextInt();
        double arrCalificaciones[];
        
        // Crear objetos para pdoer usar los metodos
        EjerciciosArreglos1 objeto = new EjerciciosArreglos1();
        double calificaciones;
        
        arrCalificaciones = objeto.lecturaCalif(cantidad);
        
        double promedio;
        promedio = objeto.promedio(arrCalificaciones);
        
        System.out.println("El promedio es: " + promedio);
        
        
        
    }
    /**
     * Lee las calificaciones a leer
     * @param cant Numero de calificaciones a leer
     * @return Arreglo con las calificaciones
     */
    
    
    public double[] lecturaCalif (int cant)
    {
        Scanner teclado = new Scanner(System.in);
        double arrCalif[] = new double [cant];
        int cont = 1;
        
        for (int i = 0; i < cant; i++)
        {
            double calif;
            System.out.print("Ingrese calificacion " + cont + ": ");
            arrCalif[i] = teclado.nextDouble();
            cont++;
        }      
        return arrCalif;
    
    }
    /**
     * Calcula el promedio de las calificaciones recibidas
     * @param calificaciones Arreglo con las calificaciones
     * @return Promedio calculado
     */
    public double promedio (double calificaciones[])
    {
        double prom;
        double sumaCalif = 0;
        
        for (int i = 0; i < calificaciones.length; i++) 
        {
            sumaCalif += calificaciones[i];
        }
        
        prom = sumaCalif/calificaciones.length;
        
        return prom;
    }
    
}

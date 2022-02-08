package Unidad4;
/*
Esta clase contiene una matriz bidimensional para las x materias de un alumno
cada materia tiene el mismo numero de unidades
Pedir al usuario el numero de materias y unidades a leer
solicitar las calificaciones y su nombre al usuario y mostrar
-> El nombre del alumno
-> Las calificaciones en formato tabla
-> El promedio de cada materia
-> El promedio general
*/

import java.util.Scanner;
public class EjercicioArreglosMultidimensionales {
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        
        String nombre;
        int materias;
        int unidades;
        double calif;
        double prom;
        double suma = 0;
        double promGen;
        double sumaTotal = 0;
        
        System.out.println("Ingrese la cantidad de materias: ");
        materias = teclado.nextInt();
        System.out.println("Ingrese la cantidad de unidades: ");
        unidades = teclado.nextInt();
        
        double cal[][] = new double[materias][unidades];
        
        for (int ren = 0; ren < cal.length; ren++) 
        {
            System.out.println("--------------------------------");
            System.out.println("Ingrese calificaciones de la materia " + ren);
            for (int col = 0; col < cal[0].length; col++) 
            {
                System.out.println("Unidad: " + col + ":");
                cal[ren][col] = teclado.nextDouble(); 
            }
            
        }
        
        for (int ren = 0; ren < cal.length; ren++)
        {
            suma = 0;
            for (int col = 0; col < cal[0].length; col++)
            {
                suma = suma + cal[ren][col];
            } 
            prom = suma / unidades;
            sumaTotal = sumaTotal + prom;
            System.out.println("El promedio de la materia " + ren + " es: " + prom);
            
        }
        promGen = sumaTotal / materias;
        System.out.println("El promedio general es: " + promGen);
        
        for (int ren = 0; ren < cal.length; ren++) 
        {
            for (int col = 0; col < cal[0].length; col++) 
            {
                
            }
        }
    }
}

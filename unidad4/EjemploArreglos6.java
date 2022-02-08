package unidad4;

import java.util.Scanner;

public class EjemploArreglos6 {
    public static void main(String[] args) {
    // Pedir y leer 3 nombres de alumnos y sus respectivas calificaciones, luego
    // mostrar los nombres y su calificacion
    // Finalmente calcular y mostrar el promedio de las 3 calificaciones
    
        Scanner teclado = new Scanner(System.in);

        double suma = 0;
        double prom;
        
        String arrN[] = new String [3];
        int arrC[] = new int [3];
        
        for (int i = 0; i < arrN.length ; i++) 
        {
            System.out.print("Ingrese su nombre: ");
            // leer y guardar el nombre
            arrN[i] = teclado.nextLine();
            
            System.out.print("Ingrese la calificacion: ");
            // leer y guardar la calificacion
            arrC[i] = teclado.nextInt();
            
            teclado.nextLine();
        }
        
        for (int i = 0; i < 3; i++)
        {
            
            System.out.println("El alumno de nombre " + arrN[i] + " tiene la calificacion de: " + arrC[i]);
            
            suma = suma + arrC[i];
        }
        
        prom = suma / 3; 
        //prom = (arrC[0] + arrC[1] + arrC[2]) / 3;
                
        System.out.println("El promedio de las 3 calificaciones es: " + prom);
    }
}

package unidad2;

import java.util.Scanner;

public class ActividadLectura {
    public static void main(String[] args) {
        
        //Pedir, leer y mostrar 2 valores de cada tipo de dato numerico
        // byte, short, int, long, float y double
        Scanner teclado = new Scanner(System.in);
     
    // INT
    int gatos = 0;
    System.out.println("¿Cuantos gatos hay en tu casa?");
     gatos = teclado.nextInt();
    System.out.println("En mi casa tengo " + gatos + " gatos" );    
        
    int guitarrasRock = 0;
    System.out.println("Cantidad de guitarras que ha comprado");
     guitarrasRock = teclado.nextInt();
    System.out.println("En toda mi vida he comprado " + guitarrasRock + " en total");  
    
    // SHORT
    short capitulosBleach = 0;
    System.out.println("¿Cuantos capitulos de Bleach has visto?");
     capitulosBleach = teclado.nextShort();
    System.out.println("He visto " + capitulosBleach + " capitulos hasta hoy");  
    
    short volumenes = 0;
    System.out.println("Volumenes de la novela");
     volumenes = teclado.nextShort();
    System.out.println("La novela cuenta con " + volumenes + " volumenes");  
    
    // LONG
    long personasEstadio = 0;
    System.out.println("Registro de personas que ingresaron al estadio ");
     personasEstadio = teclado.nextLong();
    System.out.println("El total de personas que entraron al estadio fueron: " + personasEstadio );  
    
    long velocidadAvion = 0;
    System.out.println("Velocidad maxima registrada en el vuelo en km/h: ");
     velocidadAvion = teclado.nextLong();
    System.out.println("La velocidad maxima alcanzada por el avion fue de: " + velocidadAvion + "km/h" );  
    
    // BYTE
    byte caminos = 0;
    System.out.println("Caminos disponibles para viajar a Zamora");
     caminos = teclado.nextByte();
    System.out.println("Para llegar a Zamora hay " + caminos + " caminos disponibles");  
    
    byte mascotas = 0;
    System.out.println("¿Cuantas mascotas tienes?");
     mascotas = teclado.nextByte();
    System.out.println("En casa tengo " + mascotas + " mascotas");   
    
    // FLOAT
    
    System.out.println("");
    
    System.out.println(" " );  
    
    
    System.out.println("");
   
    System.out.println(" " );  
    
    // DOUBLE
    
    System.out.println("");
    
    System.out.println(" " );  
        
    
    System.out.println("");
    
    System.out.println(" " );     
        
    }
    
}

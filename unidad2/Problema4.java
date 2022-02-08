package unidad2;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        
        // https://mate.uprh.edu/~jse/cursos/4097/notas/java/javaEspanol/JavaTut/Cap3/math.html
        
        final double PI = 3.141592;
        double radio;
        double area;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        radio = teclado.nextDouble();
        
        area = Math.PI * (radio * radio);
        System.out.println("El area es de: " + area);
        
        System.out.println("Ingrese el radio del circulo: ");
        radio = teclado.nextDouble(); 
        
        area = PI * (radio * radio);
        System.out.println("El area es de: " + area);
        
        
    }
    
}

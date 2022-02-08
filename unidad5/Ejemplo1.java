package unidad5;
/*
Crear una clase que tenga un metodo, que tenga 2 parametros de tipo int
que los sume y devuelva el resultado

*/

public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        Ejemplo1 operacionesMatematicas = new Ejemplo1();
        int valorA = 3;
        int valorB = 7;
        int res;
        res = operacionesMatematicas.suma(valorA, valorB); 
        
        System.out.println("La suma es: " + res);
        
        
    }
    // Crear metodo --->
    public int suma(int valor1, int valor2){
    
        int resultado = 0;
        resultado = valor1 + valor2; 
        
        return resultado;
    
    }
    
}

package unidad2;

public class TiposDeDatos {
    /*
    int -> enteros
    double -> numeros con punto
    char -> 1 caracter
    boolean -> verdadero - false 
    */
    int edad = 30; 
    //las variables se escriben en minusculas 
    //separando la segunda palabra con mayuscula
    int numeroAlumnos = 20; 
    int escuelasEnMexico = 2500;
    //rango para:
    //byte de -128 a 127
    //short de -32768 a 32676
    //int de -2167683648 a 2147483647
    //long de 9223372036854775808 a 9223372036854775807
    byte edadAlumno = 7;
    
    //double
    //temperatura
    double temperaturaNormal = 36.5;
    //saldo de la tarjeta
    double saldoTarjeta = 250.50;
    
    //char
    //primera letra de un nombre
    char primeraLetra = 'A';
    char grupo = 'B';
    
    //boolean
    boolean resultado = true;
    boolean mayorEdad = false;
    
    public static void main(String[] args)
    {
    int dato = 12;
    long numeroDeBacterias = 23456789456L;
    byte numero = 0;
    int otroNumero = 200;
    //otroNumero = numero;
    numero = (byte)otroNumero;
        System.out.println("El valor es:" + dato);
        System.out.println("El numero de bacterias es: " + numeroDeBacterias);
        System.out.println("El numero es: " + otroNumero );
        
    }
    
    
}

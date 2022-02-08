package unidad5;

import java.util.Scanner;
public class OperacionesTexto {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        OperacionesTexto objetoTexto = new OperacionesTexto();
        
        
        int cant = objetoTexto.cantCaracteres("Hola mundo");
        
        System.out.println("La palabra tiene " + cant + " caracteres");
        
        System.out.println("-----------------------------------------------------");
        
        String palabra;
        int numero;
        
        System.out.println("Ingresa una palabra: ");
        palabra = teclado.nextLine();
        
        System.out.println("Ingrese un numero entero: ");
        numero = teclado.nextInt();
        
        char pos = objetoTexto.posicion(numero, palabra);
        
        System.out.println("La letra en la posicion " + numero + " de la palabra " + palabra + " es: " + pos);
        
        System.out.println("-----------------------------------------------------");
        
        teclado.nextLine();
        
        String pal1;
        String pal2;
        
        System.out.println("Ingrese un texto aleatorio");
        pal1 = teclado.nextLine();
        
        System.out.println("Ingrese una palabra");
        pal2 = teclado.nextLine();
        
        boolean comparacion = objetoTexto.comparacionCadenas(pal1, pal2);
        
        System.out.println(comparacion);        
        
        System.out.println("-----------------------------------------------------");
        
        String frase;
        int num1;
        int num2;
        
        System.out.println("Ingrese unas palabras a continuacion: ");
        frase = teclado.nextLine();
        
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt(); 
        
        teclado.nextLine();
        
        String extraer = objetoTexto.extraer(frase, num1, num2);
       
        System.out.println("De la frase -" + frase + "- se extrajó: " + extraer);
        
        System.out.println("-----------------------------------------------------");
        
        String wr1;
        String wr2;
        
        System.out.println("Ingrese un texto: ");
        wr1 = teclado.nextLine();
        
        System.out.println("Ingrese una cadena: ");
        wr2 = teclado.nextLine();
        
        int cadenaExtra = objetoTexto.cadenaEsp(wr1, wr2);
        
        if (cadenaExtra == -1) 
        {
            System.out.println("Palabra no encontrada");
        }
        else
        {
            System.out.println("La cadena " + wr2 + " se encuentra en la posicion: " + cadenaExtra);
        }     
       
        System.out.println("-----------------------------------------------------");
        
        String cadena;
        
        System.out.println("Ingrese un texto: ");
        cadena = teclado.nextLine();
        
        String mayuscula = objetoTexto.cambioTam(cadena);
        
        System.out.println(mayuscula);
        
        System.out.println("-----------------------------------------------------");
        
        String cadena2;
        
        System.out.println("Ingrese un texto: ");
        cadena2 = teclado.nextLine();
        
        String minuscula = objetoTexto.cambioTamM(cadena2);
        
        System.out.println(minuscula);
        

    }
    // Cantidad de caracteres que contiene
    public int cantCaracteres (String palabra)
    {
        int cantidad;
        cantidad = palabra.length();
        return cantidad;
        
    } 
    // Mostrar la letra de una posicion especifica de una palabra antes tambien solicitada
    public char posicion (int num, String palabra){
  
        int cant;
        cant = palabra.length();
        
        if (num < 0)
        {
            System.out.println("La posicion no es valida");  
        } 
        else if (num > cant)
        {
            System.out.println("Posicion no alcanzada");
        }
        else 
        {
            char letra = palabra.charAt(num);
            return letra;
        }
      
        char a = ' ';
        return a;
    }
    // Comparacion de cadena
    public boolean comparacionCadenas (String w1, String w2){
        
        boolean resp;
        
        resp = w1.startsWith(w2);
        
        return resp;
    
    
    }
    // Extrar parte de una cadena
    public String extraer (String frase, int num1, int num2){
    
        String recorte;
        
        recorte = frase.substring(num1, num2);
    
        return recorte;
    
    }
    // Regreso de posicion de cadena
    public int cadenaEsp (String sr1, String sr2){
    
        int extraido;
        
        extraido = sr1.indexOf(sr2);
        
        return extraido; 
    }
    // Todo a mayusculas
    public String cambioTam (String cad){
        
        String cad2;
        
        cad2 = cad.toUpperCase();
        
        return cad2;
    
    }
    //Todo a minusculas
    public String cambioTamM (String cad){
        
        String cad2;
        
        cad2 = cad.toLowerCase();
        
        return cad2;
    
    }
    
   
    
    
}

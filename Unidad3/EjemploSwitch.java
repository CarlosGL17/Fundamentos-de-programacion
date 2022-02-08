package Unidad3;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        
        int mes;
        final int ENERO = 1;
        final int FEBRERO = 2;
        final int MARZO = 3;
        final int ABRIL = 4;
        final int MAYO = 5;
        final int JUNIO = 6;
        final int JULIO = 7;
        final int AGOSTO = 8;
        final int SEPTIEMBRE = 9;
        final int OCTUBRE = 10;
        final int NOVIEMBRE = 11;
        final int DICIEMBRE = 12;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese numero de mes: ");
        mes = teclado.nextInt();
        
        switch(mes)
        {
            case ENERO:
                System.out.println("Mes de Enero");
                break;
            case FEBRERO:
                System.out.println("Mes de Febrero");
                break;
            case MARZO:
                System.out.println("Mes de Marzo");
                break;
            case ABRIL:
                System.out.println("Mes de Abril");
                break;
            case MAYO:
                System.out.println("Mes de Mayo");
                break;
            case JUNIO:
                System.out.println("Mes de Junio");
                break;
            case JULIO:
                System.out.println("Mes de Julio");
                break;
            case AGOSTO:
                System.out.println("Mes de Agosto");
                break;
            case SEPTIEMBRE:
                System.out.println("Mes de Septiembre");
                break;
            case OCTUBRE:
                System.out.println("Mes de Octubre");
                break;   
            case NOVIEMBRE:
                System.out.println("Mes de Noviembre");
                break;
            case DICIEMBRE:
                System.out.println("Mes de Diciembre");
                break;
            default:
                System.out.println("Mes no valido");
            
        }
        
        char letra = 'a';
        switch (letra)
        {
            case 'a':
                System.out.println("La letra a");
                break;
            case 'b':
                System.out.println("La letra b");
                break;
            case 'c':
                System.out.println("La letra c");
                break;
        }
        
        
        
        
    }
}

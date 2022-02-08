package examen;
import java.util.Scanner;
/*
    Una persona quiere comprar un automóvil, la agencia otorga créditos para la venta de dicho automóvil, con un
    interés de 5% mensual. Realizar un programa que solicite al usuario el costo original del automóvil y el número de
    meses en los cuales desea pagar dicho auto, mostrando el monto que debe pagar cada mes para pagar tanto el costo
    original como el interés.

    Por ejemplo, si el costo es de $120 000, y es a 12 meses. Entonces el 5% de los $120 000 es $3600, que es el
    impuesto mensual a añadir. Ahora tenemos que saber el costo mensual del auto dividiendo el costo inicial entre el
    número de meses, más el impuesto= ($120000/12)+$3600, lo que equivale a $13600, esto es lo que el usuario debe
    pagar.
    @autor: Garcia Lira Carlos Humberto
    ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────
*/
public class Examen2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double INTERES = 0.05;
        double costoOriginal, costoMensual, interesMensual;
        int meses;
        System.out.println("Ingresa el costo inicial del automovil");
        costoOriginal = teclado.nextDouble();
        System.out.println("¿A cuántos meses vas a pagar el automovil? ");
        meses = teclado.nextInt();
        interesMensual = costoOriginal * INTERES;
        costoMensual = (costoOriginal / meses) + interesMensual;

        System.out.println("El interes mensual es: \t\t\t\t" + "$" + interesMensual);
        System.out.println("El costo total mensual a pagar es: \t\t" + "$" + costoMensual);
        System.out.println("──────────────────────────────────");
        System.out.println("El costo total del carro es: \t\t\t" + "$" + costoMensual * meses);

        teclado.close();
    }
}

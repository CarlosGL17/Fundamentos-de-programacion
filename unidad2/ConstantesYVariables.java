package unidad2;

public class ConstantesYVariables {
    public static void main(String[] args) {
        //variable de tipo doble
        double precio = 25.75;
        System.out.println("El precio es de $" + precio);
        
        precio = 30.48;
        System.out.println("El precio nuevo del producto es de $" + precio);
        // La VARIABLE puede cambiar su valor
        
        // Crear una constante
        final int MAYORIA_EDAD = 18;
        System.out.println("La edad para ser mayor es: " + MAYORIA_EDAD);
        
        // No se puede modificar el valor de una constante
        // MAYORIA_EDAD = 20; 
        
        
    }
    
    
}

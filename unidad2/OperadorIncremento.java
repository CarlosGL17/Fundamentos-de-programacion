package unidad2;


public class OperadorIncremento {
    public static void main(String[] args) {
        
        int var = 10;
        var = var +1;
        System.out.println("Var = " + var);
        // 11
        var += 1;
        System.out.println("Var = " + var);
        // 12
        var++;
        System.out.println("Var = " + var);
        // 13
        int suma = 0;
        suma = var++;
        System.out.println("Suma = " + suma);
        System.out.println("Var = " + var);
        // 14
        
        int m = 99, n;
        n = ++m;
        System.out.println("m = " + m + ", n = " + n );
        n = m++;
        System.out.println("m = " + m + ", n = " + n );
        System.out.println("m = " + m++);
        System.out.println("m = " + ++m);
        
        
    }
    
    
    
}

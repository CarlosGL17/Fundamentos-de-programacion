package unidad2;


public class EjemploDebbuguer {
    public static void main(String[] args) {
        int m = 99;
        int n;
        n = ++m;
        System.out.println("m = " + m + ", n = " + n);
        n = m++;
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m = " + m++);
        System.out.println("m = " + ++m);
    
        
    }
    
  
    
}

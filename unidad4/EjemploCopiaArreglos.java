package unidad4;

public class EjemploCopiaArreglos {
    public static void main(String[] args) {
        
        int arrA[] = new int[10];
        int arrB[] = new int[10];
        
        for (int i = 0; i < arrA.length ; i++)
        {
            arrA[i] = (int) (Math.random() * 100);           
        }
        
        for (int i = 0; i < arrA.length ; i++)
        {
            arrB[i] = arrA[i];
        }
    }
 
}

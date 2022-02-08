
public class CiclosFor {
    public static void main(String[] args) {
        final byte LIMITE = 10;
        
        //FORMATO ASCENDENTE
        for(int i = 0; i <= LIMITE; i++)
        {
            System.out.println("Numero: " + i);
        }
        
        //FORMATO DESCENDENTE
        for(int i = LIMITE; i>= 0; i--)
        {
            System.out.println("Numero: " + i);
        }
    }
}

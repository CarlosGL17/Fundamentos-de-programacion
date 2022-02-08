package unidad5;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        //Crear objeto de la clase para utilizar el metodo
        OperacionesMatematicas identificador = new OperacionesMatematicas();
        
        double num = 10;
        boolean resultado;
        
        resultado = identificador.esPositivo(num);
        
//        if (resultado == true)
        if (resultado)
        {
            System.out.println("El numero es positivo");
        }
        else
        {
            System.out.println("El numero es negativo");
        }
        //--------------------------------------------------
        //--------------------------------------------------
        //--------------------------------------------------
        
        
        double arr[] = new double[5];
        
        for (int i = 0; i < arr.length ; i++) 
        {
            arr[i] = (int) (Math.random() * 100); 
        }
        
        OperacionesMatematicas sumador = new OperacionesMatematicas();
        
        double suma = sumador.sumarConjunto(arr);
        
        System.out.println("La suma de los datos del arreglo son: " + sumador);
       
        
        
        

    }
    
    public boolean esPositivo(double valor){
    
        boolean res;
        
        if (valor >= 0)
        {
            res = true;
        }
        else
        {
            res = false;
        }
        
        return res;
        
    }
    // Recibe un arreglo y devuelve la suma de los elementos del mismo
    // 
    public double sumarConjunto (double arr[]){
    
        
        double suma = 0;
        
//        for (int i = 0; i < arr.length; i++) 
//        {
//            suma += arr[i];
//        }

        for ( double dato : arr )
        {
            suma += dato;
        }
        
        return suma;
    
    }
    
    public int tabla (int num)
    {
        int cont = 0;
        
        int arr[] = new int [10];
        for (int i = 0; i < 10; i++) 
        {
            cont++;
            System.out.println( num + " x " + cont);
        }
        
        return 3;
        
    }
    
    
}

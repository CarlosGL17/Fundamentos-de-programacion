package unidad4;

public class MetodoBurbuja {
    public static void main(String[] args) {
        
        //crear arreglo de 10 
        int arr[] = new int[10];
        // llenar de manera aleatoria
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = (int) (Math.random() * 100); 
        }
        
        System.out.println("Arreglo original: ");
        for (int dato : arr) 
        {
            System.out.print(dato + " - ");
        }
        
        for (int j = 0; j < 10; j++)  // repetir el proceso 10 veces
        {
          for (int i = 0; i < arr.length-1; i++) 
            {
               if (arr[i] < arr[i+1])
               {
                  //hacer intercambio
                   int a = arr[i];
                   arr[i] = arr[i+1];
                    arr[i] = a;
                }    
            }  
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
                
        System.out.println("Arreglo ordenado: ");
        for (int dato : arr)
        {
            System.out.print(dato + " - ");
        }
        
    }
}

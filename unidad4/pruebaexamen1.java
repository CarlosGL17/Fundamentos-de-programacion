
package unidad4;
import java.util.Scanner;

public class pruebaexamen1 {
    
     public static void main(String[] args) {
        
        int cont=0;
        
        Scanner teclado = new Scanner(System.in);
        
        // Crear arreglo original
        int arregloOriginal[] = new int[20];
        
        for (int i = 0; i < arregloOriginal.length; i++) 
        {
             arregloOriginal[i] = (int) (Math.random() * 100); 
        }
        
        // Mostrar arreglo original
        for (int i = 0; i < arregloOriginal.length; i++)
        {
            System.out.println("Dato " + cont + ": " + arregloOriginal[i]);
            cont++;
        }
        System.out.println("");
        

        //Llenar otros arerglos
        
        int arregloPares[] = new int[arregloOriginal.length];
        int arregloImpares[] = new int[arregloOriginal.length];
        
        for (int i = 0; i < arregloOriginal.length; i++)
        {
            if(arregloOriginal[i] % 2 == 0)
            {
                 arregloPares[i] = arregloOriginal[i];
            }
            else
            {
                arregloImpares[i] = arregloOriginal[i];
            }   
        }
        
        // Mostrar datos
        System.out.println("Arreglo de los Pares: ");
        for (int dato : arregloPares)
        {
            System.out.print(dato + " - ");
        }
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Arreglo de los Impares: ");
        for (int dato : arregloImpares)
        {
            System.out.print(dato + " - ");
        }
      
//        // Ordenar ----- Trabajé de mas jajajajs

//        for (int j = 0; j < arregloPares.length; j++)
//        {
//          for (int i = 0; i < arregloPares.length-1 ; i++) 
//            {
//               if (arregloPares[i] < arregloPares[i+1])
//               {
//                  // intercambio
//                   int a = arregloPares[i];
//                   arregloPares[i] = arregloPares[i+1];
//                    arregloPares[i+1] = a;
//                }    
//            }  
//        }
//        
//        
//        for (int j = 0; j < arregloImpares.length; j++)
//        {
//          for (int i = 0; i < arregloImpares.length - 1; i++) 
//            {
//               if (arregloImpares[i] < arregloImpares[i+1])
//               {
//                  // intercambio
//                   int a = arregloImpares[i];
//                   arregloImpares[i] = arregloImpares[i+1];
//                    arregloImpares[i+1] = a;
//                }    
//            }  
//        }
        /////-----------------------------------------------
        for (int j = 0; j < arregloOriginal.length; j++)
        {
          for (int i = 0; i < arregloOriginal.length-1 ; i++) 
            {
               if (arregloOriginal[i] < arregloOriginal[i+1])
               {
                  // intercambio
                   int a = arregloOriginal[i];
                   arregloOriginal[i] = arregloOriginal[i+1];
                    arregloOriginal[i+1] = a;
                }    
            }  
        }
         
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("");
                  
//        System.out.println("Arreglo de Pares ordenado: ");
//        for (int dato : arregloPares)
//        {
//            System.out.print(dato + " - ");
//        }
//        
//        System.out.println("");
//     
//        System.out.println("Arreglo de Impares ordenado: ");
//        for (int dato : arregloImpares)
//        {
//            System.out.print(dato + " - ");
//        }
        
        System.out.println("Arreglo original ordenado: ");
        for (int dato : arregloOriginal)
        {
            System.out.print(dato + " - ");
        }
        
    }
     
     
     
     public int contador (int num1){
     
         if (num1<10) 
         {
            num1++;
         }
         
         return num1;
         
     }
     
    public double iva (double num){
        
        final double iva = 0.16;
        double valorF;
        
        valorF = (num * iva) + num;
        
        return valorF;
        
    
    }
    
    public void cargosExtra (int meses, double precio){
    
        double extra;
        double precioF;
        double precio2;
        
        extra = precio / 10;
        
        precio2 = meses * extra;
        
        precioF = precio + precio2;
    
    
    
    }
    
     
    }
     
    
     
     
     
    


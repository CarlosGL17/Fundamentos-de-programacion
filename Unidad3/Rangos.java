package Unidad3;


public class Rangos {
    public static void main(String[] args) {
        
        int calificacion = 10;
        if(calificacion >= 1 && calificacion <= 5) {
            System.out.println("Reprobado");
        } else{
            if(calificacion >= 6 && calificacion <= 8){
                System.out.println("Apenas aprobaste");
            } else {
                if(calificacion == 9){
                    System.out.println("Muy bien");
                } else {
                    System.out.println("Excelente");
                }
            }
        }
        
    }
}

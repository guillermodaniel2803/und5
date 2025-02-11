package TEMA5;
class Rectangulo { // Sin modificador “public” para que sólo sea accesible desde el paquete 
     // Atributos de clase 
     private static int numRectangulos; // Número total de rectángulos creados 
     public static final String nombreFigura= "Rectángulo"; // Nombre de la clase 
    public static final double PI= 3.1416; // Constante PI 
     // Atributos de objeto 
     private String nombre; // Nombre del rectángulo 
     public double x1, y1; // Vértice inferior izquierdo 
     public double x2, y2; // Vértice superior derecho 

     //metodos
    int getNumRectangulos(){
        return numRectangulos;
    }
    String getNombreFigura(){
        return nombreFigura;
    }
    double getPI(){
        return PI;
     }


}

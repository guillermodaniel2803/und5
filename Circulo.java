package TEMA5;
public class Circulo {
    //atributos
int x;
int y;
int radio;

//metodos
int obtenerX(){
    return x;
}

int obtenerY(){
    return y;
}


void establecerX(int valorX){
    x = valorX;
}


void establecerY(int valorY){
    y = valorY;
}

public static void main(String[] args) {
    Circulo circulo1 = new Circulo();

    circulo1.establecerX(10);
    circulo1.establecerY(20);

    System.out.println("El valor del atributo x es: " + circulo1.obtenerX());
    System.out.println("El valor del atributo y es: " + circulo1.obtenerY());


}
}